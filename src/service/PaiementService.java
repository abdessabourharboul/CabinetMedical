/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Consultation;
import bean.Paiement;
import dao.PaiementDao;
import java.util.List;

/**
 *
 * @author Yassine
 */
public class PaiementService {

    PaiementDao paiementDao = new PaiementDao();

    public List<Paiement> findNonRegle() throws Exception {
        String requette = "select * from paiement where montantRestant is not null";
        return paiementDao.load(requette);
    }

    public int existe(Consultation c) throws Exception {
        List<Paiement> res;
        String requette = "select * from paiement where consultation=" + c.getId() + "";
        res = paiementDao.load(requette);
        if (res != null) {
            return -1;
        }
        return 1;
    }

    public List<Paiement> findFichePatientQuery(Double id, String t, String r) throws Exception {

        String requette = "select * from paiement where 1=1 ";
        if (id != 0) {
            requette += " AND  consultation = " + id + "";
        }

        if (t != null) {
            requette += " AND type like '%" + t + "%'";
        }
        if (r != null) {
            requette += " AND regle like '%" + r + "%'";
        }

        return paiementDao.load(requette);

    }

    public int save(Paiement p) throws Exception {
//        int res = existe(p.getConsultation());
//        if (res > 0) {
        return paiementDao.save(p);
//        }
//        return -2;
    }

    public List<Paiement> findAll() throws Exception {
        return paiementDao.findAll();
    }

    public int update(Paiement t) throws Exception {
        return paiementDao.update(t);
    }

    public int delete(Paiement t) throws Exception {
        return paiementDao.delete(t);
    }

}
