/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import UI.QA.SubmitApprovalForm;
import business.Business;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.LabAssistantRole.LabAssistantWorkAreaJPanel;
import business.Organization.QAOrganization;

/**
 *
 * @author saisr
 */
public class QAengrole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        
        return new SubmitApprovalForm(userProcessContainer, account, (QAOrganization) organization  , business);
        
    }
    
}
