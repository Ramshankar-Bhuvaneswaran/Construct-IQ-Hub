/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QA;

import Supplier.OrderItem;
import Supplier.Product;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author saisr
 */
public class ApplicationFormDirectory {

    public ArrayList<ApplicationForm> getForms() {
        return Forms;
    }

    public void setForms(ArrayList<ApplicationForm> Forms) {
        this.Forms = Forms;
    }
    
    
    ArrayList<ApplicationForm> Forms;
    
    public ApplicationForm newApplicationForm(String siteName,String siteDetails,File file,ImageIcon xyz) {
        ApplicationForm af = new ApplicationForm(siteName,siteDetails,file,xyz);
        Forms.add(af);
        return af;
    }
    
    public ApplicationFormDirectory(){
        Forms = new ArrayList();
    }
}
