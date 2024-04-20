/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.AdManagerRole;
import business.Role.Role;
import java.util.ArrayList;
import QA.ApplicationFormDirectory;
import business.Role.QAengrole;

/**
 *
 * @author raunak
 */
public class QAOrganization extends Organization{

    public ApplicationFormDirectory getAfd() {
        return afd;
    }

    public void setAfd(ApplicationFormDirectory afd) {
        this.afd = afd;
    }
    ApplicationFormDirectory afd;
    
    
    

    public QAOrganization() {
        super(Organization.Type.QA.getValue());
        this.afd = new ApplicationFormDirectory();
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new QAengrole());
       
        return roles;
    }
     
}