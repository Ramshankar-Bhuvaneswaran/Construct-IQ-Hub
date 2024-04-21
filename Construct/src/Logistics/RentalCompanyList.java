/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logistics;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author Ram
 */

public class RentalCompanyList {
//    Construct c;
    private HashMap<RentalCompany, List<Vehicle>> vehiclesByCompany;
  
    public RentalCompanyList() {
//        this.c=c;
        this.vehiclesByCompany = new HashMap<>();
        
      
    }

    public void setVehiclesByCompany(HashMap<RentalCompany, List<Vehicle>> vehiclesByCompany) {
        this.vehiclesByCompany = vehiclesByCompany;
    }
 // Method to add a vehicle to a rental company
    public HashMap<RentalCompany, List<Vehicle>> addVehicle(RentalCompany company, Vehicle vehicle) {
        List<Vehicle> vehicles = vehiclesByCompany.getOrDefault(company, new ArrayList<>());
        vehicles.add(vehicle);
        vehiclesByCompany.putIfAbsent(company, vehicles);
        return vehiclesByCompany;
    }

    // Method to get the list of vehicles offered by a specific rental company
    public List<Vehicle> getVehicles(RentalCompany company) {
        return vehiclesByCompany.getOrDefault(company, new ArrayList<>());
    }

    // Display all rental companies and their vehicles
    public void displayAllVehicles() {
        for (RentalCompany company : vehiclesByCompany.keySet()) {
            System.out.println("Rental Company: " + company.getCompanyName());
            List<Vehicle> vehicles = vehiclesByCompany.get(company);
            for (Vehicle vehicle : vehicles) {
                System.out.println("\tVehicle ID: " + vehicle.getVehicleID() + ", Type: " + vehicle.getType());
            }
        }
    }

    public HashMap<RentalCompany, List<Vehicle>> getVehiclesByCompany() {
        return vehiclesByCompany;
    }
    public void removeVehicle(RentalCompany company, Vehicle vehicle) {
        List<Vehicle> vehicles = vehiclesByCompany.get(company);
        if (vehicles != null) {
            vehicles.remove(vehicle);
            // Optionally, remove the company entry if no vehicles are left
            if (vehicles.isEmpty()) {
                vehiclesByCompany.remove(company);
            }
        }
    }
    
}

