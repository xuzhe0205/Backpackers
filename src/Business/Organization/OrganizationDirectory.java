/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Hotel.getValue())){
            organization = new HotelOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CarRental.getValue())){
            organization = new CarRentalOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RailWay.getValue())){
            organization = new RailWayOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Airliner.getValue())){
            organization = new AirlinerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}