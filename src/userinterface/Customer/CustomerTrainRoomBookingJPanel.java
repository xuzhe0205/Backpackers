/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Customer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.Organization.RailWayOrganization;
import Business.RailWay;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RailWayWorkRequest;
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
public class CustomerTrainRoomBookingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerTrainRoomBookingJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private CustomerOrganization customerOrganization;
    ArrayList<RailWay> railwayList; 
    public CustomerTrainRoomBookingJPanel(JPanel userProcessContainer, UserAccount account, CustomerOrganization customerOrganization, EcoSystem system, ArrayList<RailWay> railwayList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.customerOrganization = customerOrganization;
        this.system = system;
        this.railwayList = railwayList;
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHotelSearch = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnReserve = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        backBtn.setText("<<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        tableHotelSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Railway ID", "Railway Number", "Balcony Available", "Balcony Type", "Available"
            }
        ));
        jScrollPane1.setViewportView(tableHotelSearch);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("RAILWAY BALCONY BOOKING SEARCH RESULT");

        btnReserve.setText("Apply Reservation!");
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/chazhao.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/jiudian.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReserve))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(jLabel3)
                    .addComponent(btnReserve))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
        int rowCount = tableHotelSearch.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tableHotelSearch.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(RailWay myRailway : railwayList) {
            
            Object row[] = new Object[5];
            row[0] = myRailway;
            row[1] = myRailway.getCompanyName();
            row[2] = myRailway.getRoomAvail();
            row[3] = myRailway.getRoomType();
            
            
            if (myRailway.getIsAvailable()){
                row[4] = "Yes";
            }
            else{
                row[4] = "No";
            }
            model.addRow(row);
            
        }
    }
    
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        // TODO add your handling code here:
        int row = tableHotelSearch.getSelectedRow();
        if (row<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        RailWay myRailway = (RailWay)tableHotelSearch.getValueAt(row, 0);
        if (!myRailway.getIsAvailable()){
            JOptionPane.showMessageDialog(null, "This balcony is not available", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        RailWayWorkRequest rentRequest = new RailWayWorkRequest();
        rentRequest.setMessage("I want to book this balcony");
        rentRequest.setSender(userAccount);
        //rentRequest.setCusCredits(userAccount.getCredits());
        rentRequest.setStatus("Applied");

        UserAccount ua = null;

        //System.out.println(system.getName()+"////////////");
        for (Network network : system.getNetworkList()){
            System.out.println(system.getNetworkList().size());
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){

                if (enterprise.getName().equals(customerOrganization.getEnterpriseName())){

                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){

                        if (organization instanceof RailWayOrganization){

                            for (UserAccount u : organization.getUserAccountDirectory().getUserAccountList()){
                                //System.out.println("u,employeename: "+ u.getEmployee().getName()+"hotelcompanyname"+myHotel.getCompanyName());
                                if (u.getEmployee().getName().equals(myRailway.getCompanyName())){
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

            rentRequest.setReceiver(ua);
            rentRequest.setIsCancellation(false);
            ua.getWorkQueue().getWorkRequestList().add(rentRequest);
            if (!userAccount.getWorkQueue().getRequestMap().containsKey("RailWay")){
                ArrayList<WorkRequest> hotelRequestList = new ArrayList<WorkRequest>();
                hotelRequestList.add(rentRequest);
                userAccount.getWorkQueue().getRequestMap().put("RailWay", hotelRequestList);
                
            }
            else{
                userAccount.getWorkQueue().getRequestMap().get("RailWay").add(rentRequest);
            }
            userAccount.getCustomerRailWayBooking().add(myRailway);
        }

        //System.out.println("Search Result panel: " + userAccount.getCustomerOrder().size());
        JOptionPane.showMessageDialog(null, "Your balcony booking application has been sent! ", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnReserveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnReserve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHotelSearch;
    // End of variables declaration//GEN-END:variables
}
