/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import Supplier.MasterOrderList;
import business.Role.AdManagerRole;
import business.Role.Role;
import java.util.ArrayList;
import Supplier.ProductCatalog;
import Supplier.SupplierDirectory;
import business.Role.CivilEngineer;
import business.Role.SupplierRole;

/**
 *
 * @author raunak
 */
public class SupplierOrganization extends Organization{
    
    

    public MasterOrderList getMasterorderlist() {
        return masterorderlist;
    }

    public void setMasterorderlist(MasterOrderList masterorderlist) {
        this.masterorderlist = masterorderlist;
    }

    public SupplierDirectory getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(SupplierDirectory suppliers) {
        this.suppliers = suppliers;
    }

    public ProductCatalog getPc() {
        return pc;
    }

    public void setPc(ProductCatalog pc) {
        this.pc = pc;
    }
    
    MasterOrderList masterorderlist;
    SupplierDirectory suppliers;
        ProductCatalog pc;

    public SupplierOrganization() {
        
        super(Organization.Type.Supplier.getValue());
        masterorderlist = new MasterOrderList();
        suppliers = new SupplierDirectory();
        pc = new ProductCatalog();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierRole());
        roles.add(new CivilEngineer());
        return roles;
    }
    
    
    
    
}