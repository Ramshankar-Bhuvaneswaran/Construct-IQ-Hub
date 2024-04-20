/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logistics;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ram
 */

public class RentalCompany {
   
    private String companyName;

    // Constructor
    public RentalCompany( String companyName) {

        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
//    public Booking create(String bookingID, String orderId, Vehicle vehicle){
//        Booking a= new Booking(bookingID, orderId,  vehicle);
//        bookings.add(a);
//        
//        return a;
//             
//    }
  
}

