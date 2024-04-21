/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advertising;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ram
 */
public class SelectAdOptionList implements Iterable<AdvertisingOptions> {
//      Construct c;
     public HashMap<MediaPartner, List<AdvertisingOptions>> getPartnerAdOptions() {
        return SelectedAdOptions;
    }
      private HashMap<MediaPartner, List<AdvertisingOptions>> SelectedAdOptions;

    public SelectAdOptionList() {
//     this.c=C;
     this.SelectedAdOptions= new HashMap<>();
    }
     // Method to add an AdvertisingOptions object to the adlist
    
    public void addAdOption(MediaPartner partner, AdvertisingOptions adOption) {
        // Check if the media partner already exists in the map
        List<AdvertisingOptions> options = SelectedAdOptions.get(partner);
        if (options == null) {
            options = new ArrayList<>();
            SelectedAdOptions.put(partner, options);
        }
        options.add(adOption);
    }
   public void removeAdOption(MediaPartner partner, AdvertisingOptions adOption) {
        List<AdvertisingOptions> options = SelectedAdOptions.get(partner);
        if (options != null) {
            options.remove(adOption);
            // Optionally, clean up the map entry if the list is now empty
            if (options.isEmpty()) {
                SelectedAdOptions.remove(partner);
            }
        }
    }
    // Method to remove an AdvertisingOptions object by reference
   
         @Override
    public Iterator<AdvertisingOptions> iterator() {
        List<AdvertisingOptions> allAds = new ArrayList<>();
        for (List<AdvertisingOptions> options : SelectedAdOptions.values()) {
            allAds.addAll(options);
        }
        return allAds.iterator();
    }
}
