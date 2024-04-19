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
    
    String siteName;
    String siteDetails;
    File xyz;
    ImageIcon Ii;

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    boolean Status = false;
    
    public ApplicationForm(String siteName,String siteDetails,File xyz,ImageIcon Ii){
        
        this.siteName = siteName;
        this.siteDetails = siteDetails;
        this.xyz=xyz;
        this.Ii=Ii;
        
        
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
