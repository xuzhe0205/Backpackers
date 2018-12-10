/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Customer;
import Business.*;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.CustomerOrganization;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.DateFormat;
import java.util.regex.Pattern;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.awt.Graphics2D;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.RenderingHints;

/**
 *
 * @author Oliver
 */
public class CreateCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerProfileJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private String profilePath;
    public CreateCustomerJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        comboEnterprise.removeAllItems();
        ArrayList<Object> tempEnterprise = new ArrayList<Object>();
        for (Network network : this.system.getNetworkList()){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if (tempEnterprise.contains(enterprise.getName())){
                    
                }
                else{
                    comboEnterprise.addItem(enterprise);
                    tempEnterprise.add(enterprise.getName());
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

        genderBtnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        radioOther = new javax.swing.JRadioButton();
        txtFirstName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtPhoneNum = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtDriverLicense = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comboEnterprise = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        dobChooser = new com.toedter.calendar.JDateChooser();
        btnGetDate = new javax.swing.JButton();
        labelDob = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        imageLable = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("CREATE CUSTOMER PROFILE");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Personal ID");

        jLabel5.setText("Date of Birth");

        jLabel6.setText("Gender");

        jLabel7.setText("Phone Number");

        jLabel8.setText("Email Address");

        genderBtnGroup.add(radioMale);
        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });

        genderBtnGroup.add(radioFemale);
        radioFemale.setText("Female");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });

        genderBtnGroup.add(radioOther);
        radioOther.setText("Other/NA");
        radioOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOtherActionPerformed(evt);
            }
        });

        backBtn.setText("<<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        createBtn.setText("Create New Profile");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Driver License");

        jLabel10.setText("Enterprise");

        comboEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEnterpriseActionPerformed(evt);
            }
        });

        jLabel11.setText("Username");

        jLabel12.setText("Password");

        btnGetDate.setText("<- DOB");
        btnGetDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDateActionPerformed(evt);
            }
        });

        labelDob.setText("Display Your DOB");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/order-add.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/denglu.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/denglumima-baise.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Customer/denglu.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/shuzi.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Customer/shengri.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Customer/xingbie.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Customer/shoujihao.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Customer/youxiang.png"))); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Customer/jiazhao.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/enterprise.png"))); // NOI18N

        btnUpload.setText("Upload Image");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioFemale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioOther))
                                    .addComponent(txtLastName)
                                    .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPhoneNum)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDriverLicense)
                                    .addComponent(txtUserName)
                                    .addComponent(txtPassword)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelDob, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGetDate, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addComponent(comboEnterprise, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(dobChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLable, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpload))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(comboEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dobChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel19))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnGetDate)
                                .addComponent(labelDob)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(radioMale)
                            .addComponent(radioOther)
                            .addComponent(radioFemale)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtDriverLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createBtn)
                            .addComponent(backBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageLable, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpload)))
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMaleActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void radioOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOtherActionPerformed

    private boolean emailPatternCorrect(){
        String usernamePattern = "^[a-zA-Z0-9][a-zA-Z0-9_]*@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
        
        boolean check = Pattern.matches(usernamePattern, txtEmail.getText());
        if(check == true){
            return true;
        }
        else{
            return false;
        }
    }
    
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        if(!emailPatternCorrect()){
            txtEmail.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Email must have @, can have _, where _ can't be at the first place, and dot has to be trailing the @!" );
            return;
        }
        String firstName;
        String lastName;
        String id;
        String dob;
        long phoneNum;
        String email;
        String username;
        String password;
        String driverLicense;
        String gender = "";
        int cnt = 0;
        Enterprise ent = (Enterprise)comboEnterprise.getSelectedItem();
        //Organization organization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.CarRental);
        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()){
            if (organization.getName().equals("Customer Organization")){
                cnt++;
            }
        }
        if (cnt==0){
            CustomerOrganization customerOrganization = (CustomerOrganization)ent.getOrganizationDirectory().createOrganization(Organization.Type.Customer);
            //customerOrganization.setCompanyName();
            
            customerOrganization.setEnterpriseName(ent.getName());
            //System.out.println("CreateCustomerPanel: " + customerOrganization.getEnterpriseName());
        }
        if (txtFirstName.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for First Name", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtFirstName.setText("");
            return;
        }
        else{
            firstName = txtFirstName.getText();
        }
        
        if (txtLastName.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Last Name", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtLastName.setText("");
            return;
        }
        else{
           lastName = txtLastName.getText();
        }
        
        if (txtID.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Personal ID", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtID.setText("");
            return;
        }
        else{
           id = txtID.getText();
        }
        
//        if (txtDOB.getText().trim().isEmpty()){
//            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Date of Birth", "Warning", JOptionPane.INFORMATION_MESSAGE);
//            txtDOB.setText("");
//            return;
//        }
//        else{
//           dob = txtDOB.getText();
//        }
        dob = labelDob.getText();
        
        if ((!radioMale.isSelected())&&(!radioFemale.isSelected())&&(!radioOther.isSelected())){
            JOptionPane.showMessageDialog(null, "Please select one of the options for gender", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        try{
            phoneNum = Long.parseLong(txtPhoneNum.getText());
        }
        catch(InputMismatchException exception){
            JOptionPane.showMessageDialog(null, "Error: You must enter an Integer for Phone Number!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtPhoneNum.setText("");
            return;
        }
        
        if (txtEmail.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Email Adress", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtEmail.setText("");
            return;
        }
        else{
           email = txtEmail.getText();
        }
        
        if (txtUserName.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Username", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtUserName.setText("");
            return;
        }
        else{
            username = txtUserName.getText();
        }
        
        if (String.valueOf(txtPassword.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Password", "Warning", JOptionPane.INFORMATION_MESSAGE);
            txtUserName.setText("");
            return;
        }
        else{
            password = String.valueOf(txtPassword.getPassword());
        }
        
        driverLicense = txtDriverLicense.getText();
        
        if (radioMale.isSelected()){
            gender = "Male";
        }
        else if (radioFemale.isSelected()){
            gender = "Female";
        }
        else if (radioOther.isSelected()){
            gender = "Other/NA";
        }
        
        UserAccount userAccount=null;
        
        for(Network network:system.getNetworkList()){
            //Step 2.a: check against each enterprise
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                if (enterprise.getName().equals(((Enterprise)comboEnterprise.getSelectedItem()).getName())){
                    if (userAccount == null){
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                            if (organization.getName().equals("Customer Organization")){
                                for (UserAccount c : organization.getUserAccountDirectory().getUserAccountList()){
                                    if (id.equals(c.getUsername())){
                                        JOptionPane.showMessageDialog(null, "Error: This customer's personal ID already exists, and it should be unique! Try again!", "Warning", JOptionPane.INFORMATION_MESSAGE);
                                        txtID.setText("");
                                        return;
                                    }
                                    if (email.equals(c.getEmail())){
                                        JOptionPane.showMessageDialog(null, "Error: This customer's Email Address already exists, and it should be unique! Try again!", "Warning", JOptionPane.INFORMATION_MESSAGE);
                                        txtEmail.setText("");
                                        return;
                                    }
                                    if (txtPhoneNum.getText().equals(c.getPhoneNum())){
                                        JOptionPane.showMessageDialog(null, "Error: This customer's Phone Number already exists, and it should be unique! Try again!", "Warning", JOptionPane.INFORMATION_MESSAGE);
                                        txtPhoneNum.setText("");
                                        return;
                                    } 
                                }
                                Employee employee = organization.getEmployeeDirectory().createEmployee(username);
                                UserAccount account = organization.getUserAccountDirectory().createUserAccount(username, password, employee, new CustomerRole(), email, phoneNum, firstName, lastName, id, dob, gender, driverLicense);
                                account.setProfilePath(profilePath);
                            }
                        }
                    }
                }
                
            }
        }
        txtEmail.setBackground(Color.WHITE);
        JOptionPane.showMessageDialog(null, "Customer successfully Signed up!", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void comboEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEnterpriseActionPerformed
        // TODO add your handling code here:
        //        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        //        if (enterprise != null){
            //            System.out.println("has enterprise");
            //             populateOrganizationComboBox(enterprise);
            //        }
    }//GEN-LAST:event_comboEnterpriseActionPerformed

    private void btnGetDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDateActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        String date = sdf.format(dobChooser.getDate());
        labelDob.setText(date);
        
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        
        Date curDate = new Date();
        
        System.out.println(dateFormat.format(curDate));
        
        int age = (Integer.parseInt(dateFormat.format(curDate)) - Integer.parseInt(date))/10000;
        
        System.out.println(age);
    }//GEN-LAST:event_btnGetDateActionPerformed

    public BufferedImage scaleImage(int WIDTH, int HEIGHT, String filename) {
        BufferedImage bi = null;
        try {
            ImageIcon ii = new ImageIcon(filename);//path to image
            bi = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = (Graphics2D) bi.createGraphics();
            g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY));
            g2d.drawImage(ii.getImage(), 0, 0, WIDTH, HEIGHT, null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return bi;
    }
    
    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        profilePath = f.getAbsolutePath();
        //UserAccount.setProfilePath(f.getAbsolutePath());
        BufferedImage img=scaleImage(150,150,profilePath);
        ImageIcon icon = new ImageIcon(img);
        imageLable.setIcon(icon);
    }//GEN-LAST:event_btnUploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnGetDate;
    private javax.swing.JButton btnUpload;
    private javax.swing.JComboBox comboEnterprise;
    private javax.swing.JButton createBtn;
    private com.toedter.calendar.JDateChooser dobChooser;
    private javax.swing.ButtonGroup genderBtnGroup;
    private javax.swing.JLabel imageLable;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelDob;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioOther;
    private javax.swing.JTextField txtDriverLicense;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
