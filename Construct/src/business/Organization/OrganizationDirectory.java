/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Advertising.getValue())){
            organization = new AdvertisingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Logistics.getValue())){
            organization = new LogisticsOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.QA.getValue())){
            organization = new QAOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Supplier.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}