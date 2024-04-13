/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advertising;

/**
 *
 * @author Ram
 */
public class AdvertisingOptions {
     private String optionID;
    private String description;
    private double costPerUnit;

    // Constructor
    public AdvertisingOptions(String optionID, String description, double costPerUnit) {
        this.optionID = optionID;
        this.description = description;
        this.costPerUnit = costPerUnit;
    }

    // Getters and Setters
    public String getOptionID() {
        return optionID;
    }

    public void setOptionID(String optionID) {
        this.optionID = optionID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }
}
