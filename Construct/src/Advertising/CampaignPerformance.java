/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advertising;
import Advertising.AdCampaign;
/**
 *
 * @author Ram
 */
public class CampaignPerformance {
     
    private String campaignID;
    private int views;
    private int clicks;
    private AdCampaignList campaign;
    private int conversions;

    // Constructor
    public CampaignPerformance( String campaignID, int views, int clicks, int conversions) {
        
        this.campaignID = campaignID;
        this.views = views;
        this.clicks = clicks;
        this.conversions = conversions;
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
       public void displayCustomerAcquisitionCost() {
           for (AdCampaign n:campaign.adlist){
        if (conversions > 0) {
            double cac = n.getBudget() / conversions;
            System.out.println("Cost of Customer Acquisition (CAC): $" + String.format("%.2f", cac));
        } else {
            System.out.println("No conversions to calculate CAC.");
        }}
    }
}
