/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.QA;

import business.Business;
import business.Organization.Organization;
import business.Organization.QAOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Ram
 */
public class GovermentApplication extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount account;
    QAOrganization qaOrganization;
    Business business;

    /**
     * Creates new form NewJPanel
     */
    public GovermentApplication(JPanel userProcessContainer, UserAccount account, QAOrganization qaOrganization, Business business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.qaOrganization=qaOrganization;
        this.business=business;
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        approveRequestBtn = new javax.swing.JButton();
        declineRequestBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 51));

        approveRequestBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        approveRequestBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/check.png"))); // NOI18N
        approveRequestBtn.setText("Approve Funds Request");
        approveRequestBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        approveRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveRequestBtnActionPerformed(evt);
            }
        });

        declineRequestBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        declineRequestBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/close.png"))); // NOI18N
        declineRequestBtn.setText("Decline Funds Request");
        declineRequestBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        declineRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineRequestBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/approved-600x310.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Government Approval UserInterFace");

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
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(approveRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(declineRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1207, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(approveRequestBtn)
                            .addComponent(declineRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void approveRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveRequestBtnActionPerformed
        //        if(request.getStatus().equalsIgnoreCase("Approved") || request.getStatus().equalsIgnoreCase("Declined")){
            //            JOptionPane.showMessageDialog(null, "The funds have already been Approved/Declined");
            //            return;
            //        }
        //
        //        if(requestedFundFormTextField.getText().equals(""))
        //        {
            //            JOptionPane.showMessageDialog(null, "Please enter a comment!");
            //            return;
            //        }
        //        else{
            //            request.setApproval(requestedFundFormTextField.getText());
            //
            //            final String recipient = request.getSender().toString();//this needs to be an email address
            //            boolean sessionDebug = false;
            //
            //            String from = "taskplannermernproject@gmail.com";
            //            String host = "smtp.gmail.com";
            //            String user="taskplannermernproject@gmail.com";
            //            String pass = "taskplannermernproject@123";
            //            Properties prop = System.getProperties();
            //            prop.setProperty("mail.smtp.host", host);
            //            prop.put("mail.smtp.starttls.required", "true");
            //            prop.put("mail.smtp.starttls.enable", "true");
            //            prop.put("mail.smtp.host", host);
            //            prop.put("mail.smtp.port", "587");
            //            prop.put("mail.smtp.auth", "true");

            //            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

            //            Session session;
            //            session = Session.getDefaultInstance(prop, null);
            //            session.setDebug(sessionDebug);
            //
            //            try{
                //                MimeMessage msg = new MimeMessage(session);
                //                msg.setFrom(new InternetAddress(from));
                //                msg.setRecipient(Message.RecipientType.TO,new InternetAddress(recipient));
                //                InternetAddress address;
                //                address = new InternetAddress(recipient);
                //                msg.setSubject("Status of the Fund Approval");
                //                msg.setText("The requested fund has been approved");
                //                Transport transport = session.getTransport("smtp");
                //                transport.connect(host,user,pass);
                //                transport.sendMessage(msg, msg.getAllRecipients());
                //                transport.close();
                //            }catch(Exception ex){
                //                JOptionPane.showMessageDialog(null, "Error encountered while sending email");
                //            }
            //
            //            request.setStatus("Approved");
            //            JOptionPane.showMessageDialog(null, "Funds have been approved");
            //        }
    }//GEN-LAST:event_approveRequestBtnActionPerformed

    private void declineRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineRequestBtnActionPerformed
        // TODO add your handling code here:
        //        if(request.getStatus().equalsIgnoreCase("Approved") || request.getStatus().equalsIgnoreCase("Declined")){
            //            JOptionPane.showMessageDialog(null, "The funds have already been Approved/Declined");
            //            return;
            //        }
        //
        //        if(requestedFundFormTextField.getText().equals(""))
        //        {
            //            JOptionPane.showMessageDialog(null, "Please enter a comment!");
            //            return;
            //        }
        //        else{
            //            request.setApproval(requestedFundFormTextField.getText());
            //
            //            final String recipient = request.getSender().toString();//this needs to be an email address
            //            boolean sessionDebug = false;
            //
            //            String from = "taskplannermernproject@gmail.com";
            //            String host = "smtp.gmail.com";
            //            String user="taskplannermernproject@gmail.com";
            //            String pass = "taskplannermernproject@123";
            //            Properties prop = System.getProperties();
            //            prop.setProperty("mail.smtp.host", host);
            //            prop.put("mail.smtp.starttls.required", "true");
            //            prop.put("mail.smtp.starttls.enable", "true");
            //            prop.put("mail.smtp.host", host);
            //            prop.put("mail.smtp.port", "587");
            //            prop.put("mail.smtp.auth", "true");
            //
            //            //            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            //
            //            Session session;
            //            session = Session.getDefaultInstance(prop, null);
            //            session.setDebug(sessionDebug);
            //
            //            try{
                //                MimeMessage msg = new MimeMessage(session);
                //                msg.setFrom(new InternetAddress(from));
                //                msg.setRecipient(Message.RecipientType.TO,new InternetAddress(recipient));
                //                InternetAddress address;
                //                address = new InternetAddress(recipient);
                //                msg.setSubject("Status of the Fund Approval");
                //                msg.setText("The requested fund has been declined");
                //                Transport transport = session.getTransport("smtp");
                //                transport.connect(host,user,pass);
                //                transport.sendMessage(msg, msg.getAllRecipients());
                //                transport.close();
                //            }catch(Exception ex){
                //                JOptionPane.showMessageDialog(null, "Error encountered while sending email");
                //            }
            //
            //            request.setStatus("Declined");
            //            JOptionPane.showMessageDialog(null, "Funds have been declined");
            //        }
    }//GEN-LAST:event_declineRequestBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveRequestBtn;
    private javax.swing.JButton declineRequestBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
