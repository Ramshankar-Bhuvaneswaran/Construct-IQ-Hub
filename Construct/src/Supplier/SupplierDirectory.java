/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supplier;

import java.util.ArrayList;

/**
 *
 * @author saisr
 */
public class SupplierDirectory {

    public ArrayList<Supplier> getSuppliers() {
        return suppliers;
    }
    
    ArrayList<Supplier> suppliers;
    
     public SupplierDirectory(){
        suppliers = new ArrayList();
    }
    
    public Supplier findSupplier(String id){
        
        for (Supplier supplier: suppliers){
            
            if(supplier.getSname().equals(id)) 
                return supplier;
        }
        return null;
    
        }
    
    public Supplier newSupplier(String person002) {
    
        Supplier s = new Supplier(person002);
        suppliers.add(s);
        return s;

    }
    
}
