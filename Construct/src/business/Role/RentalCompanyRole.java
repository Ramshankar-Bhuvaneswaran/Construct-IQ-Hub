/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;


import UI.Logistics.RentalCompany1;
import business.Business;
import business.Organization.LogisticsOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RentalCompanyRole extends Role {

    public RentalCompanyRole() {
        this.type = RoleType.RentalCompany;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.RentalCompany;
        return new RentalCompany1(userProcessContainer, account, (LogisticsOrganization) organization);
    }

}
