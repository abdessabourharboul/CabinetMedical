/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Consultation;
import bean.FichePatient;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Yassine
 */
public class ConsultationHelper extends AbstractHelper<Consultation> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("Id", "id"),
            new AbstractHelperItem("Num dossier", "fichePatient"),
            new AbstractHelperItem("Date consultation", "date"),
            new AbstractHelperItem("Lieu ", "lieu"),
            new AbstractHelperItem("Type consultation", "type")
        };
    }

    public ConsultationHelper(JTable jTable, List<Consultation> list) {
        super(titres, jTable, list);
    }

    public ConsultationHelper(JTable jTable) {
        super(titres, jTable);

    }

}
