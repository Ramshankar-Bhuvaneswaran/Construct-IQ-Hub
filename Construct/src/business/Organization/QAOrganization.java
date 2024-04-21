/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import QA.ApplicationForm;
import business.Role.Role;
import java.util.ArrayList;
import QA.ApplicationFormDirectory;
import business.Role.GovtOfficerRole;
import business.Role.QAengrole;

/**
 *
 * @author raunak
 */
public class QAOrganization extends Organization{

    public ApplicationFormDirectory getAFormDirectory() {
        return AFormDirectory;
    }

   
    
    ApplicationFormDirectory AFormDirectory;
    
    

    public ApplicationFormDirectory getAfd() {
        return AFormDirectory;
    }

    public void setAfd(ApplicationFormDirectory afd) {
        this.AFormDirectory = afd;
    }
 
    
    
   
    public QAOrganization() {
        super(Organization.Type.QA.getValue());
        this.AFormDirectory = new ApplicationFormDirectory();
        
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new QAengrole());
        roles.add(new GovtOfficerRole());
       
        return roles;
    }
     
}