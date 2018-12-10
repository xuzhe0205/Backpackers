/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.RailWayRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chenweikai
 */
public class RailWayOrganization extends Organization {
    public RailWayOrganization() {
        super(Organization.Type.RailWay.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RailWayRole());
        return roles;
    }
}
