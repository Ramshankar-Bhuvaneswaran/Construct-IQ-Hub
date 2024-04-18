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
    private double costPerUnit;
    private String platformType; // e.g., Online, Print, Outdoor
    private String targetAudience; // e.g., Adults, Teenagers, Business Professionals

    // Updated Constructor
    public AdvertisingOptions(String optionID,  double costPerUnit, 
                             String platformType, String targetAudience) {
        this.optionID = optionID;
       
        this.costPerUnit = costPerUnit;
        this.platformType = platformType;
        this.targetAudience = targetAudience;
    }

    // Getters and Setters
    public String getOptionID() {
        return optionID;
    }

    public void setOptionID(String optionID) {
        this.optionID = optionID;
    }


    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    // Method to display advertising option details
    public void displayDetails() {
        System.out.println("Option ID: " + optionID + 
                           ", Cost Per Unit: $" + costPerUnit + ", Platform Type: " + platformType +
                           ", Target Audience: " + targetAudience);
    }
}

