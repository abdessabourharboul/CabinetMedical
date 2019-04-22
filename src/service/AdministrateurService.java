/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Administrateur;
import dao.AbstractDao;
import dao.AdministrateurDao;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class AdministrateurService extends AbstractDao<Administrateur> {

    Administrateur administrateur = new Administrateur();
    AdministrateurDao administrateurDao = new AdministrateurDao();

    public AdministrateurService() {
        super(Administrateur.class);
    }

    public Administrateur seConnecter(Administrateur administrateur) {
        try {
            Administrateur loadedAdministrateur = administrateurDao.findById(administrateur.getId());
            if (loadedAdministrateur == null) {
                return null;
            } else if (!loadedAdministrateur.getPasword().equals(administrateur.getPasword())) {
                return null;
            } else {
                return loadedAdministrateur;
            }

        } catch (Exception ex) {
            Logger.getLogger(AdministrateurService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}
