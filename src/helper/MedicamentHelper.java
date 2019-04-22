/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.FichePatient;
import bean.Medicament;
import bean.Ordonnance;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Yassine
 */
public class MedicamentHelper extends AbstractHelper<Medicament> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{new AbstractHelperItem("Nom du Médicament", "nom"),
            new AbstractHelperItem("Libelle", "libelle")

        };
    }

    public MedicamentHelper(JTable jTable, List<Medicament> list) {
        super(titres, jTable, list);
    }

    public MedicamentHelper(JTable jTable) {
        super(titres, jTable);

    }

}
