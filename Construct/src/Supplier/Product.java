/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supplier;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author saisr
 */
public class Product {
    
    private String name;
    
    private int price;
    private String productDescription;
    private ImageIcon xyz;
    ArrayList<OrderItem> orderitems;
    
    public Product( String n, int tp, String pd, ImageIcon xyz) {
     name=n;
     price = tp;
     productDescription=pd;
     orderitems = new ArrayList();
     this.xyz=xyz;
     
    }

    public String getProductDescription() {
        return productDescription;
    }

    public ImageIcon getXyz() {
        return xyz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void addOrderItem(OrderItem oi){     
        orderitems.add(oi);
    }

    public ArrayList<OrderItem> getOrderitems() {
        return orderitems;
    }

    public void setOrderitems(ArrayList<OrderItem> orderitems) {
        this.orderitems = orderitems;
    }
    
    

 
  
}