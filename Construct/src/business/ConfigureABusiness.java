/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
import Advertising.AdvertisingOptions;









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
import business.Role.RentalCompanyRole;
import business.UserAccount.UserAccount;
import java.awt.Component;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import Advertising.AdvertisingOptions;
import Advertising.MediaPartner;
import Advertising.MediaandAdoption;
import Logistics.Booking;
import Logistics.BookingList;
import Logistics.RentalCompany;
import Logistics.RentalCompanyList;
import Logistics.Vehicle;
import QA.ApplicationForm;
import QA.ApplicationFormDirectory;
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

import business.Role.AdCompanyRole;
import business.Role.AdManagerRole;
import business.Role.AdminRole;
import business.Role.CivilEngineer;
import business.Role.GovtOfficerRole;
import business.Role.LogisticsManagerRole;
import business.Role.RentalCompanyRole;
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
        
        Employee employee6 = new Employee();
        employee6.setName("CivilEngineer");
        
        Employee employee7=new Employee();
        employee7.setName("GovtOfficer");
        
        Employee employee8=new Employee();
        employee8.setName("QualityAssuranceeng");
        
        Employee employee9=new Employee();
        employee9.setName("Supplier");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new AdminRole());
        account.setEmployee(employee);
        
        UserAccount account1 = new UserAccount();
        account1.setUsername("civil");
        account1.setPassword("civil");
        account1.setRole(new CivilEngineer());
        account1.setEmployee(employee6);
        
        UserAccount account2 = new UserAccount();
account2.setUsername("rentcompany");
account2.setPassword("rentpass");
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


 UserAccount account7 = new UserAccount();
        account7.setUsername("govtofficer");
        account7.setPassword("govtofficer");
        account7.setRole(new GovtOfficerRole());
        account7.setEmployee(employee7);
        
        UserAccount account8 = new UserAccount();
        account8.setUsername("govtofficer");
        account8.setPassword("govtofficer");
        account8.setRole(new CivilEngineer());
        account8.setEmployee(employee8);
        
        UserAccount account9 = new UserAccount();
        account9.setUsername("supplier");
        account9.setPassword("supplier");
        account9.setRole(new CivilEngineer());
        account9.setEmployee(employee9);
        
        
        
        

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
        
        QAOrganization Qao = new QAOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(Qao);
        
        supprg.getEmployeeDirectory().getEmployeeList().add(employee9);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account9);
        
        
        
       
        
        Vehicle vehicle = new Vehicle("VH101", "Truck", 2.5, 20.0);


        
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
        m.addAdOption(partner, digital);


       SupplierDirectory sd= supprg.getSuppliers();
       Supplier s=sd.newSupplier("Hardware");
       ProductCatalog pc=s.getPc();
       ImageIcon image= new ImageIcon(ConfigureABusiness.class.getResource("/images/hammer.jpg"));
       ImageIcon image1= new ImageIcon(ConfigureABusiness.class.getResource("/images/Stainless Steel Tape Measure.jpg"));
      ImageIcon image2= new ImageIcon(ConfigureABusiness.class.getResource("/images/Electric Drill.jpg"));
     ImageIcon image3= new ImageIcon(ConfigureABusiness.class.getResource("/images/Safety Goggles.jpg"));
//       
     ImageIcon image4= new ImageIcon(ConfigureABusiness.class.getResource("/images/Srinivasa Apt.jpg"));
     ImageIcon image5= new ImageIcon(ConfigureABusiness.class.getResource("/images/Rams Apt.jpg"));
       ImageIcon image6= new ImageIcon(ConfigureABusiness.class.getResource("/images/Srunith Apt.jpeg"));
       Product p=pc.newProduct("Steel claw hammer",25,"16 oz weight, comfortable rubber grip, durable and perfect for general carpentry" , 500, image);
       Product sledgehammer = pc.newProduct("Fiberglass Handle Sledgehammer",45,"12 lb heavy-duty head for effective demolition, shock-absorbing fiberglass handle with textured grip, long-lasting and ideal for breaking through concrete and masonry.",300,image3);
       Product tape_measure = pc.newProduct("Stainless Steel Tape Measure",15,"25 ft retractable tape, stainless steel construction for durability, with a magnetic hook and clear metric and imperial markings, suitable for all types of measuring needs.",600,image3);
       Product electric_drill = pc.newProduct("Electric Drill", 80,"Cordless 18V drill with lithium-ion battery, includes a 30-piece drill bit set, variable speed, and built-in LED light, perfect for home improvement and professional tasks.",250,image2);
       Product safety_goggles = pc.newProduct("Safety Goggles",10, "Anti-fog, scratch-resistant polycarbonate lenses, adjustable strap, provides superior eye protection in dusty or hazardous environments, meets ANSI Z87.1 standards.",800,image3);
       
       
       ApplicationFormDirectory afd= Qao.getAFormDirectory();
       ApplicationForm af=afd.newApplicationForm("Srinivasa Apartments", "side in corner", image4);
       ApplicationForm af1=afd.newApplicationForm("Ramm Aparments", "Common Wealth Avenue", image5);
       ApplicationForm af2 = afd.newApplicationForm("Srunith Aparmtments", "Centeral Messisouri", image6);

        
    
       
        

        
      
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
