/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Consultation;
import bean.Paiement;

import dao.ConsultationDao;
import dao.PaiementDao;
import java.util.List;

/**
 *
 * @author Yassine
 */
public class ConsultationService {

    ConsultationDao consultationDao = new ConsultationDao();
    PaiementDao paiementDao = new PaiementDao();

    public int deleteConsuWithRDV(Consultation c) throws Exception {
        Consultation loaded = consultationDao.findById(c.getId());
        if (loaded != null) {
            String requette = "delete from paiement where consultation=" + loaded.getId() + "";
            paiementDao.execUpdate(requette);
            consultationDao.delete(loaded);
            return 1;
        }
        return -1;

    }

    public int creerConsultation(Consultation consultation) throws Exception {
        String requette = "insert into Consultation values(" + consultation.getId() + "" + consultation.getDate() + "" + consultation.getHeure() + "" + consultation.getLieu() + "" + consultation.getTaille() + "" + consultation.getTemperature() + "" + consultation.getPoids() + "" + consultation.getPouls() + "" + consultation.getTensionArtMax() + "" + consultation.getTensionArtMin() + "" + "" + consultation.getMotif() + "" + consultation.getType() + ")";
        consultationDao.execUpdate(requette);
        consultationDao.save(consultation);
        return 1;
    }

    public void deleteByNumD(String t) throws Exception {

        String requette = "select * from consultation where fichePatient ='" + t + "'";
        List<Consultation> res = consultationDao.load(requette);
        for (int i = 0; i < res.size(); i++) {
            Consultation get = res.get(i);
            res.remove(get);
        }

    }

    public Consultation findById(Object id) throws Exception {
        return consultationDao.findById(id);
    }

    public List<Consultation> findByDate(String t) throws Exception {
        String requette = "select * from consultation where date='" + t + "'";
        return consultationDao.load(requette);
    }

    public int save(Consultation t) throws Exception {
        return consultationDao.save(t);
    }

    public List<Consultation> findAll() throws Exception {
        return consultationDao.findAll();
    }

    public int update(Consultation t) throws Exception {
        return consultationDao.update(t);
    }

    public int delete(Consultation t) throws Exception {
        return consultationDao.delete(t);
    }

}
