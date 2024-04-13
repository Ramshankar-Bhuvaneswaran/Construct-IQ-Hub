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
    private Vehicle vehicle;
    private Date startDate;
    private Date endDate;
    private String status;

    // Constructor
    public Booking(String bookingID, Vehicle vehicle) {
        this.bookingID = bookingID;
        this.vehicle = vehicle;
        this.startDate = new Date(); // Set the start date to today
        this.endDate = null; // End date is initially not set
        this.status = "Pending";
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
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

    // Method to set the start date to today's date
    public void setStartDateToToday() {
        this.startDate = new Date(); // Resets the start date to the current date
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
        this.status = "Completed"; // Automatically update status to completed when end date is set
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Booking ID: " + bookingID + ", Vehicle ID: " + vehicle.getVehicleID() +
                           ", Start Date: " + startDate + ", End Date: " + (endDate != null ? endDate : "Not set") +
                           ", Status: " + status);
    }
}
