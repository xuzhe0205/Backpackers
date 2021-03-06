/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Customer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.*;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author chenweikai
 */
public class CustomerRailWayBookingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerTrainBookingJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private CustomerOrganization customerOrganization;
    public CustomerRailWayBookingJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system = business;
        this.customerOrganization = (CustomerOrganization)organization;
        
        comboDate.removeAllItems();
        comboTime.removeAllItems();
        
        comboDate.addItem("");
        comboTime.addItem("");
        
        ArrayList<Object> tempDate = new ArrayList<Object>();
        ArrayList<Object> tempTime = new ArrayList<Object>();
        
        for (Network network : this.system.getNetworkList()){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if (enterprise.getName().equals(customerOrganization.getEnterpriseName())){
                    System.out.println(enterprise.getName());
                    for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if (org.getName().equals("RailWay Organization")){
                            for (UserAccount useraccount : org.getUserAccountDirectory().getUserAccountList()){
                                for (RailWay railway : useraccount.getRailwayCatalog()){
                                    if (tempDate.contains(railway.getTime())){

                                    }
                                    else{
                                        comboDate.addItem(railway.getTime());
                                        tempDate.add(railway.getTime());
                                    }
                                    if (tempTime.contains(railway.getTime())){

                                    }
                                    else{
                                        comboTime.addItem(railway.getTime());
                                        tempTime.add(railway.getTime());
                                    }
                                   

                                }
                            }
                        }
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

        btnContinue = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboDate = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        btnRentalOrders = new javax.swing.JButton();
        comboTime = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDeparture = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtArrival = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        btnContinue.setText("Continue >>>");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        jLabel5.setText("Date");

        jLabel4.setText("Time");

        comboDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("RailWay Booking History"));

        btnRentalOrders.setText("My Orders");
        btnRentalOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentalOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnRentalOrders)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnRentalOrders)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        comboTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Start A Reservation!");

        backBtn.setText("<<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Departure");

        txtDeparture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartureActionPerformed(evt);
            }
        });

        jLabel6.setText("Arrival");

        txtArrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArrivalActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Customer/tielu.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Customer/tielu.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/shijian.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/riqi.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/chakan.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(268, 268, 268)
                                .addComponent(btnContinue))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(comboTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtArrival)
                            .addComponent(txtDeparture)
                            .addComponent(comboDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtArrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(btnContinue))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(79, 79, 79))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        // TODO add your handling code here:
        String departure = txtDeparture.getText();
        String arrival = txtArrival.getText();
        String date = (String)comboDate.getSelectedItem();
        String time = (String)comboTime.getSelectedItem();
        if (searchRailWay(departure, arrival, date, time) == null){
            JOptionPane.showMessageDialog(null, "No available Car found:( Search again!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ArrayList<RailWay> railwayList = new ArrayList<RailWay>();
        railwayList = searchRailWay(departure, arrival, date, time);
        CustomerRailWaySearchResultJPanel cusRailWaySearchResJP = new CustomerRailWaySearchResultJPanel(userProcessContainer, userAccount, customerOrganization, system, railwayList);
        userProcessContainer.add("CustomerRailWaySearchResultJPanel",cusRailWaySearchResJP);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnContinueActionPerformed

    private ArrayList<RailWay> searchRailWay(String departure, String arrival, String date, String time){
        ArrayList<RailWay> railwayList = new ArrayList<RailWay>();
        int cnt = 0;
        for (Network network : system.getNetworkList()){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                System.out.println("Customer's enterprise: " + customerOrganization.getEnterpriseName() + ", Enterprise in directory: " + enterprise.getEnterpriseName());
                if (enterprise.getName().equals(customerOrganization.getEnterpriseName())){
                   for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if (org.getName().equals("RailWay Organization")){
                            for (UserAccount useraccount : org.getUserAccountDirectory().getUserAccountList()){
                                for (RailWay railway : useraccount.getRailwayCatalog()){
                                    if ((!departure.equals("")) && (railway.getDeparture().equals(departure) == false)){
                                        continue;
                                    }
                                    if ((!arrival.equals("")) && (railway.getArrival().equals(arrival) == false)){
                                        continue;
                                    }
                                    if ((!date.equals("")) && (railway.getDate().equals(date) == false)){
                                        continue;
                                    }
                                    if ((!time.equals("")) && (railway.getTime().equals(time) == false)){
                                        continue;
                                    }
                                    
                                    railwayList.add(railway);
                                    cnt++;
                                }
                            }
                        }
                    } 
                }
                
            }
        }
        if (cnt == 0){
            return null;
        }
        return railwayList;
    }
    
    
    private void btnRentalOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentalOrdersActionPerformed
        // TODO add your handling code here:
        CustomerRailWayBookingHistoryJPanel customerRailWayBookingHistoryJP=new CustomerRailWayBookingHistoryJPanel(userProcessContainer, userAccount, customerOrganization, system);
        userProcessContainer.add("CustomerRailWayBookingHistoryJP",customerRailWayBookingHistoryJP);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRentalOrdersActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void txtDepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartureActionPerformed

    private void txtArrivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArrivalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArrivalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnRentalOrders;
    private javax.swing.JComboBox comboDate;
    private javax.swing.JComboBox comboTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtArrival;
    private javax.swing.JTextField txtDeparture;
    // End of variables declaration//GEN-END:variables
}
