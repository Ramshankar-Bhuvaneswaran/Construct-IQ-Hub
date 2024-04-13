/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advertising;

/**
 *
 * @author Ram
 */
public class CampaignPerformance {
     private String performanceID;
    private String campaignID;
    private int views;
    private int clicks;
    private int conversions;

    // Constructor
    public CampaignPerformance(String performanceID, String campaignID, int views, int clicks, int conversions) {
        this.performanceID = performanceID;
        this.campaignID = campaignID;
        this.views = views;
        this.clicks = clicks;
        this.conversions = conversions;
    }

    // Getters and Setters
    public String getPerformanceID() {
        return performanceID;
    }

    public void setPerformanceID(String performanceID) {
        this.performanceID = performanceID;
    }

    public String getCampaignID() {
        return campaignID;
    }

    public void setCampaignID(String campaignID) {
        this.campaignID = campaignID;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public int getConversions() {
        return conversions;
    }

    public void setConversions(int conversions) {
        this.conversions = conversions;
    }
}
