/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hotel;

import Business.Hotel;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author chenweikai
 */
public class UpdateHotelJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateHotelJPanel
     */
    UserAccount useraccount;
    JPanel userProcessContainer;
    Hotel hotel;
    public UpdateHotelJPanel(JPanel userProcessContainer,UserAccount useraccount,Hotel hotel) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.hotel = hotel;
        display();
        //txtName.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRoomNumbers = new javax.swing.JTextField();
        btnUpdateHotel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboStars1 = new javax.swing.JComboBox();
        comboParking1 = new javax.swing.JComboBox();
        comboWifi1 = new javax.swing.JComboBox();
        comboRoomtype = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        comboMeetingRoomtype = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMeetingRoomNumbers1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        jLabel6.setText("Price");

        jLabel7.setText("WiFi?");

        jLabel5.setText("Parking Lot?");

        backBtn.setText("<<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel1.setText("Update Hotel");

        jLabel8.setText("Room Numbers");

        txtRoomNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomNumbersActionPerformed(evt);
            }
        });

        btnUpdateHotel.setText("Update Hotel");
        btnUpdateHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHotelActionPerformed(evt);
            }
        });

        jLabel3.setText("Location");

        jLabel4.setText("Stars");

        comboStars1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4","5" }));
        comboStars1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStars1ActionPerformed(evt);
            }
        });

        comboParking1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Yes","No"}));

        comboWifi1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Yes","No"}));

        comboRoomtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Double", "Standard", "Suit"}));
        comboRoomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRoomtypeActionPerformed(evt);
            }
        });

        jLabel9.setText("Room Type");

        comboMeetingRoomtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Small", "Medium", "Large"}));
        comboMeetingRoomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMeetingRoomtypeActionPerformed(evt);
            }
        });

        jLabel10.setText("Meeting Room");

        jLabel11.setText("Meeting Room Numbers");

        txtMeetingRoomNumbers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMeetingRoomNumbers1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/jiudian.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/jincheng.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/meiyuandollar153.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/shuzi.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/gengxin.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CarRental/4qichexinghao.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/shuzi.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Customer/huiyishi.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Customer/ge_xingji.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Customer/tingche.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Hotel/wifi.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateHotel))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addComponent(jLabel16))
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel20)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboParking1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboStars1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtMeetingRoomNumbers1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(comboRoomtype, 0, 69, Short.MAX_VALUE)
                                            .addComponent(comboMeetingRoomtype, 0, 69, Short.MAX_VALUE)
                                            .addComponent(txtRoomNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(txtLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(comboWifi1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoomNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboRoomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMeetingRoomNumbers1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel17))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMeetingRoomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel21)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboStars1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboParking1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboWifi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(btnUpdateHotel)
                    .addComponent(jLabel15))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void display(){
       
        txtLocation.setText(hotel.getLocation());
        txtPrice.setText(Double.toString(hotel.getPrice()));
        txtRoomNumbers.setText(Double.toString(hotel.getRoomnumbers()));
        txtMeetingRoomNumbers1.setText(Double.toString(hotel.getMeetingroomnumbers()));
        comboRoomtype.setSelectedItem(hotel.getRoomtype());
        comboStars1.setSelectedItem(hotel.getStars());
        comboParking1.setSelectedItem(hotel.getParking());
        comboWifi1.setSelectedItem(hotel.getWifi());
    }
    
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HotelManageJPanel hotelManagePanel = (HotelManageJPanel) component;
        hotelManagePanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void txtRoomNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomNumbersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomNumbersActionPerformed

    private void btnUpdateHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHotelActionPerformed
        // TODO add your handling code here:
        //String name;
        double roomnumbers;
        String location;
        double price;
        double meetingroomnumber;

        if (txtLocation.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Car Made", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtLocation.setText("");
            return;
        }
        else{
            location = txtLocation.getText();
        }

        try{
            price = Double.parseDouble(txtPrice.getText());
        }
        catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Error: You must enter a double for the Price!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtPrice.setText("");
            return;
        }

        try{
            roomnumbers = Double.parseDouble(txtRoomNumbers.getText());
        }
        catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Error: You must enter a double for the Price!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtRoomNumbers.setText("");
            return;
        }
        
        try{
            meetingroomnumber = Double.parseDouble(txtMeetingRoomNumbers1.getText());
        }
        catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Error: You must enter a double for the Room Numbers!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtMeetingRoomNumbers1.setText("");
            return;
        }
        
         try{
            meetingroomnumber = Double.parseDouble(txtMeetingRoomNumbers1.getText());
        }
        catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Error: You must enter a double for the Room Numbers!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtMeetingRoomNumbers1.setText("");
            return;
        }

        String stars = (String)comboStars1.getSelectedItem();
        String parking = (String)comboParking1.getSelectedItem();
        String wifi = (String)comboWifi1.getSelectedItem();
        String meetingroomtype = (String)comboMeetingRoomtype.getSelectedItem();
        for (Hotel h : useraccount.getHotelCatalog()){
            
        //Hotel hotel = useraccount.addHotel();
        //hotel.setName(name);
        h.setLocation(location);
        h.setPrice(price);
        h.setRoomnumbers(roomnumbers);
        h.setStars(stars);
        h.setParking(parking);
        h.setWifi(wifi);
        h.setMeetingroomnumbers(meetingroomnumber);
        h.setMeetingroomtype(meetingroomtype);
        }
        //hotel.setHotelid(hotel.getHotelid());
        JOptionPane.showMessageDialog(null, "Hotel successfully updated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnUpdateHotelActionPerformed

    private void comboStars1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStars1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboStars1ActionPerformed

    private void comboRoomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRoomtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRoomtypeActionPerformed

    private void comboMeetingRoomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMeetingRoomtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMeetingRoomtypeActionPerformed

    private void txtMeetingRoomNumbers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMeetingRoomNumbers1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMeetingRoomNumbers1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnUpdateHotel;
    private javax.swing.JComboBox comboMeetingRoomtype;
    private javax.swing.JComboBox comboParking1;
    private javax.swing.JComboBox comboRoomtype;
    private javax.swing.JComboBox comboStars1;
    private javax.swing.JComboBox comboWifi1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMeetingRoomNumbers1;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRoomNumbers;
    // End of variables declaration//GEN-END:variables
}
