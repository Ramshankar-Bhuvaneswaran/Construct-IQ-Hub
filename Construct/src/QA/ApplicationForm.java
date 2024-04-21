/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QA;

import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author Ram
 */
public class ApplicationForm {
    
    private String siteName;
    private String siteDetails;
    private File xyz;
    private ImageIcon Ii;
    private String Status="Pending";
    
    

    public String isStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
    public ApplicationForm(String siteName,String siteDetails,ImageIcon Ii){
        
        this.siteName = siteName;
        this.siteDetails = siteDetails;
        this.Ii=Ii;
    
        
        
    }

    public ImageIcon getIi() {
        return Ii;
    }

    public void setIi(ImageIcon Ii) {
        this.Ii = Ii;
    }

    public String getSiteName() {
        return siteName;
    }

    public String getSiteDetails() {
        return siteDetails;
    }

    public File getXyz() {
        return xyz;
    }
    
}
