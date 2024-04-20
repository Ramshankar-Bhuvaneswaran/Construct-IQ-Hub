/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import UI.QA.GovermentApplication;
import UI.QA.SubmitApprovalForm;
import business.Business;
import business.Organization.Organization;
import business.Organization.QAOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author saisr
 */
public class GovtOfficerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        return new  GovermentApplication(userProcessContainer, account, (QAOrganization) organization  , business);
    }
    
}
