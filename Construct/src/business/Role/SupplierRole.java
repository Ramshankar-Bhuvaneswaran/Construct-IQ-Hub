/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import UI.Supplier.CreateNewProductJPanel;
import business.Business;
import business.Organization.Organization;
import business.Organization.SupplierOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author saisr
 */
public class SupplierRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        return  new CreateNewProductJPanel(userProcessContainer, account, (SupplierOrganization) organization  ,business);
    }
    
}
