/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.FichePatient;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Yassine
 */
public class FichePatientHelper extends AbstractHelper<FichePatient> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{new AbstractHelperItem("Numéro Dossier", "id"),
            new AbstractHelperItem("Nom de famille", "nom"),
            new AbstractHelperItem("Prénom", "prenom"),
            new AbstractHelperItem("Date de naissance", "dateNaissance")
        };
    }

    public FichePatientHelper(JTable jTable, List<FichePatient> list) {
        super(titres, jTable, list);
    }

    public FichePatientHelper(JTable jTable) {
        super(titres, jTable);

    }

}
