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
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Oliver
 */


public class CustomerRentCarJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private CustomerOrganization customerOrganization;
    /**
     * Creates new form CustomerRentCar
     */
    public CustomerRentCarJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system = business;
        this.customerOrganization = (CustomerOrganization)organization;
        
        comboCapacity.removeAllItems();
        comboCarClass.removeAllItems();
        comboCarType.removeAllItems();
        
        comboCapacity.addItem("");
        comboCarClass.addItem("");
        comboCarType.addItem("");
        ArrayList<Object> tempCapacity = new ArrayList<Object>();
        ArrayList<Object> tempClass = new ArrayList<Object>();
        ArrayList<Object> tempType = new ArrayList<Object>();
        for (Network network : this.system.getNetworkList()){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if (enterprise.getName().equals(customerOrganization.getEnterpriseName())){
                    //System.out.println(enterprise.getName());
                    for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if (org.getName().equals("CarRental Organization")){
                            for (UserAccount useraccount : org.getUserAccountDirectory().getUserAccountList()){
                                for (Car myCar : useraccount.getCarCatalog()){
                                    if (tempCapacity.contains(myCar.getCapacity())){

                                    }
                                    else{
                                        comboCapacity.addItem(myCar.getCapacity());
                                        tempCapacity.add(myCar.getCapacity());
                                    }
                                    if (tempClass.contains(myCar.getCarClass())){

                                    }
                                    else{
                                        comboCarClass.addItem(myCar.getCarClass());
                                        tempClass.add(myCar.getCarClass());
                                    }
                                    if (tempType.contains(myCar.getCarType())){

                                    }
                                    else{
                                        comboCarType.addItem(myCar.getCarType());
                                        tempType.add(myCar.getCarType());
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

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPickupLoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnContinue = new javax.swing.JButton();
        comboCarType = new javax.swing.JComboBox();
        comboCarClass = new javax.swing.JComboBox();
        comboCapacity = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        btnRentalOrders = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Start A Reservation!");

        backBtn.setText("<<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Pick-up Location");

        txtPickupLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPickupLocActionPerformed(evt);
            }
        });

        jLabel3.setText("Vehicle Type");

        jLabel4.setText("Vehicle Class");

        jLabel5.setText("Passenger Capacity");

        btnContinue.setText("Continue >>>");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        comboCarType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboCarClass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboCapacity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Car Rental History"));

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/jincheng.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CarRental/4qichexinghao.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Customer/ge_xingji.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CarRental/yanjizhushou-shangchuan_rongliang.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/chakan.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCarClass, 0, 300, Short.MAX_VALUE)
                            .addComponent(comboCapacity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPickupLoc)
                                        .addComponent(comboCarType, 0, 300, Short.MAX_VALUE))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(268, 268, 268)
                                .addComponent(btnContinue)))))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPickupLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboCarType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboCarClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(btnContinue))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(155, 155, 155))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void txtPickupLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPickupLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPickupLocActionPerformed

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        // TODO add your handling code here:
        String pickupLoc = txtPickupLoc.getText();
        String carType = (String)comboCarType.getSelectedItem();
        String carClass = (String)comboCarClass.getSelectedItem();
        String capacity = (String)comboCapacity.getSelectedItem();
        if (searchCar(pickupLoc, carType, carClass, capacity) == null){
            JOptionPane.showMessageDialog(null, "No available Car found:( Search again!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ArrayList<Car> carList = new ArrayList<Car>();
        carList = searchCar(pickupLoc, carType, carClass, capacity);
        CustomerCarSearchResultJPanel cusCarSearchResJP = new CustomerCarSearchResultJPanel(userProcessContainer, userAccount, customerOrganization, system, carList); 
        userProcessContainer.add("CustomerCarSearchResultJPanel",cusCarSearchResJP);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnContinueActionPerformed

    private void btnRentalOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentalOrdersActionPerformed
        // TODO add your handling code here:
        CustomerRentalHistoryJPanel customerRentalHistoryJP=new CustomerRentalHistoryJPanel(userProcessContainer, userAccount, customerOrganization, system);
        userProcessContainer.add("CustomerRentalHistoryJP",customerRentalHistoryJP);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnRentalOrdersActionPerformed

    private ArrayList<Car> searchCar(String pickupLoc, String carType, String carClass, String capacity){
        ArrayList<Car> carList = new ArrayList<Car>();
        int cnt = 0;
        for (Network network : system.getNetworkList()){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                //System.out.println("Customer's enterprise: " + customerOrganization.getEnterpriseName() + ", Enterprise in directory: " + enterprise.getEnterpriseName());
                if (enterprise.getName().equals(customerOrganization.getEnterpriseName())){
                   for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if (org.getName().equals("CarRental Organization")){
                            for (UserAccount useraccount : org.getUserAccountDirectory().getUserAccountList()){
                                for (Car myCar : useraccount.getCarCatalog()){
                                    if ((!pickupLoc.equals("")) && (myCar.getLocation().equals(pickupLoc) == false)){
                                        continue;
                                    }
                                    if ((!carType.equals("")) && (myCar.getCarType().equals(carType) == false)){
                                        continue;
                                    }
                                    if ((!carClass.equals("")) && (myCar.getCarClass().equals(carClass) == false)){
                                        continue;
                                    }
                                    if ((!capacity.equals("")) && (Integer.toString(myCar.getCapacity()).equals(capacity) == false)){
                                        continue;
                                    }
                                    carList.add(myCar);
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
        return carList;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnRentalOrders;
    private javax.swing.JComboBox comboCapacity;
    private javax.swing.JComboBox comboCarClass;
    private javax.swing.JComboBox comboCarType;
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
    private javax.swing.JTextField txtPickupLoc;
    // End of variables declaration//GEN-END:variables
}
