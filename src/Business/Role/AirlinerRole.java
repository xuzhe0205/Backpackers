/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

/**
 *
 * @author Oliver
 */
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.Airliner.ManageAirlinerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Oliver
 */
public class AirlinerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ManageAirlinerJPanel(userProcessContainer, account, organization, business);
    }
    
}