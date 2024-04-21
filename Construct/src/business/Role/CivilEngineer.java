/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import UI.Supplier.sendEmail;
import business.Business;
import business.Organization.Organization;
import business.Organization.SupplierOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author saisr
 */
public class CivilEngineer extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        return new sendEmail(userProcessContainer,account,(SupplierOrganization) organization,business );
    }
    
}
