/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Paiement;
import bean.Rendez_Vous;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Yassine
 */
public class PaiementHelper extends AbstractHelper<Paiement> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{new AbstractHelperItem("Id-Consultation", "consultation"),
            new AbstractHelperItem("Montant", "montant"),
            new AbstractHelperItem("Type", "type"),
            new AbstractHelperItem("Montant Restant", "montantRestant"),
            new AbstractHelperItem("Reglé", "regle")
        };
    }

    public PaiementHelper(JTable jTable, List<Paiement> list) {
        super(titres, jTable, list);
    }

    public PaiementHelper(JTable jTable) {
        super(titres, jTable);

    }

}
