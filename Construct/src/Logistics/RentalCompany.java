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
    private ArrayList<Booking> bookings;

    // Constructor
    public RentalCompany( String companyName) {

        this.companyName = companyName;
        this.bookings = new ArrayList<>();
    }

    // Getters and Setters

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }
 

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public Booking create(String bookingID, String orderId, Vehicle vehicle){
        Booking a= new Booking(bookingID, orderId,  vehicle);
        bookings.add(a);
        
        return a;
             
    }
  
}

