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
    private String companyID;
    private String companyName;
    private ArrayList<Vehicle> vehicleList;
    private ArrayList<Booking> bookings;

    // Constructor
    public RentalCompany(String companyID, String companyName) {
        this.companyID = companyID;
        this.companyName = companyName;
        this.vehicleList = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    // Getters and Setters
    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    // Method to book a vehicle if available
    public Booking bookVehicle(String vehicleID) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getVehicleID().equals(vehicleID) && vehicle.isAvailability()) {
                vehicle.setAvailability(false); // Mark the vehicle as unavailable
                Booking newBooking = new Booking("BKG" + (bookings.size() + 1), vehicle);
                bookings.add(newBooking);
                return newBooking;
            }
        }
        return null; // Return null if no vehicle is available or found
    }

    // Method to complete a booking
    public void completeBooking(String bookingID) {
        for (Booking booking : bookings) {
            if (booking.getBookingID().equals(bookingID) && booking.getStatus().equals("Pending")) {
                booking.setEndDate(new Date()); // Set the end date to today and status to completed
                booking.getVehicle().setAvailability(true); // Mark the vehicle as available again
            }
        }
    }

}
