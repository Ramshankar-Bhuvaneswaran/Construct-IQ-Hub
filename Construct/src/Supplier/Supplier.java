/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supplier;

import Supplier.ProductCatalog;

/**
 *
 * @author saisr
 */
public class Supplier {
    
    String Sname;
    ProductCatalog pc;
    
    
    public Supplier(String Sname){
        
        this.Sname = Sname;
       pc = new ProductCatalog();
        
    }

    public String getSname() {
        return Sname;
    }

    public ProductCatalog getPc() {
        return pc;
    }
    
//    public ProductCatalog newProductCatalog() {
//        
//        
//        return ProductCatalog;
//        
//        
//    }
    
    
}
