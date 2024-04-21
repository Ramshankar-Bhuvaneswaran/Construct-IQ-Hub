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
     public List<AdvertisingOptions> getPartnerAdOptions() {
        return SelectedAdOptions;
    }
      private ArrayList<AdvertisingOptions> SelectedAdOptions;

    public SelectAdOptionList() {
//     this.c=C;
     this.SelectedAdOptions= new ArrayList<>();
    }
     // Method to add an AdvertisingOptions object to the adlist
     
     // Method to add an AdvertisingOptions object to the adlist
    public void addAdOption(AdvertisingOptions adOption) {
        SelectedAdOptions.add(adOption);
    }

    // Method to remove an AdvertisingOptions object by reference
    public void removeAdOption(AdvertisingOptions adOption) {
        SelectedAdOptions.remove(adOption);
    }

    // Method to get the list of all advertising options
    public List<AdvertisingOptions> getSelectedAdOptions() {
        return SelectedAdOptions;
    }

    // Implementing the Iterable interface to allow for each loops over AdvertisingOptions
    @Override
    public Iterator<AdvertisingOptions> iterator() {
        return SelectedAdOptions.iterator();
    }

}
