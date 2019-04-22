/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Medicament;
import bean.Ordonnance;
import dao.MedicamentDao;
import dao.OrdonnanceDao;
import java.util.List;

/**
 *
 * @author Yassine
 */
public class MedicamentService {

    MedicamentDao medicamentDao = new MedicamentDao();

    public List<Medicament> findByNom(String t) throws Exception {
        String requette = "select * from medicament where nom like '%" + t + "%'";
        return medicamentDao.load(requette);
    }

    public int save(Medicament t) throws Exception {
        return medicamentDao.save(t);
    }

    public List<Medicament> findAll() throws Exception {
        return medicamentDao.findAll();
    }

    public int update(Medicament t) throws Exception {
        return medicamentDao.update(t);
    }

    public int delete(Medicament t) throws Exception {
        return medicamentDao.delete(t);
    }

}
