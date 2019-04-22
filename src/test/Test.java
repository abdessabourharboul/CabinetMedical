/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import bean.Ordonnance;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import util.Config;
import util.JasperUtil;

/**
 *
 * @author Mehdi
 */
public class Test {

    public static void main(String[] args) throws FileNotFoundException, JRException, IOException {

        List<Ordonnance> ordonnances = new ArrayList<Ordonnance>();
//        User u1 = new User("user1", "prennom1", 10);
//        User u2 = new User("user2", "prennom2", 20);
//        User u3 = new User("user3", "pren3", 33);
//
//        users.add(u1);
//        users.add(u2);
//        users.add(u3);

        Map params = new HashMap();
        params.put("provider", "provider");
        // JasperUtil.generatePDFUser(users, params, Config.getCheminExport(), Config.getCheminJasper(), 1);
//            InputStream reportSource = null;
//            JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(users);
//            reportSource = new FileInputStream(Config.getCheminJasper());
//            JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource, params, beanCollectionDataSource);
//            JasperExportManager.exportReportToPdfFile(jasperPrint, "D:\\monpremierpdf.pdf");
//            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler D:\\monpremierpdf.pdf");
//            reportSource.close();
        JasperUtil.generatePdf(ordonnances, Config.getCheminJasper(), Config.getCheminExport(), params, true);

    }

}
