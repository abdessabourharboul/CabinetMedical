/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Ordonnance;
import dao.OrdonnanceDao;
import java.util.List;

/**
 *
 * @author Yassine
 */
public class OrdonnanceService {

    OrdonnanceDao ordonnanceDao = new OrdonnanceDao();

    public int save(Ordonnance t) throws Exception {
        return ordonnanceDao.save(t);
    }

    public List<Ordonnance> findAll() throws Exception {
        return ordonnanceDao.findAll();
    }

    public int update(Ordonnance t) throws Exception {
        return ordonnanceDao.update(t);
    }

    public int delete(Ordonnance t) throws Exception {
        return ordonnanceDao.delete(t);
    }

}
