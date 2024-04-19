/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supplier;

import java.util.ArrayList;

//import model.CustomerManagement.CustomerProfile;
//import model.MarketModel.MarketChannelAssignment;
//import model.ProductManagement.Product;
//import model.SalesManagement.SalesPersonProfile;

/**
 *
 * @author kal bugrara
 */
public class Order {

    public ArrayList<OrderItem> getOrderitems() {
        return orderitems;
    }

    ArrayList<OrderItem> orderitems;
    private int orderid;

    String status;

    public Order(int orderid){
        orderitems = new ArrayList();
        this.orderid= orderid;
    }
    
    public OrderItem newOrderItem(Product p, int actualprice, int q) {
        OrderItem oi = new OrderItem(p, actualprice, q);
        orderitems.add(oi);
        return oi;
    }
    //order total is the sumer of the order item totals
    public int getOrderTotal() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.getOrderItemTotal();
        }
        return sum;
    }

//    public int getOrderPricePerformance() {
//        int sum = 0;
//        for (OrderItem oi : orderitems) {
//            sum = sum + oi.calculatePricePerformance();     //positive and negative values       
//        }
//        return sum;
//    }
//
//    public int getNumberOfOrderItemsAboveTarget() {
//        int sum = 0;
//        for (OrderItem oi : orderitems) {
//            if (oi.isActualAboveTarget() == true) {
//                sum = sum + 1;
//            }
//        }
//        return sum;
//    s}
public void deleteItem(OrderItem item)
    {
        
        orderitems.remove(item);     
    }
    
    
//    public OrderItem findProduct(Product product){
//        
//        for(OrderItem oi: this.getOrderItemList()){
//            
//            if(oi.getSelectedProduct().equals(product)){
//                return oi;
//            }
//        }
//        return null;
//    }
  
    //sum all the item targets and compare to the total of the order 
//    public boolean isOrderAboveTotalTarget(){
//        int sum = 0;
//        for (OrderItem oi: orderitems){
//            sum = sum + oi.getOrderItemTargetTotal(); //product targets are added
//        }
//        if(getOrderTotal()>sum) {return true;}
//        else {return false;}
//        
//    }
public void CancelOrder(){
    status = "Cancelled";
}
public void Submit(){
    status = "Submitted";
}
}
