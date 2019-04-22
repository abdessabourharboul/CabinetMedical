/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Rendez_Vous;
import dao.Rendez_VousDao;
import java.util.List;

/**
 *
 * @author Yassine
 */
public class Rendez_VousService {

    Rendez_VousDao rendez_VousDao = new Rendez_VousDao();

    public void deleteByNumD(String t) throws Exception {

        String requette = "select * from rendez_Vous where fichePatient ='" + t + "'";
        List<Rendez_Vous> res = rendez_VousDao.load(requette);
        for (int i = 0; i < res.size(); i++) {
            Rendez_Vous get = res.get(i);
            res.remove(get);
        }

    }

    public String calculHeureFin(int heure, int min, Double duree) {
        String heurefin;
        Double minFin = min + duree;
        if (minFin >= 60) {
            heure++;
            minFin = minFin - 60;
        }
        heurefin = "-" + heure + "h" + minFin + "-";
        return heurefin;
    }

    public List<Rendez_Vous> findByDate(String t) throws Exception {
        String requette = "select * from rendez_vous where date='" + t + "'";
        return rendez_VousDao.load(requette);
    }

    public int save(Rendez_Vous t) throws Exception {
        return rendez_VousDao.save(t);
    }

    public List<Rendez_Vous> findAll() throws Exception {
        return rendez_VousDao.findAll();
    }

    public int update(Rendez_Vous t) throws Exception {
        return rendez_VousDao.update(t);
    }

    public int delete(Rendez_Vous t) throws Exception {
        return rendez_VousDao.delete(t);
    }

}
