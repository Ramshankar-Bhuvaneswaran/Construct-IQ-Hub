/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Organization.SupplierOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdManagerRole extends Role {

    public AdManagerRole() {
        this.type = RoleType.AdManager;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.AdManager;
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (SupplierOrganization) organization, business);
    }

}