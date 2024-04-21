/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Supplier;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Properties;
import Supplier.MasterOrderList;
import Supplier.Order;
import Supplier.Product;
import Supplier.ProductCatalog;
import Supplier.Supplier;
import Supplier.SupplierDirectory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import business.Business;
import business.Organization.SupplierOrganization;
import business.UserAccount.UserAccount;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author saisr
 */
public class sendEmail extends javax.swing.JPanel {
    
    private ArrayList<Product> products;
    private JPanel userProcessContainer;
    Business bb;
    UserAccount account;
    SupplierOrganization supplierOrganization;
    
    
    /**
     * Creates new form sendEmail
     */
    public sendEmail(JPanel userProcessContainer,UserAccount account,SupplierOrganization sOrganization, Business business) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account=account;
        bb=business;
        supplierOrganization=sOrganization;
//         private JPanel userProcessContainer;
        cmbsupplier1.removeAllItems();
        SupplierDirectory supplierDirectory= supplierOrganization.getSuppliers();
         for(Supplier supplier : supplierDirectory.getSuppliers()) {
            cmbsupplier1.addItem(supplier.getSname());
            this.products = new ArrayList<Product>();
         
        }
        setupTableTextWrap(); 
//
//        
//        String FromEmail ="saisrunith12@gmail.com";
//        String ToEmail="saisrunith54@gmail.com";
//        String FromEmailPassword ="Shivani123$";
//        Properties properties= new Properties();
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.startls.enable", "true");
//        properties.put("mail.smtp.host", "smtp.gmail.com");
//        properties.put("mail.smtp.port", "587");
        
//        Session session =Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
//           protected PasswordAuthentication getPasswordAuthentication(){
//               return new PasswordAuthentication(FromEmail, FromEmailPassword);
//           } 
//        });
        
//        try{
//            MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(FromEmail));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
//            Transport.send(message);
//        }catch(Exception ex){
//            System.out.println(""+ex);
//        }
//        
        
        
        
        
        
        
//       JTextField fromField = new JTextField(20);
//        JTextField toField = new JTextField(20);
//        JTextField subjectField = new JTextField(20);
//        JTextArea messageArea = new JTextArea(10, 20);
//        JButton sendButton = new JButton("Send");
//
//        JPanel panel = new JPanel();
//        panel.add(new JLabel("From:"));
//        panel.add(fromField);
//        panel.add(new JLabel("To:"));
//        panel.add(toField);
//        panel.add(new JLabel("Subject:"));
//        panel.add(subjectField);
//        panel.add(new JScrollPane(messageArea));
//        panel.add(sendButton);
//
//        sendButton.addActionListener((ActionEvent e) -> {
//            String from = fromField.getText();
//            String to = toField.getText();
//            String subject = subjectField.getText();
//            String message = messageArea.getText();
//            sendEmail(from, to, subject, message);
//        });

//        add(panel);
       
//        setVisible(true);
    }

    // Method to send email using JavaMail API
//    private void sendEmail(String from, String to, String subject, String text) {
//        String host = "smtp.example.com"; // Your SMTP host
//        Properties properties = System.getProperties();
//        properties.setProperty("mail.smtp.host", host);
//
//        Session session = Session.getDefaultInstance(properties);
//        try {
//            MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(from));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            message.setSubject(subject);
//            message.setText(text);
//
//            Transport.send(message);
//            System.out.println("Email Sent Successfully!!");
//        } catch (MessagingException mex) {
//            mex.printStackTrace();
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCatalog = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Sim1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cmbsupplier = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableJ = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableCart = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        cmbsupplier1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBook = new javax.swing.JButton();
        txtActualPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtActualPrice1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("Supplier");

        tblCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Floor Price", "Ceiling Price", "Target Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCatalog);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Catalog");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Order items");

        jLabel3.setText("Product Name :");

        jButton4.setText("Select");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Browse Product Price Performance");

        Sim1.setText("Sim1");
        Sim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sim1ActionPerformed(evt);
            }
        });

        jButton2.setText("Anaylse Product");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Sim2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Name", "Quantity", "Actual Price per Item", "Total Actual Price"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmbsupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbsupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsupplierActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(204, 255, 51));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Supplier :");

        tableJ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", " Price", "Product Description", "Product Image", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableJ);

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Catalog");

        jButton6.setBackground(new java.awt.Color(0, 204, 204));
        jButton6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 255, 51));
        jButton6.setText("Select");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Quantity", "Total Actual Price"
            }
        ));
        jScrollPane4.setViewportView(jTableCart);

        jButton8.setBackground(new java.awt.Color(0, 204, 204));
        jButton8.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 255, 51));
        jButton8.setText("<<Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        cmbsupplier1.setBackground(new java.awt.Color(0, 204, 204));
        cmbsupplier1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        cmbsupplier1.setForeground(new java.awt.Color(204, 255, 51));
        cmbsupplier1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbsupplier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsupplier1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Actual Price");

        btnAdd.setBackground(new java.awt.Color(0, 204, 204));
        btnAdd.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(204, 255, 51));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBook.setBackground(new java.awt.Color(0, 204, 204));
        btnBook.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        btnBook.setForeground(new java.awt.Color(204, 255, 51));
        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Order Quantity");

        txtActualPrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualPrice1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText("Cart :");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RAW MATERIALS FROM DIFFERENT SUPPLIERS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(620, 620, 620)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtActualPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtActualPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbsupplier1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButton6)))
                .addGap(70, 88, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(cmbsupplier1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtActualPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtActualPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)))
                .addGap(2, 2, 2)
                .addComponent(btnBook)
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String supplier = (String) cmbsupplier.getSelectedItem();
        refreshprod(supplier);
        System.out.println(supplier);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Sim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sim1ActionPerformed
        // TODO add your handling code here:
//        MasterOrderList mol =  bb.getMasterOrderList();
//        PersonDirectory persondirectory = bb.getPersonDirectory();
//
//        Person p21 = persondirectory.newPerson("Justin peper");
//        Person p22 = persondirectory.newPerson("Taylor maruti swift");
//        Person p23 = persondirectory.newPerson("Alan crawler");
//        Person p24 = persondirectory.newPerson("Dj apparav");
//
//        SupplierDirectory supplierdirectory = bb.getSupplierDirectory();
//        SupplierProfile supp = supplierdirectory.findSupplier("Sam");
//
//        CustomerDirectory customerdirectory = bb.getCustomerDirectory();
//        CustomerProfile customerprofile0 = customerdirectory.newCustomerProfile(p21);
//        CustomerProfile customerprofile1 = customerdirectory.newCustomerProfile(p22);
//
//        ProductCatalog pc = supp.getProductCatalog();
//        Product p1= pc.getProductList().get(3);
//        System.out.println(p1.toString());
//
//        Product p2= pc.getProductList().get(2);
//
//        Product p3= pc.getProductList().get(1);
//        Product p5= pc.getProductList().get(4);
//
//        Order order1 = mol.newOrder(customerprofile0,sales);
//        order1.newOrderItem(p1,p1.getTargetPrice()-10000 ,3);
//        System.out.println(p1.toString());
//        order1.newOrderItem(p5, p5.getTargetPrice()+5000,2);
//        System.out.println(p5.toString());
//
//        Targetvar(order1);

        //        Order order2 = mol.newOrder(customerprofile1,sales);
        //        order2.newOrderItem(p2,p2.getTargetPrice()+20000 ,3);
        //        order2.newOrderItem(p3, p3.getTargetPrice()-5000, 1);
        //        Targetvar(order2);
    }//GEN-LAST:event_Sim1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        int selectedRow =  tblCatalog.getSelectedRow();
//        if(selectedRow<0){
//            JOptionPane.showMessageDialog(null, "Please select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
//        }
//
//        Product  cn= (Product) tblCatalog.getValueAt(selectedRow,0);
//        jTextField1.setText(cn.toString());
//        txtFrequencyAboveTarget.setText(Integer.toString(cn.getNumberOfProductSalesAboveTarget()));
//        txtFrequencyBelowTarget.setText(Integer.toString(cn.getNumberOfProductSalesBelowTarget()));
//        //        System.out.println(cn);
//
//        MasterOrderList mol =  bb.getMasterOrderList();
//        refreshp2(cn);
//        ArrayList<Order> s= mol.getOrders();
//        for (Order a: s ){
//            //                     System.out.println(a);
//            String customer= a.getCustomer().getCustomerId();
//
//            for(OrderItem l: a.getOrderitems())
//            {
//                if (cn.equals(l.getSelectedProduct())){
//                    System.out.println(cn);
//
//                    Object[] row = new Object[4];
//
//                    row[0] = customer;
//                    row[1] = l.getQuantity();
//                    row[2] = l.getActualPrice();
//
//                    row[3] = l.getOrderItemTotal();
//                    //           row[4]=p.;
//
//                    ((DefaultTableModel) jTable2.getModel()).addRow(row);
//                }
//
//            }}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
//        String supplier = (String) cmbsupplier.getSelectedItem();
//        int selectedRow =  tblCatalog.getSelectedRow();
//        if(selectedRow<0){
//            JOptionPane.showMessageDialog(null, "Please select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
//        }

//        Product  cn= (Product) tblCatalog.getValueAt(selectedRow,0);
//        MasterOrderList mol =  bb.getMasterOrderList();
//        ArrayList<Order> s= mol.getOrders();
//        for (Order a: s ){
//            for(OrderItem l: a.getOrderitems())
//            {
//                if (cn.equals(l.getSelectedProduct())){
//                    if(a.isOrderAboveTotalTarget()){
//                        System.out.print(a.isOrderAboveTotalTarget());
//                        int val= (l.getOrderItemTotal()/l.getOrderItemTargetTotal())*100;
//                        if(val>10){
//                            int targetstart= l.getSelectedProduct().getTargetPrice();
//                            targetstart= (int) (targetstart*1.2);
//                            int f= l.getSelectedProduct().getFloorPrice();
//                            int c= l.getSelectedProduct().getCeilingPrice();
//                            l.getSelectedProduct().updateProduct(f, c, targetstart);
//                        }
//                        else{
//                            int targetstart= l.getSelectedProduct().getTargetPrice();
//                            targetstart= (int) (targetstart*1.08);
//                            int f= l.getSelectedProduct().getFloorPrice();
//                            int c= l.getSelectedProduct().getCeilingPrice();
//                            l.getSelectedProduct().updateProduct(f, c, targetstart);
//
//                        }
//
//                    }
//                    else{
//
//                        for (OrderItem oi: a.getOrderitems()){
//
//                            int val= (oi.getOrderItemTotal()/oi.getOrderItemTargetTotal())*100;
//                            if(val<10){
//                                int targetstart= oi.getSelectedProduct().getTargetPrice();
//                                targetstart= (int) (targetstart*0.90);
//                                int f= oi.getSelectedProduct().getFloorPrice();
//                                int c= oi.getSelectedProduct().getCeilingPrice();
//                                oi.getSelectedProduct().updateProduct(f, c, targetstart);
//
//                            }
//                            else{
//                                int targetstart= oi.getSelectedProduct().getTargetPrice();
//                                targetstart= (int) (targetstart*0.96);
//                                int f= oi.getSelectedProduct().getFloorPrice();
//                                int c= oi.getSelectedProduct().getCeilingPrice();
//                                oi.getSelectedProduct().updateProduct(f, c, targetstart);
//
//                            }
//
//                        }
//
//                    }
//
//                }
//
//            }
//        }

        //        mol.getOrders()

        //        MasterOrderList mol =  bb.getMasterOrderList();
        //        PersonDirectory persondirectory = bb.getPersonDirectory();
        //        Person p27 = persondirectory.newPerson("Sara Gonzalez");
        //        Person p28 = persondirectory.newPerson("David Lee");
        //        Person p29 = persondirectory.newPerson("Jessica Martinez");
        //        Person p30 = persondirectory.newPerson("Daniel Brown");
        //
        //        SupplierDirectory supplierdirectory = bb.getSupplierDirectory();
        //        SupplierProfile supp = supplierdirectory.findSupplier("rom");
        //
        //        CustomerDirectory customerdirectory = bb.getCustomerDirectory();
        //        CustomerProfile customerprofile0 = customerdirectory.newCustomerProfile(p27);
        //        CustomerProfile customerprofile1 = customerdirectory.newCustomerProfile(p28);
        //
        //         ProductCatalog pc = supp.getProductCatalog();
        //        Product p1= pc.getProductList().get(1);
        //                System.out.println(p1.toString());
        //
        //        Product p2= pc.getProductList().get(2);
        //
        //        Product p3= pc.getProductList().get(3);
        //        Product p5= pc.getProductList().get(5);
        //        Order order1 = mol.newOrder(customerprofile0,sales);
        //        order1.newOrderItem(p1,p1.getTargetPrice()-4 ,3);
        //
        //        order1.newOrderItem(p5, p5.getTargetPrice()+5,2);
        //        Targetvar(order1);
        //
        //
        //        Order order2 = mol.newOrder(customerprofile1,sales);
        //        order2.newOrderItem(p1,p1.getTargetPrice()-4 ,30);
        //
        //        order2.newOrderItem(p5, p5.getTargetPrice()+5,20);
        //        Targetvar(order2);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        userProcessContainer.remove(this);
//        ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbsupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsupplierActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String supplier = (String) cmbsupplier1.getSelectedItem();
        refreshprod(supplier);
        System.out.println(supplier);
        System.out.println(supplier);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        userProcessContainer.remove(this);
        ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void cmbsupplier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsupplier1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsupplier1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(txtActualPrice==null){
            JOptionPane.showMessageDialog(null, "Please Enter Actual Price", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtActualPrice1==null){
            JOptionPane.showMessageDialog(null, "Please Enter Actual Price", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int actp= Integer.parseInt(txtActualPrice.getText());
        int quant= Integer.parseInt(txtActualPrice1.getText());

        int row = tableJ.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product s = (Product) tableJ.getValueAt(row, 0);
        System.out.println(s.getName());
        System.out.println();
        s.setAvailability(quant);
        s.setPrice(actp);
        products.add(s);
        refreshorder();
        
//
//        MasterOrderList mol =  bb.getMasterorderlist();
//        Order order1 = mol.newOrder();
//        order1.newOrderItem(s,actp,quant);
            
//        refreshorder(actp,quant);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
       MasterOrderList mol= supplierOrganization.getMasterorderlist();
       ProductCatalog pC=supplierOrganization.getPc();
        Order order1 = mol.newOrder();
        int quant= Integer.parseInt(txtActualPrice1.getText());
        for(Product p :products){
            for(Product p2: pC.getProducts()){
                if(p2.getName().equals(p.getName())){
                    if(p.getAvailability()<p2.getAvailability()){
                         order1.newOrderItem(p,p.getPrice(),quant);
                         p2.setAvailability(p2.getAvailability()-p.getAvailability());
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Quantity unavailable");
                    }
                    
                }
                
            }
        }
//        
//        

        JOptionPane.showMessageDialog(this, "Sales order placed", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnBookActionPerformed

    private void txtActualPrice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualPrice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualPrice1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sim1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBook;
    private javax.swing.JComboBox<String> cmbsupplier;
    private javax.swing.JComboBox<String> cmbsupplier1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableCart;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableJ;
    private javax.swing.JTable tblCatalog;
    private javax.swing.JTextField txtActualPrice;
    private javax.swing.JTextField txtActualPrice1;
    // End of variables declaration//GEN-END:variables

    private void refreshprod(String sp) {
        DefaultTableModel model = (DefaultTableModel) tableJ.getModel();
        model.setRowCount(0);
//        int rc = tblCatalog.getRowCount();
//        int i;
//        for (i = rc - 1; i >= 0; i--) {
//            ((DefaultTableModel) tableJ.getModel()).removeRow(i);
//        }


        
        SupplierDirectory supplierDirectory= supplierOrganization.getSuppliers();
        System.out.println(supplierDirectory);
        for(Supplier supplierp : supplierDirectory.getSuppliers()) {
            if(sp.equals(supplierp.getSname())){
                System.out.println(sp);
                for(Product p: supplierp.getPc().getProductList())  {
                    ImageIcon icon = p.getXyz();
                if (icon != null) {
            // Scale the icon if necessary
                Image image = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                icon = new ImageIcon(image);
        }
          
            Object[] row = new Object[5];
            row[0] = p;
            row[1] = p.getPrice();
            row[2] = p.getProductDescription();
            row[3]=icon;
            row[4]=p.getAvailability();
            

            ((DefaultTableModel) tableJ.getModel()).addRow(row);     
     }                     
            } 
        }
            }

    private void refreshorder() {
        
        DefaultTableModel model = (DefaultTableModel) jTableCart.getModel();
        model.setRowCount(0);
           
//        int rc = jTableCart.getRowCount();
//        int i;
//        for (i = rc - 1; i >= 0; i--) {
//            ((DefaultTableModel) jTableCart.getModel()).removeRow(i);
//        }
        Object[] row = new Object[3];
        for(Product p1: products){
            row[0] = p1;
            row[1] = p1.getAvailability();
            row[2] = (p1.getAvailability())*(p1.getPrice());
            
            ((DefaultTableModel) jTableCart.getModel()).addRow(row);
            
        }
        
    }
    private void setupTableTextWrap() {
        tableJ.setDefaultRenderer(Object.class, new TableCellRenderer() {
            private final JTextArea textArea = new JTextArea();
 
            {
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                textArea.setOpaque(true);
            }
 
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if (value instanceof ImageIcon) {
                    return new JLabel((ImageIcon) value);
                } else {
                    textArea.setText(value != null ? value.toString() : "");
                    textArea.setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
                    textArea.setForeground(isSelected ? table.getSelectionForeground() : table.getForeground());
                    return textArea;
                    
                }
            }
        });
        tableJ.setRowHeight(60);
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
