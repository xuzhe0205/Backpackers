/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HotelRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Will Chen
 */
public class HotelOrganization extends Organization{

    public HotelOrganization() {
        super(Organization.Type.Hotel.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HotelRole());
        return roles;
    }
     
}