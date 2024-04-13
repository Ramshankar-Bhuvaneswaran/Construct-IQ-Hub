/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advertising;

//import java.awt.List;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ram
 */
public class MediaPartner {
    private String partnerID;
    private String partnerName;
    private List<AdvertisingOptions> advertisingOptions;

    // Constructor
    public MediaPartner(String partnerID, String partnerName) {
        this.partnerID = partnerID;
        this.partnerName = partnerName;
        this.advertisingOptions = new ArrayList<>();
    }

    // Getters and Setters
    public String getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(String partnerID) {
        this.partnerID = partnerID;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

//    public List<AdvertisingOptions> getAdvertisingOptions() {
//        return advertisingOptions;
//    }

    public void addAdvertisingOption(AdvertisingOptions option) {
        advertisingOptions.add(option);
    }
}
