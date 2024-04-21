/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import UI.Advertisment.AdCompany;
import business.Business;
import business.Organization.AdvertisingOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdCompanyRole extends Role {

    public AdCompanyRole() {
        this.type = RoleType.AdCompany;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.AdCompany;
        return new AdCompany(userProcessContainer, account, (AdvertisingOrganization) organization);
    }

}
