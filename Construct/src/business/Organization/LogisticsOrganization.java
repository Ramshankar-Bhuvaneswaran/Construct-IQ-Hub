/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import Logistics.BookingList;
import Logistics.RentalCompanyList;
import business.Role.LogisticsManagerRole;
import business.Role.RentalCompanyRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class LogisticsOrganization extends Organization{
    
    BookingList booking;
    RentalCompanyList rentalvehilist;
    public LogisticsOrganization() {
        super(Organization.Type.Logistics.getValue());
           booking=  new BookingList();
        rentalvehilist=new RentalCompanyList();
     
    }

    public BookingList getBooking() {
        return booking;
    }

    public void setBooking(BookingList booking) {
        this.booking = booking;
    }

    public RentalCompanyList getRentalvehilist() {
        return rentalvehilist;
    }

    public void setRentalvehilist(RentalCompanyList rentalvehilist) {
        this.rentalvehilist = rentalvehilist;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LogisticsManagerRole());
                roles.add(new RentalCompanyRole());

        return roles;
    }
     
}