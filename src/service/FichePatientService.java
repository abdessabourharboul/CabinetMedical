/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.FichePatient;
import dao.ConsultationDao;
import dao.FichePatientDao;
import dao.OrdonnanceDao;
import dao.PaiementDao;

import java.util.List;

/**
 *
 * @author Yassine
 */
public class FichePatientService {

    FichePatientDao fichePatientDao = new FichePatientDao();

    public FichePatient findByNomPrenom(String nom, String prenom) throws Exception {
        String requette = "select * from fichepatient where nom ='" + nom + "' and prenom ='" + prenom + "'";
        List<FichePatient> res = fichePatientDao.load(requette);
        if (res != null) {

            return res.get(0);
        }
        return null;
    }

    public List<FichePatient> findFichePatientQuery(String id, String nom, String prenom) throws Exception {

        String requette = "select * from fichePatient where 1=1 ";
        if (id != null) {
            requette += " AND  id like '%" + id + "%'";
        }

        if (nom != null) {
            requette += " AND Nom like '%" + nom + "%'";
        }
        if (prenom != null) {
            requette += " AND Prenom like '%" + prenom + "%'";
        }

        return fichePatientDao.load(requette);

    }
    ConsultationDao consultationDao = new ConsultationDao();
    OrdonnanceDao ordonnanceDao = new OrdonnanceDao();
    PaiementDao paiementDao = new PaiementDao();

    public int deleteFicheWithConsultationAndOrdon(FichePatient ficheP) throws Exception {
        FichePatient loadedFiche = fichePatientDao.findById(ficheP.getId());
        if (loadedFiche != null) {
            String requette = "delete from consultation where fichePatient='" + loadedFiche.getId() + "'";
            consultationDao.execUpdate(requette);
            String requette2 = "delete from ordonnance where fichePatient='" + loadedFiche.getId() + "'";
            ordonnanceDao.execUpdate(requette2);
            String requette3 = "delete from paiement where consultation=" + loadedFiche.getConsulations() + "";
            paiementDao.execUpdate(requette3);
            fichePatientDao.delete(loadedFiche);
            return 1;
        }
        return -1;

    }

    public FichePatient findById(String t) throws Exception {
        return fichePatientDao.findById(t);
    }

    public int save(FichePatient t) throws Exception {
        return fichePatientDao.save(t);
    }

    public List<FichePatient> findAll() throws Exception {
        return fichePatientDao.findAll();
    }

    public int update(FichePatient t) throws Exception {
        return fichePatientDao.update(t);
    }

    public int delete(FichePatient t) throws Exception {
        return fichePatientDao.delete(t);
    }

}
