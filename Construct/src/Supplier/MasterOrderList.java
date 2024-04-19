/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supplier;

import java.util.ArrayList;

//import model.CustomerManagement.CustomerProfile;
//import model.MarketingManagement.MarketingPersonProfile;
//import model.SalesManagement.SalesPersonProfile;

/**
 *
 * @author kal bugrara
 */
public class MasterOrderList {
    ArrayList<Order> orders;
    private int nextorderid=1;

    public ArrayList<Order> getOrders() {
        return orders;
    }
    MasterOrderReport masterorderreport;
    
    public MasterOrderList(){
        orders = new ArrayList();
       
    }
    
    
    public Order newOrder(){
        Order o= new Order(nextorderid++);
        orders.add(o);
        return o;
            
 
    }
    
    
    public MasterOrderReport generateMasterOrderReport(){
    masterorderreport = new MasterOrderReport();
        
    return masterorderreport;
        
}

public int getSalesVolume(){

int sum = 0;
for(Order order: orders){
    sum = sum + order.getOrderTotal();
}
return sum;
    }

}
