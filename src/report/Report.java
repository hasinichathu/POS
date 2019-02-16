package report;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import database.Connect;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.type.OrientationEnum;
import net.sf.jasperreports.engine.type.WhenNoDataTypeEnum;
import net.sf.jasperreports.view.JasperViewer;


public class Report {

    public String reportDir = System.getProperty("user.dir")+"\\Reports\\";

   
 public void generateReport(String reportname, Map params) {
        try {


            JasperReport jr = JasperCompileManager.compileReport(reportDir + reportname);


            jr.setWhenNoDataType(WhenNoDataTypeEnum.NO_PAGES);

            JasperPrint jp = JasperFillManager.fillReport(jr, params, new Connect().Conn());
            jp.setOrientation(OrientationEnum.PORTRAIT);
            List<JRPrintPage> p = jp.getPages();

            if (!p.isEmpty()) {

                JasperViewer.viewReport(jp, false);

            } else {
                JOptionPane.showMessageDialog(null, "NO PAGES !!!!");

            }

        } catch (JRException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }



    }
}
