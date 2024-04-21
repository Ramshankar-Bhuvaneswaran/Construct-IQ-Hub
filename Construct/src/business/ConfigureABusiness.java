/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import Advertising.AdvertisingOptions;
import Advertising.MediaPartner;
import Advertising.MediaandAdoption;
import Logistics.Booking;
import Logistics.BookingList;
import Logistics.RentalCompany;
import Logistics.RentalCompanyList;
import Logistics.Vehicle;
import Supplier.Product;
import Supplier.ProductCatalog;
import Supplier.Supplier;
import Supplier.SupplierDirectory;
import business.Employee.Employee;
import business.Organization.AdminOrganization;
import business.Organization.AdvertisingOrganization;
import business.Organization.LogisticsOrganization;
import business.Organization.QAOrganization;
import business.Organization.SupplierOrganization;
import business.Role.AdminRole;
import business.Role.CivilEngineer;
import business.UserAccount.UserAccount;
import java.awt.Component;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

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
        
        UserAccount account1 = new UserAccount();
        account1.setUsername("civil");
        account1.setPassword("civil");
        account1.setRole(new CivilEngineer());
        account1.setEmployee(employee);
        
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        LogisticsOrganization logorg = new LogisticsOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(logorg);
        
        AdvertisingOrganization adorg= new AdvertisingOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adorg);
        

        SupplierOrganization supprg = new SupplierOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(supprg);
        
        QAOrganization qa=new QAOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(qa);
        
        Vehicle vehicle = new Vehicle("VH101", "Truck", 2.5, 20.0);

        
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
//        rentalCompany.create("BK001", "ORD001", vehicle);
//                rentalCompany.create("BK002", "ORD002", vehicle);/\

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

        System.out.println("Campaign Performance Details:");
        
       SupplierDirectory sd= supprg.getSuppliers();
       Supplier s=sd.newSupplier("Hardware");
       ProductCatalog pc=s.getPc();
       ImageIcon image= new ImageIcon(ConfigureABusiness.class.getResource("/images/building.jpg"));
       Product p=pc.newProduct("Steel claw hammer",25,"16 oz weight, comfortable rubber grip, durable and perfect for general carpentry" , 500, image);
       
       
        
        
        return business;
        
        
    }
    public class ImageRenderer extends DefaultTableCellRenderer {
 
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof ImageIcon) {
                JLabel label = new JLabel();
                label.setIcon((ImageIcon) value);
                return label;
            }
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    }
    
}
