/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.FichePatient;
import bean.Ordonnance;
import bean.Rendez_Vous;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Yassine
 */
public class Rendez_VousHelper extends AbstractHelper<Rendez_Vous> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{new AbstractHelperItem("Numéro Dossier", "fichePatient"),
            new AbstractHelperItem("Date RDV", "date"),
            new AbstractHelperItem("Debut RDV", "heureDebut"),
            new AbstractHelperItem("Durée", "duree"),
            new AbstractHelperItem("Fin RDV", "heureFin"),
            new AbstractHelperItem("Type", "type")
        };
    }

    public Rendez_VousHelper(JTable jTable, List<Rendez_Vous> list) {
        super(titres, jTable, list);
    }

    public Rendez_VousHelper(JTable jTable) {
        super(titres, jTable);

    }

}
