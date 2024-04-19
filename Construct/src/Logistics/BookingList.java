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
public class BookingList implements Iterable<Booking>{
    ArrayList<Booking> bookings;

    public BookingList() {
//    this.c=c;
    bookings=new ArrayList<>();
    }

     // Method to create a booking
    
    @Override
    public Iterator<Booking> iterator(){
    return bookings.iterator();
    }
}
