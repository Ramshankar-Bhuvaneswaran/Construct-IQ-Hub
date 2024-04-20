/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import Advertising.AdCampaign;
import Advertising.AdCampaignList;
import Advertising.AdvertisingOptions;
import Advertising.CampaignPerformance;
import Advertising.MediaPartner;
import Advertising.MediaandAdoption;
import Logistics.Booking;
import Logistics.BookingList;
import Logistics.RentalCompany;
import Logistics.RentalCompanyList;
import Logistics.Vehicle;
import business.Employee.Employee;
import business.Organization.AdminOrganization;
import business.Organization.AdvertisingOrganization;
import business.Organization.LogisticsOrganization;
import business.Role.AdminRole;
import business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author neeraj
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        
        Business business = Business.getInstance();
        
        AdminOrganization adminOrganization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        Employee employee = new Employee();
        employee.setName("Akeem of Zamunda");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new AdminRole());
        account.setEmployee(employee);
        
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        LogisticsOrganization logorg = new LogisticsOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(logorg);
        
        AdvertisingOrganization adorg= new AdvertisingOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adorg);
        
        Vehicle vehicle = new Vehicle("VH101", "Truck", 2.5, 75.0);
        
        RentalCompany rentalCompany = new RentalCompany("Best Rentals");
//        rentalCompany.addVehicle(vehicle);
//        RentalCompanyList l1= new RentalCompanyList();
RentalCompanyList r=logorg.getRentalvehilist();
        r.addVehicle(rentalCompany, vehicle);

        // Display available vehicles before booking
        System.out.println("Available vehicles before booking:");
        r.displayAllVehicles();
        // Step 3: Book the vehicle for a specific order
//        BookingList b=logorg.getRentalvehilist();
        rentalCompany.create("BK001", "ORD001", vehicle);
                rentalCompany.create("BK002", "ORD002", vehicle);

//        rentalCompany.setBookings(booking);
//        rentalCompany.setBookings(booking2);
        
        
        
        System.out.println("Booking details after creation:");
        

        // Step 4: Simulate end of booking period and release the vehicle

        // Display available vehicles after booking is completed
        System.out.println("Available vehicles after booking completion:");
        
        MediaandAdoption m= adorg.getMediaadlist();
        
        AdvertisingOptions digital = new AdvertisingOptions("AD001", 500.00,"Newspaper","Adult");
        AdvertisingOptions print = new AdvertisingOptions("AD002",  300.00,"Magazine","Adult");
        
        
        // Step 2: Initialize a media partner and add advertising options
        MediaPartner partner = new MediaPartner("Global Ads Inc.");
        
        m.addAdOption(partner, print);
        // Display media partner details and available advertising options
        System.out.println("Media Partner and Advertising Options:");
//        partner.displayDetails();

// Step 3: Create an advertising campaign
        AdCampaignList adlistt= adorg.getAdcampaignlist();
        AdCampaign campaign = new AdCampaign("CAMP001", "Digital", new Date(), new Date(System.currentTimeMillis() + (1000 * 60 * 60 * 24 * 30)), 10000.00);
        
// Step 4: Track and display the performance of the campaign
        CampaignPerformance performance = new CampaignPerformance("PERF001", 15000, 500, 50);
        System.out.println("Campaign Performance Details:");
        
        return business;
    }
    
}
