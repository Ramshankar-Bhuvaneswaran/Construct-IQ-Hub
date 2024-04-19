/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logistics;

/**
 *
 * @author Ram
 */
public class Vehicle {
    private String vehicleID;
    private String type;
    private double capacity; // This is the weight capacity in tons
    private double volumeCapacity; // Added new attribute for volume capacity in cubic meters
    private boolean availability;
    private double pricePerHour; // Added new attribute for pricing per hour

    // Updated Constructor
    public Vehicle(String vehicleID, String type, double capacity, double volumeCapacity, double pricePerHour) {
        this.vehicleID = vehicleID;
        this.type = type;
        this.capacity = capacity;
        this.volumeCapacity = volumeCapacity;
        this.availability = true; // Vehicles are available by default
        this.pricePerHour = pricePerHour;
    }

    // Getters and Setters
    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getVolumeCapacity() {
        return volumeCapacity;
    }

    public void setVolumeCapacity(double volumeCapacity) {
        this.volumeCapacity = volumeCapacity;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleID + ", Type: " + type + 
                           ", Capacity: " + capacity + " tons, Volume: " + volumeCapacity + " m³" +
                           ", Availability: " + (availability ? "Available" : "Not Available") +
                           ", Price per Hour: $" + pricePerHour);
    }
}

