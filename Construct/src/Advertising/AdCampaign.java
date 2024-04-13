/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advertising;

import java.util.Date;

/**
 *
 * @author Ram
 */
public class AdCampaign {
     private String campaignID;
    private String medium; // e.g., Digital, Print, Outdoor
    private Date startDate;
    private Date endDate;
    private double budget;

    // Constructor
    public AdCampaign(String campaignID, String medium, Date startDate, Date endDate, double budget) {
        this.campaignID = campaignID;
        this.medium = medium;
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
    }

    // Getters and Setters
    public String getCampaignID() {
        return campaignID;
    }

    public void setCampaignID(String campaignID) {
        this.campaignID = campaignID;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
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
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

  
}
