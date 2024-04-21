/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
;
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
import business.Role.AdCompanyRole;
import business.Role.AdManagerRole;
import business.Organization.QAOrganization;
import business.Organization.SupplierOrganization;
import business.Role.AdminRole;
import business.Role.LogisticsManagerRole;
import business.Role.RentalCompanyRole;
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
        
        LogisticsOrganization logorg = new LogisticsOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(logorg);
        
        AdvertisingOrganization adorg= new AdvertisingOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adorg);
        
        Employee employee = new Employee();
        employee.setName("Akeem of Zamunda");
        
        Employee employee1 = new Employee();
        employee1.setName("RentCompany");
        
        Employee employee2 = new Employee();
        employee2.setName("LogisticsManager");
        
        Employee employee3 = new Employee();
        employee3.setName("AdCompany");
        
        Employee employee4 = new Employee();
        employee4.setName("AdManager");
        
        Employee employee5 = new Employee();
        employee5.setName("AdCompany2");
        
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new AdminRole());
        account.setEmployee(employee);
        
        UserAccount account2 = new UserAccount();
        account2.setUsername("ola");
        account2.setPassword("ola");
        account2.setRole(new RentalCompanyRole()); // Custom role for rent company
        account2.setEmployee(employee1);

        UserAccount account3 = new UserAccount();
        account3.setUsername("logistics");
        account3.setPassword("logipass");
        account3.setRole(new LogisticsManagerRole()); // Custom role for logistics manager
        account3.setEmployee(employee2);

        UserAccount account4 = new UserAccount();
        account4.setUsername("adcompany");
        account4.setPassword("adpass");
        account4.setRole(new AdCompanyRole()); // Custom role for advertising company
        account4.setEmployee(employee3);

        UserAccount account5 = new UserAccount();
        account5.setUsername("admanager");
        account5.setPassword("managepass");
        account5.setRole(new AdManagerRole()); // Custom role for ad manager
        account5.setEmployee(employee4);

        UserAccount account6 = new UserAccount();
        account6.setUsername("adcompany2");
        account6.setPassword("ad2pass");
        account6.setRole(new AdCompanyRole()); // Assuming the same role as AdCompany
        account6.setEmployee(employee5);

        UserAccount account1 = new UserAccount();
        account1.setUsername("civil");
        account1.setPassword("civil");
        account1.setRole(new CivilEngineer());
        account1.setEmployee(employee);
        
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        logorg.getEmployeeDirectory().getEmployeeList().add(employee1);
        logorg.getEmployeeDirectory().getEmployeeList().add(employee2);
        logorg.getUserAccountDirectory().getUserAccountList().add(account2);
        logorg.getUserAccountDirectory().getUserAccountList().add(account3);
        
        adorg.getEmployeeDirectory().getEmployeeList().add(employee3);
        adorg.getEmployeeDirectory().getEmployeeList().add(employee4);
        adorg.getEmployeeDirectory().getEmployeeList().add(employee5);
        
        adorg.getUserAccountDirectory().getUserAccountList().add(account4);
        adorg.getUserAccountDirectory().getUserAccountList().add(account5);
        adorg.getUserAccountDirectory().getUserAccountList().add(account6);
        for(UserAccount usa:logorg.getUserAccountDirectory().getUserAccountList()){
        if(usa.getRole() instanceof RentalCompanyRole){
             RentalCompanyList blist= logorg.getRentalvehilist();
        
         RentalCompany rentalCompany = new RentalCompany(usa.getUsername());
         blist.addVehicle(rentalCompany, null);
        }}
        
        for(UserAccount usa:adorg.getUserAccountDirectory().getUserAccountList())
        {
        if(usa.getRole() instanceof AdCompanyRole)
        {
             MediaandAdoption media=adorg.getMediaadlist();
        
         MediaPartner adc = new MediaPartner(usa.getUsername());
         media.addAdOption(adc, null);
        }}
        

        SupplierOrganization supprg = new SupplierOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(supprg);
        
        QAOrganization qa=new QAOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(qa);
        
        Vehicle vehicle = new Vehicle("VH101", "Truck", 2.5, 20.0);

        
//        Vehicle vehicle = new Vehicle("VH101", "Truck", 2.5, 20.0);

        
        RentalCompany rentalCompany = new RentalCompany("Best Rentals");
//        rentalCompany.addVehicle(vehicle);
//        RentalCompanyList l1= new RentalCompanyList();
        RentalCompanyList r=logorg.getRentalvehilist();
        r.addVehicle(rentalCompany, vehicle);

        // Display available vehicles before booking
        System.out.println("Available vehicles before booking:");
//        r.displayAllVehicles();
        // Step 3: Book the vehicle for a specific order
//        BookingList b=logorg.getRentalvehilist();
//        rentalCompany.create("BK001", "ORD001", vehicle);
//                rentalCompany.create("BK002", "ORD002", vehicle);

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
