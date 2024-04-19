/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advertising;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ram
 */
public class SelectAdOptionList implements Iterable<AdvertisingOptions> {
//      Construct c;
    ArrayList<AdvertisingOptions> adlist;

    public ArrayList<AdvertisingOptions> getAdlist() {
        return adlist;
    }

    public void setAdlist(ArrayList<AdvertisingOptions> adlist) {
        this.adlist = adlist;
    }
    public SelectAdOptionList() {
//     this.c=C;
     adlist= new ArrayList<>();
    }
     // Method to add an AdvertisingOptions object to the adlist
    public void addAdOption(AdvertisingOptions adOption) {
        adlist.add(adOption);
    }

    // Method to remove an AdvertisingOptions object by index
    public void removeAdOption(int index) {
        if (index >= 0 && index < adlist.size()) {
            adlist.remove(index);
        } else {
            System.out.println("Invalid index: " + index);
        }
    }

    // Method to remove an AdvertisingOptions object by reference
    public boolean removeAdOption(AdvertisingOptions adOption) {
        return adlist.remove(adOption);
    }
      @Override
    public Iterator<AdvertisingOptions> iterator() {
        return adlist.iterator();
    }
}
