/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advertising;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Ram
 */
public class MediaandAdoption {

    public HashMap<MediaPartner, List<AdvertisingOptions>> getPartnerAdOptions() {
        return partnerAdOptions;
    }
      private HashMap<MediaPartner, List<AdvertisingOptions>> partnerAdOptions;
//      Construct s;
        public MediaandAdoption() {
//            this.s=s;
        this.partnerAdOptions = new HashMap<>();
        
    } 
    public void addAdOption(MediaPartner partner, AdvertisingOptions adOption) {
        // Check if the media partner already exists in the map
        List<AdvertisingOptions> options = partnerAdOptions.get(partner);
        if (options == null) {
            options = new ArrayList<>();
            partnerAdOptions.put(partner, options);
        }
        options.add(adOption);
    }

    // Method to get advertising options for a specific media partner
    public List<AdvertisingOptions> getAdOptions(MediaPartner partner) {
        return partnerAdOptions.getOrDefault(partner, new ArrayList<>());
    }

    // Method to display all media partners and their advertising options
    public void displayAll() {
        for (MediaPartner partner : partnerAdOptions.keySet()) {
            System.out.println("Media Partner: " + partner.getPartnerName());
            List<AdvertisingOptions> options = partnerAdOptions.get(partner);
            for (AdvertisingOptions option : options) {
                System.out.println("\tAdvertising Option: " + option.getOptionID() + ", Cost: $" + option.getCostPerUnit());
            }
        }
    }
    public void removeAdOption(MediaPartner partner, AdvertisingOptions adOption) {
        List<AdvertisingOptions> options = partnerAdOptions.get(partner);
        if (options != null) {
            options.remove(adOption);
            // Remove the entry if no advertising options are left
            if (options.isEmpty()) {
                partnerAdOptions.remove(partner);
            }
        }
    }
}
