/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Customer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hotel;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.HotelOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HotelWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chenweikai
 */
public class CustomerHotelSearchResultJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerHotelSearchJREsultPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private CustomerOrganization customerOrganization;
    ArrayList<Hotel> hotelList; 
    private String bookedDate;
    public CustomerHotelSearchResultJPanel(JPanel userProcessContainer, UserAccount account, CustomerOrganization customerOrganization, EcoSystem system, ArrayList<Hotel> hotelList, String bookedDate) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.customerOrganization = customerOrganization;
        this.system = system;
        this.hotelList = hotelList;
        this.bookedDate = bookedDate;
        labelCheckindate.setText(bookedDate);
                

        //System.out.println(customerOrganization.getEnterpriseName());
        populateTable();
        labelCredits.setText(Double.toString(userAccount.getCredits()));
        reservemeetimhrooms.setEnabled(false);
        for (Network network : system.getNetworkList()){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if ((enterprise.getEnterpriseType().getValue()).equals("Industrial Travel Agency")){
                    if (this.customerOrganization.getEnterpriseName().equals(enterprise.toString())){
                        reservemeetimhrooms.setEnabled(true);
                    }
                }
                
           
            }
        }
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioNeighborhood = new javax.swing.JRadioButton();
        radioIndustry = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHotelSearch = new javax.swing.JTable();
        btnCredApply = new javax.swing.JButton();
        btnReserve = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        reservemeetimhrooms = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelCredits = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelCheckindate = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCredApply2 = new javax.swing.JButton();
        btnCredApply1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        radioNeighborhood.setText("Neighbohood");
        radioNeighborhood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNeighborhoodActionPerformed(evt);
            }
        });

        radioIndustry.setText("Industry ");
        radioIndustry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIndustryActionPerformed(evt);
            }
        });

        tableHotelSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hotel ID", "Hotel Name", "Price", "Location", "Stars", "Parking Lot", "Wifi", "Room Numbers", "Available"
            }
        ));
        jScrollPane1.setViewportView(tableHotelSearch);

        btnCredApply.setText("Apply with Credits!");
        btnCredApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCredApplyActionPerformed(evt);
            }
        });

        btnReserve.setText("Apply Reservation!");
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });

        backBtn.setText("<<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("HOTEL BOOKING SEARCH RESULT");

        reservemeetimhrooms.setText("Reserve Meeting Rooms");
        reservemeetimhrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservemeetimhroomsActionPerformed(evt);
            }
        });

        jLabel2.setText("Your credits: ");

        labelCredits.setText("Display Credits");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/jiudian.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/order-add.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/jifen.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Customer/huiyishi.png"))); // NOI18N

        labelCheckindate.setText("Display Credits");

        jLabel8.setText("Your Check-in date:");

        btnCredApply2.setText("Apply with Credits and extra two beds");
        btnCredApply2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCredApply2ActionPerformed(evt);
            }
        });

        btnCredApply1.setText("Apply with Credits and extra one bed");
        btnCredApply1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCredApply1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Customer/chuang.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Customer/chuang.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(labelCredits)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(226, 226, 226)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCredApply1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reservemeetimhrooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCredApply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReserve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCredApply2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel3)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCheckindate)
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(labelCheckindate))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(labelCredits)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(btnReserve)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCredApply)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCredApply1)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCredApply2)
                            .addComponent(jLabel9))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reservemeetimhrooms)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel4))
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
        int rowCount = tableHotelSearch.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tableHotelSearch.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Hotel myHotel : hotelList) {
            if(myHotel.getRoomnumbers()>0){
                myHotel.setIsAvailable(true);
            }
            else{
                myHotel.setIsAvailable(false);
            }
        }
        
        for(Hotel myHotel : hotelList) {
            
            Object row[] = new Object[9];
            row[0] = myHotel;
            row[1] = myHotel.getName();
            row[2] = myHotel.getPrice();
            row[3] = myHotel.getLocation();
            row[4] = myHotel.getStars();
            row[5] = myHotel.getParking();
            row[6] = myHotel.getWifi();
            row[7] = myHotel.getRoomnumbers();
            if (myHotel.getIsAvailable()){
                row[8] = "Yes";
            }
            else{
                row[8] = "No";
            }
            model.addRow(row);
            
        }
    }
    
    private void btnCredApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCredApplyActionPerformed
        // TODO add your handling code here:
        
        int row = tableHotelSearch.getSelectedRow();
        if (row<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Hotel myHotel = (Hotel)tableHotelSearch.getValueAt(row, 0);
        if (!myHotel.getIsAvailable()){
            JOptionPane.showMessageDialog(null, "This Hotel is not available", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        HotelWorkRequest rentRequest = new HotelWorkRequest();
        rentRequest.setMessage("I want to book this hotel");
        rentRequest.setSender(userAccount);
        rentRequest.setIsCredits(true);
        rentRequest.setOrderHotel(myHotel);
        //rentRequest.setCusCredits(userAccount.getCredits());
        rentRequest.setStatus("Applied");

        UserAccount ua = null;
        //System.out.println(system.getName()+"////////////");
        for (Network network : system.getNetworkList()){
             
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
              
                System.out.println(enterprise.getEnterpriseName());
                
                if (enterprise.getName().equals(customerOrganization.getEnterpriseName())){
                    
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        
                        if (organization instanceof HotelOrganization){
                            
                            for (UserAccount u : organization.getUserAccountDirectory().getUserAccountList()){
                                
                                if (u.getEmployee().getName().equals(myHotel.getName())){
                                    ua = u;
                                    break;
                                    
                                }
                            }
                        }
                    }
                }

            }
        }
        if (ua != null){
            double m = myHotel.getRoomnumbers();
            
            //System.out.println(m);
            if(m > 0){
            m -= 1;
            myHotel.setIsAvailable(true);
            System.out.println(m);
            myHotel.setRoomnumbers(m);
            myHotel.getBookedDate().add(bookedDate);
            rentRequest.setReceiver(ua);
            rentRequest.setIsCancellation(false);
            ua.getWorkQueue().getWorkRequestList().add(rentRequest);
            if (!userAccount.getWorkQueue().getRequestMap().containsKey("Hotel")){
                ArrayList<WorkRequest> hotelRequestList = new ArrayList<WorkRequest>();
                hotelRequestList.add(rentRequest);
                userAccount.getWorkQueue().getRequestMap().put("Hotel", hotelRequestList);
                
            }
            else{
                userAccount.getWorkQueue().getRequestMap().get("Hotel").add(rentRequest);
            }
            userAccount.getCustomerBooking().add(myHotel);
        

        //System.out.println("Search Result panel: " + userAccount.getCustomerOrder().size());
        JOptionPane.showMessageDialog(null, "Your hotel booking application has been sent! Go to 'Your orders' to check your order status :)", "Warning", JOptionPane.INFORMATION_MESSAGE);
        
        }
        }
        else{
            JOptionPane.showMessageDialog(null, " The rooms are full ", "Warning", JOptionPane.INFORMATION_MESSAGE);
           
            myHotel.setIsAvailable(false);
        }
        populateTable();
    }//GEN-LAST:event_btnCredApplyActionPerformed

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        // TODO add your handling code here:
        String enterpriseType;
        
        
            enterpriseType = "Industrial Travel Agency";
        
            
        
        
        int row = tableHotelSearch.getSelectedRow();
        if (row<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
       Hotel myHotel = (Hotel)tableHotelSearch.getValueAt(row, 0);
        if (!myHotel.getIsAvailable()){
            JOptionPane.showMessageDialog(null, "This hotel is not available", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        HotelWorkRequest rentRequest = new HotelWorkRequest();
        rentRequest.setMessage("I want to book this hotel");
        rentRequest.setSender(userAccount);
        rentRequest.setOrderHotel(myHotel);
        //rentRequest.setCusCredits(userAccount.getCredits());
        rentRequest.setStatus("Applied");

        UserAccount ua = null;
       
        System.out.println(system.getName()+"////////////");
        for (Network network : system.getNetworkList()){
            System.out.println(system.getNetworkList().size());
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                
                if (enterprise.getName().equals(customerOrganization.getEnterpriseName())){
                     
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                         
                        if (organization instanceof HotelOrganization){
                             
                            for (UserAccount u : organization.getUserAccountDirectory().getUserAccountList()){
                                 //System.out.println("u,employeename: "+ u.getEmployee().getName()+"hotelcompanyname"+myHotel.getCompanyName()); 
                                if (u.getEmployee().getName().equals(myHotel.getName())){
                                    ua = u;
                                    break;
                                }
                            }
                        }
                    }
                }

            }
        }
        if (ua != null){
            double m = myHotel.getRoomnumbers();
            
            //System.out.println(m);
            if(m > 0){
            m -= 1;
            myHotel.setIsAvailable(true);
            System.out.println(m);
            myHotel.setRoomnumbers(m);
            myHotel.getBookedDate().add(bookedDate);
            rentRequest.setReceiver(ua);
            rentRequest.setIsCancellation(false);
            ua.getWorkQueue().getWorkRequestList().add(rentRequest);
            if (!userAccount.getWorkQueue().getRequestMap().containsKey("Hotel")){
                ArrayList<WorkRequest> hotelRequestList = new ArrayList<WorkRequest>();
                hotelRequestList.add(rentRequest);
                userAccount.getWorkQueue().getRequestMap().put("Hotel", hotelRequestList);
                
            }
            else{
                userAccount.getWorkQueue().getRequestMap().get("Hotel").add(rentRequest);
            }
            userAccount.getCustomerBooking().add(myHotel);
        

        //System.out.println("Search Result panel: " + userAccount.getCustomerOrder().size());
        JOptionPane.showMessageDialog(null, "Your hotel booking application has been sent! Go to 'Your orders' to check your order status :)", "Warning", JOptionPane.INFORMATION_MESSAGE);
        
        }
        }
        else{
            JOptionPane.showMessageDialog(null, " The rooms are full ", "Warning", JOptionPane.INFORMATION_MESSAGE);
           
            myHotel.setIsAvailable(false);
        }
        populateTable();
    }//GEN-LAST:event_btnReserveActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void reservemeetimhroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservemeetimhroomsActionPerformed
        // TODO add your handling code here:
        
        //reservemeetimhrooms.setEnabled(false);
        
                    CustomerMeetingRoomBookingJPanel cushotelMeetingRoomBookingJP = new CustomerMeetingRoomBookingJPanel(userProcessContainer, userAccount, customerOrganization, system, hotelList);
                    userProcessContainer.add("CustomerHotelMeetingRoomBookingJPanel",cushotelMeetingRoomBookingJP);
                    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
             
    }//GEN-LAST:event_reservemeetimhroomsActionPerformed

    private void radioNeighborhoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNeighborhoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNeighborhoodActionPerformed

    private void radioIndustryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIndustryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioIndustryActionPerformed

    private void btnCredApply2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCredApply2ActionPerformed
        // TODO add your handling code here:
        int row = tableHotelSearch.getSelectedRow();
        if (row<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Hotel myHotel = (Hotel)tableHotelSearch.getValueAt(row, 0);
        if (!myHotel.getIsAvailable()){
            JOptionPane.showMessageDialog(null, "This Hotel is not available", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        HotelWorkRequest rentRequest = new HotelWorkRequest();
        rentRequest.setMessage("I want to book this hotel with extra two beds");
        rentRequest.setSender(userAccount);
        rentRequest.setIsCredits(true);
        rentRequest.setOrderHotel(myHotel);
        //rentRequest.setCusCredits(userAccount.getCredits());
        rentRequest.setStatus("Applied");

        UserAccount ua = null;
        //System.out.println(system.getName()+"////////////");
        for (Network network : system.getNetworkList()){

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){

                System.out.println(enterprise.getEnterpriseName());

                if (enterprise.getName().equals(customerOrganization.getEnterpriseName())){

                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){

                        if (organization instanceof HotelOrganization){

                            for (UserAccount u : organization.getUserAccountDirectory().getUserAccountList()){

                                if (u.getEmployee().getName().equals(myHotel.getName())){
                                    ua = u;
                                    break;

                                }
                            }
                        }
                    }
                }

            }
        }
        if (ua != null){
            double m = myHotel.getRoomnumbers();

            //System.out.println(m);
            if(m > 0){
                m -= 1;
                System.out.println(m);
                myHotel.setRoomnumbers(m);
                myHotel.getBookedDate().add(bookedDate);
                rentRequest.setReceiver(ua);
                rentRequest.setIsCancellation(false);
                ua.getWorkQueue().getWorkRequestList().add(rentRequest);
                if (!userAccount.getWorkQueue().getRequestMap().containsKey("Hotel")){
                    ArrayList<WorkRequest> hotelRequestList = new ArrayList<WorkRequest>();
                    hotelRequestList.add(rentRequest);
                    userAccount.getWorkQueue().getRequestMap().put("Hotel", hotelRequestList);

                }
                else{
                    userAccount.getWorkQueue().getRequestMap().get("Hotel").add(rentRequest);
                }
                userAccount.getCustomerBooking().add(myHotel);

                //System.out.println("Search Result panel: " + userAccount.getCustomerOrder().size());
                JOptionPane.showMessageDialog(null, "Your hotel booking application has been sent! Go to 'Your orders' to check your order status :)", "Warning", JOptionPane.INFORMATION_MESSAGE);

            }
        }
        else{
            JOptionPane.showMessageDialog(null, " The rooms are full ", "Warning", JOptionPane.INFORMATION_MESSAGE);

            myHotel.setIsAvailable(false);
        }
        populateTable();
    }//GEN-LAST:event_btnCredApply2ActionPerformed

    private void btnCredApply1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCredApply1ActionPerformed
        // TODO add your handling code here:
        int row = tableHotelSearch.getSelectedRow();
        if (row<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Hotel myHotel = (Hotel)tableHotelSearch.getValueAt(row, 0);
        if (!myHotel.getIsAvailable()){
            JOptionPane.showMessageDialog(null, "This Hotel is not available", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        HotelWorkRequest rentRequest = new HotelWorkRequest();
        rentRequest.setMessage("I want to book this hotel with extra one bed");
        rentRequest.setSender(userAccount);
        rentRequest.setIsCredits(true);
        rentRequest.setOrderHotel(myHotel);
        //rentRequest.setCusCredits(userAccount.getCredits());
        rentRequest.setStatus("Applied");

        UserAccount ua = null;
        //System.out.println(system.getName()+"////////////");
        for (Network network : system.getNetworkList()){

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){

                System.out.println(enterprise.getEnterpriseName());

                if (enterprise.getName().equals(customerOrganization.getEnterpriseName())){

                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){

                        if (organization instanceof HotelOrganization){

                            for (UserAccount u : organization.getUserAccountDirectory().getUserAccountList()){

                                if (u.getEmployee().getName().equals(myHotel.getName())){
                                    ua = u;
                                    break;

                                }
                            }
                        }
                    }
                }

            }
        }
        if (ua != null){
            double m = myHotel.getRoomnumbers();

            //System.out.println(m);
            if(m > 0){
                m -= 1;
                System.out.println(m);
                myHotel.setRoomnumbers(m);
                myHotel.getBookedDate().add(bookedDate);
                rentRequest.setReceiver(ua);
                rentRequest.setIsCancellation(false);
                ua.getWorkQueue().getWorkRequestList().add(rentRequest);
                if (!userAccount.getWorkQueue().getRequestMap().containsKey("Hotel")){
                    ArrayList<WorkRequest> hotelRequestList = new ArrayList<WorkRequest>();
                    hotelRequestList.add(rentRequest);
                    userAccount.getWorkQueue().getRequestMap().put("Hotel", hotelRequestList);

                }
                else{
                    userAccount.getWorkQueue().getRequestMap().get("Hotel").add(rentRequest);
                }
                userAccount.getCustomerBooking().add(myHotel);

                //System.out.println("Search Result panel: " + userAccount.getCustomerOrder().size());
                JOptionPane.showMessageDialog(null, "Your hotel booking application has been sent! Go to 'Your orders' to check your order status :)", "Warning", JOptionPane.INFORMATION_MESSAGE);

            }
        }
        else{
            JOptionPane.showMessageDialog(null, " The rooms are full ", "Warning", JOptionPane.INFORMATION_MESSAGE);

            myHotel.setIsAvailable(false);
        }
        populateTable();
    }//GEN-LAST:event_btnCredApply1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnCredApply;
    private javax.swing.JButton btnCredApply1;
    private javax.swing.JButton btnCredApply2;
    private javax.swing.JButton btnReserve;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCheckindate;
    private javax.swing.JLabel labelCredits;
    private javax.swing.JRadioButton radioIndustry;
    private javax.swing.JRadioButton radioNeighborhood;
    private javax.swing.JButton reservemeetimhrooms;
    private javax.swing.JTable tableHotelSearch;
    // End of variables declaration//GEN-END:variables
}
