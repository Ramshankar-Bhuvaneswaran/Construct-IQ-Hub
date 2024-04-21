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
    
     ArrayList<ApplicationForm> Forms;
     
     
      public ApplicationFormDirectory(){
        Forms = new ArrayList();
    }

    public ArrayList<ApplicationForm> getForms() {
        return Forms;
    }

   
    
    public ApplicationForm newApplicationForm(String siteName,String siteDetails,ImageIcon xyz) {
        ApplicationForm af = new ApplicationForm(siteName,siteDetails,xyz);
        Forms.add(af);
        return af;
    }
    
   
}
