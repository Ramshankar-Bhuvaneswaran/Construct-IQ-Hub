/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logistics;

import java.util.Date;

/**
 *
 * @author Ram
 */
public class Booking {
    private String bookingID;
    private String orderId;  // Variable to link to an Order
    private Vehicle vehicle;
    private Date startDate;
    private Date endDate;
    private String status;

    public Booking(String bookingID, String orderId, Vehicle vehicle) {
        this.bookingID = bookingID;
        this.orderId = orderId; // Initialize orderId
        this.vehicle = vehicle;
        this.startDate = new Date(); // Set the start date to today
        this.endDate = null; // End date is initially not set
        this.status = "Pending";
        this.vehicle.setAvailability(false); // Set the vehicle as not available when booked
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
        this.status = "Completed"; // Automatically update status to completed when end date is set
        this.vehicle.setAvailability(true); // Set the vehicle as available again when booking ends
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Display booking details
    public void displayBookingDetails() {
        System.out.println("Booking ID: " + bookingID + ", Order ID: " + orderId +
                           ", Vehicle ID: " + vehicle.getVehicleID() +
                           ", Start Date: " + startDate + ", End Date: " + (endDate != null ? endDate : "Not set") +
                           ", Status: " + status);
    }
}
