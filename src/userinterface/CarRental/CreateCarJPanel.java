/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CarRental;
import Business.*;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.InputMismatchException;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Oliver
 */
public class CreateCarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCarJPanel
     */
    UserAccount useraccount;
    JPanel userProcessContainer;
    public CreateCarJPanel(JPanel userProcessContainer, UserAccount useraccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
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
        txtMade = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        comboCarType = new javax.swing.JComboBox();
        comboClass = new javax.swing.JComboBox();
        comboCapacity = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();
        btnAddCar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel1.setText("Create A New Car ");

        jLabel2.setText("Made");

        jLabel3.setText("Model");

        jLabel4.setText("Car Type");

        jLabel5.setText("Car Class");

        jLabel6.setText("Color");

        jLabel7.setText("Capacity");

        jLabel8.setText("Price");

        jLabel9.setText("Location");

        txtMade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMadeActionPerformed(evt);
            }
        });

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        comboCarType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cars", "Vans", "SUVs", "Trucks" }));

        comboClass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Economy", "Compact", "Intermediate", "Standard", "Full Size", "Compact SUV", "Premium", "Minivan"}));

        comboCapacity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "4", "5", "7", "8", "15"}));

        backBtn.setText("<<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        btnAddCar.setText("Add Car");
        btnAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/order-add.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/qiche.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/qiche.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CarRental/4qichexinghao.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CarRental/yanse.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CarRental/yanjizhushou-shangchuan_rongliang.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/meiyuandollar153.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/jincheng.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/qiche.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(backBtn)
                        .addGap(186, 186, 186)
                        .addComponent(btnAddCar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(108, 108, 108)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel11))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice)
                                    .addComponent(txtLocation)
                                    .addComponent(comboCapacity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtColor)
                                    .addComponent(comboClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboCarType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtModel)
                                    .addComponent(txtMade))))
                        .addGap(32, 32, 32)))
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboCarType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(btnAddCar))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMadeActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CarRentalManageJPanel carRentalWorkAreaPanel = (CarRentalManageJPanel) component;
        carRentalWorkAreaPanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarActionPerformed
        // TODO add your handling code here:
        String color;
        String made;
        String model;
        String location;
        double price;
        
        
        
        if (txtColor.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Car Color", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtColor.setText("");
            return;
        }
        else{
            color = txtColor.getText();
        }
        
        if (txtMade.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Car Made", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtMade.setText("");
            return;
        }
        else{
            made = txtMade.getText();
        }
        
        if (txtModel.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Car Model", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtModel.setText("");
            return;
        }
        else{
            model = txtModel.getText();
        }
        
        if (txtLocation.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for the Location of this Car", "Warning", JOptionPane.INFORMATION_MESSAGE);
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
        
        int Capacity = Integer.parseInt((String)comboCapacity.getSelectedItem());
        String carType = (String)comboCarType.getSelectedItem();
        String carClass = (String)comboClass.getSelectedItem();
        
        Car myCar = useraccount.addCar();
        int counter = 0;
        for (Car car : useraccount.getCarCatalog()){
            counter++;
        }
        myCar.setCnt(counter);
        myCar.setCarID(myCar.getCnt());
        myCar.setCapacity(Capacity);
        myCar.setCarClass(carClass);
        myCar.setCarType(carType);
        myCar.setColor(color);
        myCar.setLocation(location);
        myCar.setMade(made);
        myCar.setModel(model);
        myCar.setPrice(price);
        myCar.setCarID(myCar.getCarID());
        myCar.setCompanyName(useraccount.getEmployee().getName());
        JOptionPane.showMessageDialog(null, "Car successfully added", "Warning", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnAddCarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnAddCar;
    private javax.swing.JComboBox comboCapacity;
    private javax.swing.JComboBox comboCarType;
    private javax.swing.JComboBox comboClass;
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
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMade;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
