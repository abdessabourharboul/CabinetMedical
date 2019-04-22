/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Administrateur;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author asus
 */
public class AdministrateurHelper extends AbstractHelper<Administrateur> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("ID USER", "id"),
            new AbstractHelperItem("MOT DE PASSE", "pasword"),          
        };
    }

    public AdministrateurHelper(JTable jTable, List<Administrateur> list) {
        super(titres, jTable, list);
    }

    public AdministrateurHelper(JTable jTable) {
        super(titres, jTable);

    }
}
