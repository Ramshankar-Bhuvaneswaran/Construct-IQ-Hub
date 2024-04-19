/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import UI.Logistics.bookingJPanel1;
import business.Business;
import business.Organization.LogisticsOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class LogisticsManagerRole extends Role {

    public LogisticsManagerRole() {
        this.type = RoleType.LogisticsManager;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.LogisticsManager;
        return new bookingJPanel1(userProcessContainer, account, (LogisticsOrganization) organization, business);
    }

}
