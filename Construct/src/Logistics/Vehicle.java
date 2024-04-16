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
    private double capacity;
    private boolean availability;

    // Constructor
    public Vehicle(String vehicleID, String type, double capacity, boolean availability) {
        this.vehicleID = vehicleID;
        this.type = type;
        this.capacity = capacity;
        this.availability = availability;
    }

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

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

}
