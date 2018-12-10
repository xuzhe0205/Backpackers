/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Customer;

import Business.EcoSystem;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.CarDirectory;
import Business.Car;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.UserAccount.UserAccount;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.*;
import Business.WorkQueue.CarRentalWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Oliver
 */
public class CustomerRentalHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerRentalHistoryJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private CustomerOrganization customerOrganization;
    public CustomerRentalHistoryJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system = business;
        this.customerOrganization = (CustomerOrganization)organization;
        populateTable();
        labelCredits.setText(Double.toString(userAccount.getCredits()));
    }
    
    public void populateTable(){
        
        int rowCount = tableOrderHistory.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tableOrderHistory.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        System.out.println("orderhistory: " + userAccount.getCustomerOrder().size() + ", work request: " + userAccount.getWorkQueue().getRequestMap().get("CarRental").size());
        int cnt = 0;
        if (userAccount.getCustomerOrder().size() == 0){
            return;
        }
        
        //System.out.println("History panel: " + userAccount.getCustomerOrder().size());
        for (WorkRequest request : userAccount.getWorkQueue().getRequestMap().get("CarRental")){
            Object row[] = new Object[7];
            
            row[0] = userAccount.getCustomerOrder().get(cnt);
            row[1] = userAccount.getCustomerOrder().get(cnt).getMade();
            row[2] = userAccount.getCustomerOrder().get(cnt).getModel();
            if (request.getPriceChange()){
                row[3] = request.getPrice();
            }
            else{
                row[3] = userAccount.getCustomerOrder().get(cnt).getPrice();
            }
            row[4] = request.getReceiver().getEmployee().getName();
            row[5] = request.getMessage();
            row[6] = request.getStatus();
            
            model.addRow(row);
            cnt++;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrderHistory = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelCredits = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("CUSTOMER ORDER HISTORY");

        tableOrderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Car ID", "Vehicle Made", "Vehicle Model", "Price", "Merchant", "Merchant Message", "Status"
            }
        ));
        jScrollPane1.setViewportView(tableOrderHistory);

        backBtn.setText("<<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        btnCancel.setText("Request to Cancel >>>");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel2.setText("Your credits: ");

        labelCredits.setText("Display Credits");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/chakan.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/quxiao.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(34, 34, 34)
                                .addComponent(btnCancel))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel3)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addGap(177, 177, 177)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(labelCredits)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(labelCredits)
                    .addComponent(jLabel3))
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(btnCancel)
                    .addComponent(jLabel4))
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        int row = tableOrderHistory.getSelectedRow();
        if (row<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Car myCar = (Car)tableOrderHistory.getValueAt(row, 0);
        CarRentalWorkRequest rentRequest = new CarRentalWorkRequest();
        rentRequest.setIsCancellation(true);
        rentRequest.setPrice((Double)tableOrderHistory.getValueAt(row, 3));
        rentRequest.setMessage("I want to canel order");
        rentRequest.setSender(userAccount);
        UserAccount ua = null;
         for (Network network : system.getNetworkList()){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if (enterprise.getName().equals(customerOrganization.getEnterpriseName())){
                    //System.out.println("CusHis: " + enterprise.getName() + "cusOrg: " + customerOrganization.getEnterpriseName());
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if (organization instanceof CarRentalOrganization){
                            for (UserAccount u : organization.getUserAccountDirectory().getUserAccountList()){
                                if (u.getEmployee().getName().equals(myCar.getCompanyName())){

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
             rentRequest.setRow(row);
             rentRequest.setReceiver(ua);
             rentRequest.setStatus("Requested");
             rentRequest.setIsCancellation(true);
             ua.getWorkQueue().getWorkRequestList().add(rentRequest);
             userAccount.getWorkQueue().getRequestMap().get("CarRental").get(row).setStatus("Cancellation Requested");
         }
         populateTable();
        JOptionPane.showMessageDialog(null, "Your cancellation request has been sent!", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCredits;
    private javax.swing.JTable tableOrderHistory;
    // End of variables declaration//GEN-END:variables
}
