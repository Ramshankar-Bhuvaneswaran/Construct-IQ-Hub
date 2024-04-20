/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import UI.Advertisment.AdCompany;
import UI.Advertisment.AdManage;
import business.Business;
import business.Organization.AdvertisingOrganization;
import business.Organization.SupplierOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author saisr
 */
public class AdManagerRole extends Role {

    public AdManagerRole() {
        this.type = RoleType.AdManager;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.AdManager;
        return new AdManage(userProcessContainer, account, (AdvertisingOrganization) organization, business);
    }

}
