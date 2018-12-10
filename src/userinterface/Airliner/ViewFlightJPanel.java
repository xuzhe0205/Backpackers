/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Airliner;

import Business.Flight;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import java.io.*;
import java.awt.Component;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Oliver
 */
public class ViewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFlightJPanel
     */
    Flight myFlight;
    JPanel userProcessContainer;
    UserAccount userAccount;
    public ViewFlightJPanel(JPanel userProcessContainer, UserAccount userAccount, Flight myFlight) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.myFlight = myFlight;
        this.userAccount = userAccount;
        btnSave.setEnabled(false);
        txtFlightNum.setEnabled(false);
        txtArrival.setEnabled(false);
        txtDate.setEnabled(false);
        txtDeparture.setEnabled(false);
        comboFleet.setEnabled(false);
        txtPrice.setEnabled(false);
        txtSeatAvail.setEnabled(false);
        comboTime.setEnabled(false);
        txtFlightNum.setText(myFlight.getFlightNum());
        comboFleet.setSelectedItem(myFlight.getFleet());
        txtDeparture.setText(myFlight.getDeparture());
        txtArrival.setText(myFlight.getArrival());
        txtDate.setText(myFlight.getDate());
        comboTime.setSelectedItem(myFlight.getTime());
        txtSeatAvail.setText(Integer.toString(myFlight.getSeatAvail()));
        txtPrice.setText(Double.toString(myFlight.getPrice()));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFlightNum = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtDeparture = new javax.swing.JTextField();
        txtArrival = new javax.swing.JTextField();
        txtSeatAvail = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        comboTime = new javax.swing.JComboBox();
        comboFleet = new javax.swing.JComboBox<String>();
        btnSave = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("VIEW/UPDATE A FLIGHT");

        jLabel2.setText("Flight Number");

        jLabel3.setText("Time");

        jLabel4.setText("Departure");

        jLabel5.setText("Arrival");

        jLabel6.setText("Seats Available");

        jLabel7.setText("Ticket Price");

        jLabel8.setText("Date");

        jLabel9.setText("Fleet of Airplane");

        backBtn.setText("<<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        comboTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboFleet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A300", "MD-11", "BOEING 737", "BOEING 747", "BOEING 757" }));
        comboFleet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFleetActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/chakan.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/shuzi.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/hangbandongtai.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/riqi.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/shijian.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/-departure-.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/-landing.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/zuowei.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/meiyuandollar153.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(133, 133, 133)
                            .addComponent(backBtn)
                            .addGap(80, 80, 80)
                            .addComponent(btnSave)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17)
                                .addComponent(jLabel18)
                                .addComponent(jLabel10))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(81, 81, 81)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDate)
                                .addComponent(txtDeparture)
                                .addComponent(txtArrival)
                                .addComponent(txtSeatAvail)
                                .addComponent(txtPrice)
                                .addComponent(txtFlightNum)
                                .addComponent(comboTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboFleet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFlightNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboFleet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtArrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSeatAvail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAirlinerJPanel airlinerMaPanel = (ManageAirlinerJPanel) component;
        airlinerMaPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        UserAccount[][] seats = myFlight.getFlightSeats();
        int cnt = 0;
        for(int i = 0; i < 25; i++){
            for (int j = 0; j < 6; j++){
                if (seats[i][j]!=null){
                    cnt++;
                    JOptionPane.showMessageDialog(null, "There are orders processed in flight, you can't update info for this flight!", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false); 
        txtFlightNum.setEnabled(true);
        txtArrival.setEnabled(true);
        txtDate.setEnabled(true);
        txtDeparture.setEnabled(true);
        comboFleet.setEnabled(true);
        txtPrice.setEnabled(true);
        comboTime.setEnabled(true);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void comboFleetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFleetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFleetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        btnUpdate.setEnabled(false);
        String flightNum;
        String fleet;
        String date;
        String departure;
        String arrival;
        double price;
        btnSave.setEnabled(false);
        txtFlightNum.setEnabled(false);
        txtArrival.setEnabled(false);
        txtDate.setEnabled(false);
        txtDeparture.setEnabled(false);
        comboFleet.setEnabled(false);
        txtPrice.setEnabled(false);
        comboTime.setEnabled(false);
        if (txtFlightNum.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Flight Number", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtFlightNum.setText("");
            return;
        }
        else{
            flightNum = txtFlightNum.getText();
        }
        
        fleet = (String)comboFleet.getSelectedItem();
        
        if (txtDate.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Date!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtDate.setText("");
            return;
        }
        else{
            date = txtDate.getText();
        }
        
        if (txtDeparture.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Departure!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtDeparture.setText("");
            return;
        }
        else{
            departure = txtDeparture.getText();
        }
        
        if (txtArrival.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Arrival!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtArrival.setText("");
            return;
        }
        else{
            arrival = txtArrival.getText();
        }
        
        try{
            price = Double.parseDouble(txtPrice.getText());
        }
        catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Error: You must enter a double for the Price!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtPrice.setText("");
            return;
        }
        
        for (Flight f : userAccount.getFlightCatalog()){
            if (f.getFlightNum().equals(flightNum)){
                JOptionPane.showMessageDialog(null, "Error: This FLight Number already exists, it should be unique! Try again!", "Warning", JOptionPane.INFORMATION_MESSAGE);
                txtFlightNum.setText("");
                return;
            }
        }
        
//        int counter = 0;
//        for (Flight flight : useraccount.getFlightCatalog()){
//            counter++;
//        }
        myFlight.setFlightNum(flightNum);
        myFlight.setFleet(fleet);
        myFlight.setDate(date);
        myFlight.setTime((String)comboTime.getSelectedItem());
        myFlight.setDeparture(departure);
        myFlight.setArrival(arrival);
        myFlight.setSeatAvail(150);
        myFlight.setPrice(price);
        JOptionPane.showMessageDialog(null, "Flight successfully added", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboFleet;
    private javax.swing.JComboBox comboTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtArrival;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDeparture;
    private javax.swing.JTextField txtFlightNum;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSeatAvail;
    // End of variables declaration//GEN-END:variables
}
