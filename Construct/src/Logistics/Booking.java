/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logistics;

import java.util.Date;

/**
 *
 * @author Ram
 */
public class Booking {
    private RentalCompanyList list;

    
    private Date startDate;
    private Date endDate;

    public Booking( RentalCompanyList list,Date s,Date e) {
        this.list = list;
        this.startDate = s;
        this.endDate =e; 
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
        // Set the vehicle as available again when booking ends
    }
}
