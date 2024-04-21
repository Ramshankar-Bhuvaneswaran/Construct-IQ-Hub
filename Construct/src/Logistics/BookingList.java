/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logistics;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author Ram
 */
public class BookingList{
    ArrayList<Booking> bookings;

    public ArrayList<Booking> getBookings() {
    
        return bookings;
    }
    int bookingid;
    
    public BookingList() 
    {
    bookings=new ArrayList<>();
    }

     // Method to create a booking
    public Booking newbook(RentalCompanyList list,Date s,Date e)
    {
        Booking b= new Booking(list,s,e);
        bookings.add(b);
        return b;
    }
    
//    @Override
//    public Iterator<Booking> iterator(){
//    return bookings.iterator();
//    }
}
