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
import Business.Flight;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.UserAccount.UserAccount;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Business.WorkQueue.*;
/**
 *
 * @author Oliver
 */
public class CustomerFlightResultJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerFlightResultJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private CustomerOrganization customerOrganization;
    String[] seatArr = {"A","B","C","D","E","F"};
    ArrayList<Flight> flightList;
    public CustomerFlightResultJPanel(JPanel userProcessContainer, UserAccount account, CustomerOrganization customerOrganization, EcoSystem system, ArrayList<Flight> flightList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.customerOrganization = customerOrganization;
        this.system = system;
        this.flightList = flightList;
        populateTable();
        //System.out.println(customerOrganization.getEnterpriseName());
        labelCredits.setText(Double.toString(userAccount.getCredits()));
        comboFlightNum.removeAllItems();
        comboSeatSel.removeAllItems();
        //comboFlightNum.addItem("");
        for (Flight f : flightList){
            comboFlightNum.addItem(f);
        }
    }

    
    public void populateTable(){
        int rowCount = flightDetailTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)flightDetailTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(Flight f : flightList) {
            
            Object row[] = new Object[9];
            row[0] = f.getAirlinerName();
            row[1] = f.getFlightNum();
            row[2] = f.getDeparture();
            row[3] = f.getArrival();
            row[4] = f.getDate();
            row[5] = f.getTime();
            row[6] = f.getPrice();
            row[7] = f.getFleet();
            int cnt = 0;
            for (int i = 0; i<25; i++){
                for (int j = 0; j<6; j++){
                    if ((f.getFlightSeats())[i][j] == null){
                        cnt++;
                    }
                }
            }
            row[8] = cnt;
            model.addRow(row);
            
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightDetailTable = new javax.swing.JTable();
        BookFlightPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboSeatSel = new javax.swing.JComboBox();
        comboFlightNum = new javax.swing.JComboBox();
        reserveFlightBtn = new javax.swing.JButton();
        labelFirstName = new javax.swing.JLabel();
        labelLastName = new javax.swing.JLabel();
        labelDOB = new javax.swing.JLabel();
        labelPhoneNum = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        findAvailBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        LeftSeat = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        RightSeat = new javax.swing.JTable();
        btnCredApply = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        labelCredits = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("MASTER FLIGHT SCHEDULE");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Search Result:");

        flightDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Airliner", "Flight Number", "Departure", "Arrival", "Date", "Time", "Price", "Airplane Fleet", "# of Seats Available"
            }
        ));
        jScrollPane1.setViewportView(flightDetailTable);

        BookFlightPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Flight Ticket Reservation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Al Bayan", 1, 13))); // NOI18N

        jLabel3.setText("Flight Number");

        jLabel4.setText("Seat Selection");

        comboSeatSel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSeatSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSeatSelActionPerformed(evt);
            }
        });

        comboFlightNum.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFlightNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFlightNumActionPerformed(evt);
            }
        });

        reserveFlightBtn.setText("Make Reservation!");
        reserveFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveFlightBtnActionPerformed(evt);
            }
        });

        findAvailBtn.setText("Find Available Seats =>");
        findAvailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findAvailBtnActionPerformed(evt);
            }
        });

        LeftSeat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LeftSeat.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        LeftSeat.setForeground(new java.awt.Color(0, 153, 153));
        LeftSeat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "", null, null},
                {"2", null, null, null},
                {"3", null, null, null},
                {"4", null, null, null},
                {"5", null, null, null},
                {"6", null, null, null},
                {"7", null, null, null},
                {"8", null, null, null},
                {"9", null, null, null},
                {"10", null, null, null},
                {"11", null, null, null},
                {"12", null, null, null},
                {"13", null, null, null},
                {"14", null, null, null},
                {"15", null, null, null},
                {"16", null, null, null},
                {"17", null, null, null},
                {"18", null, null, null},
                {"19", null, null, null},
                {"20", null, null, null},
                {"21", null, null, null},
                {"22", null, null, null},
                {"23", null, null, null},
                {"24", null, null, null},
                {"25", null, null, null}
            },
            new String [] {
                "", "     A", "     B", "     C"
            }
        ));
        LeftSeat.setAlignmentX(1.0F);
        LeftSeat.setAlignmentY(1.0F);
        LeftSeat.setGridColor(new java.awt.Color(153, 153, 153));
        LeftSeat.setIntercellSpacing(new java.awt.Dimension(4, 5));
        LeftSeat.setRowHeight(28);
        jScrollPane3.setViewportView(LeftSeat);

        RightSeat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RightSeat.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        RightSeat.setForeground(new java.awt.Color(0, 153, 153));
        RightSeat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, "1"},
                {null, null, null, "2"},
                {null, null, null, "3"},
                {null, null, null, "4"},
                {null, null, null, "5"},
                {null, null, null, "6"},
                {null, null, null, "7"},
                {null, null, null, "8"},
                {null, null, null, "9"},
                {null, null, null, "10"},
                {null, null, null, "11"},
                {null, null, null, "12"},
                {null, null, null, "13"},
                {null, null, null, "14"},
                {null, null, null, "15"},
                {null, null, null, "16"},
                {null, null, null, "17"},
                {null, null, null, "18"},
                {null, null, null, "19"},
                {null, null, null, "20"},
                {null, null, null, "21"},
                {null, null, null, "22"},
                {null, null, null, "23"},
                {null, null, null, "24"},
                {null, null, null, "25"}
            },
            new String [] {
                "     D", "     E", "     F", ""
            }
        ));
        RightSeat.setAlignmentX(1.0F);
        RightSeat.setAlignmentY(1.0F);
        RightSeat.setGridColor(new java.awt.Color(153, 153, 153));
        RightSeat.setIntercellSpacing(new java.awt.Dimension(4, 5));
        RightSeat.setRowHeight(28);
        RightSeat.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane4.setViewportView(RightSeat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        btnCredApply.setText("Reserve with Credits!");
        btnCredApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCredApplyActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/order-add.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Airliner/jifen.png"))); // NOI18N

        javax.swing.GroupLayout BookFlightPanelLayout = new javax.swing.GroupLayout(BookFlightPanel);
        BookFlightPanel.setLayout(BookFlightPanelLayout);
        BookFlightPanelLayout.setHorizontalGroup(
            BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookFlightPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BookFlightPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addGroup(BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboFlightNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BookFlightPanelLayout.createSequentialGroup()
                                .addGroup(BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(162, 162, 162)
                                .addGroup(BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(BookFlightPanelLayout.createSequentialGroup()
                        .addComponent(findAvailBtn)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addComponent(comboSeatSel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BookFlightPanelLayout.createSequentialGroup()
                        .addGroup(BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reserveFlightBtn)
                            .addComponent(btnCredApply))
                        .addGap(46, 46, 46)
                        .addGroup(BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
        );
        BookFlightPanelLayout.setVerticalGroup(
            BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookFlightPanelLayout.createSequentialGroup()
                .addGroup(BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BookFlightPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboFlightNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFirstName)
                            .addComponent(labelPhoneNum))
                        .addGap(1, 1, 1)
                        .addGroup(BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comboSeatSel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(findAvailBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLastName)
                            .addComponent(labelEmail))
                        .addGap(18, 18, 18)
                        .addGroup(BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDOB)
                            .addComponent(labelGender))
                        .addGap(30, 30, 30)
                        .addGroup(BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reserveFlightBtn)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(BookFlightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCredApply)
                            .addComponent(jLabel8)))
                    .addGroup(BookFlightPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(198, 198, 198))
        );

        backBtn.setText("<<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Your credits: ");

        labelCredits.setText("Display Credits");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/hangbandongtai.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backBtn)
                            .addGap(163, 163, 163)
                            .addComponent(jLabel6)
                            .addGap(48, 48, 48)
                            .addComponent(jLabel1)
                            .addGap(250, 250, 250)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(labelCredits))
                        .addComponent(jScrollPane1))
                    .addComponent(BookFlightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(labelCredits))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(backBtn)
                        .addComponent(jLabel6)))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(BookFlightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void findAvailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findAvailBtnActionPerformed
        // TODO add your handling code here:
        String flightNum = ((Flight)comboFlightNum.getSelectedItem()).getFlightNum();
        comboSeatSel.removeAllItems();
        //ArrayList<String> availSeats = new ArrayList<String>();
        for (Flight myFlight : flightList){
            if ((myFlight.getFlightNum()).equals(flightNum)){

                for(int i = 0; i < 25; i++){
                    for (int j = 0; j < 6; j++){
                        //Customer[][] seats = myFlight.getSeats();

                        if ((myFlight.getFlightSeats())[i][j] == null){

                            String seatStr;
                            //Just convert seat format from: "1A" to "01A"
                            if (i+1 < 10){
                                seatStr = ("0"+Integer.toString(i+1))+seatArr[j];
                            }
                            else{
                                seatStr = (Integer.toString(i+1))+seatArr[j];
                            }

                            comboSeatSel.addItem(seatStr);

                        }
                    }
                }

                return;
            }
        }
    }//GEN-LAST:event_findAvailBtnActionPerformed

    private void reserveFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveFlightBtnActionPerformed
        // TODO add your handling code here:
//        String customerID;
//        int row;
//        String column;
//        if (txtCustomerID.getText().trim().isEmpty()){
//            JOptionPane.showMessageDialog(null, "Error: You must enter a valid string for Customer ID", "Warning", JOptionPane.INFORMATION_MESSAGE);
//            txtCustomerID.setText("");
//            return;
//        }
//        else{
//            customerID = txtCustomerID.getText();
//        }
//        Customer cus = customerDir.searchCustomer(customerID);
        AirlinerWorkRequest airRequest = new AirlinerWorkRequest();
        airRequest.setMessage("I want to purchase this flight ticket");
        airRequest.setOrderFlight((Flight)comboFlightNum.getSelectedItem());
        
        airRequest.setSender(userAccount);
        airRequest.setRequestType("Airliner");
        //rentRequest.setCusCredits(userAccount.getCredits());
        airRequest.setStatus("Applied");
        
        
        Flight f = (Flight)comboFlightNum.getSelectedItem();
        UserAccount airliner = null;
        for (Network network : system.getNetworkList()){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                
                if (enterprise.getName().equals(customerOrganization.getEnterpriseName())){
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if (organization instanceof AirlinerOrganization){
                            for (UserAccount u : organization.getUserAccountDirectory().getUserAccountList()){
                                System.out.println("useraccount airliner name: "+u.getEmployee().getName()+", selected flight's airliner: " + ((Flight)comboFlightNum.getSelectedItem()).getAirlinerName());
                                if (u.getEmployee().getName().equals(f.getAirlinerName())){
                                    airliner = u;
                                    for(int i = 0; i < 25; i++){
                                        for (int j = 0; j < 6; j++){
                                            if (f.getFlightSeats()[i][j] != null){
                                                //System.out.println(f.getSeats()[i][j].getId() );
                                                if (f.getFlightSeats()[i][j].getId().equals(userAccount.getId())){
                                                    
                                                    JOptionPane.showMessageDialog(null, "Seems like you are already reserved for flight: " + f.getFlightNum() + ". Choose different flight", "Warning", JOptionPane.INFORMATION_MESSAGE);
                                                    comboSeatSel.removeAllItems();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (airliner != null){
            userAccount.getFlightOrder().add(f);
            for (Flight flight : airliner.getFlightCatalog()){
                if (flight.getFlightNum().equals(((Flight)comboFlightNum.getSelectedItem()).getFlightNum())){
                    flight.updateSeats(userAccount, (String)comboSeatSel.getSelectedItem());
                }
            }
            
            airRequest.setReceiver(airliner);
            airliner.getWorkQueue().getWorkRequestList().add(airRequest);
            if (!userAccount.getWorkQueue().getRequestMap().containsKey("Airliner")){
                ArrayList<WorkRequest> airRequestList = new ArrayList<WorkRequest>();
                airRequestList.add(airRequest);
                userAccount.getWorkQueue().getRequestMap().put("Airliner", airRequestList);
                
            }
            else{
                userAccount.getWorkQueue().getRequestMap().get("Airliner").add(airRequest);
            }
        }
            
        
        populateTable();
        JOptionPane.showMessageDialog(null, "Congrats! You have sucessfully apply a seat for your flight!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        comboFlightNum.setSelectedItem("");
        comboSeatSel.removeAllItems();
    }//GEN-LAST:event_reserveFlightBtnActionPerformed

    private void comboFlightNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFlightNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFlightNumActionPerformed

    private void comboSeatSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSeatSelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSeatSelActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnCredApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCredApplyActionPerformed
        // TODO add your handling code here:
        AirlinerWorkRequest airRequest = new AirlinerWorkRequest();
        airRequest.setMessage("Purchase this flight ticket using my credits");
        airRequest.setOrderFlight((Flight)comboFlightNum.getSelectedItem());
        airRequest.setIsCredits(true);
        airRequest.setSender(userAccount);
        airRequest.setRequestType("Airliner");
        //rentRequest.setCusCredits(userAccount.getCredits());
        airRequest.setStatus("Applied using credits");
        
        
        Flight f = (Flight)comboFlightNum.getSelectedItem();
        UserAccount airliner = null;
        for (Network network : system.getNetworkList()){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                
                if (enterprise.getName().equals(customerOrganization.getEnterpriseName())){
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if (organization instanceof AirlinerOrganization){
                            for (UserAccount u : organization.getUserAccountDirectory().getUserAccountList()){
                                System.out.println("useraccount airliner name: "+u.getEmployee().getName()+", selected flight's airliner: " + ((Flight)comboFlightNum.getSelectedItem()).getAirlinerName());
                                if (u.getEmployee().getName().equals(f.getAirlinerName())){
                                    airliner = u;
                                    for(int i = 0; i < 25; i++){
                                        for (int j = 0; j < 6; j++){
                                            if (f.getFlightSeats()[i][j] != null){
                                                //System.out.println(f.getSeats()[i][j].getId() );
                                                if (f.getFlightSeats()[i][j].getId().equals(userAccount.getId())){
                                                    
                                                    JOptionPane.showMessageDialog(null, "Seems like you are already reserved for flight: " + f.getFlightNum() + ". Choose different flight", "Warning", JOptionPane.INFORMATION_MESSAGE);
                                                    comboSeatSel.removeAllItems();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (airliner != null){
            userAccount.getFlightOrder().add(f);
            for (Flight flight : airliner.getFlightCatalog()){
                if (flight.getFlightNum().equals(((Flight)comboFlightNum.getSelectedItem()).getFlightNum())){
                    flight.updateSeats(userAccount, (String)comboSeatSel.getSelectedItem());
                }
            }
            System.out.println((Flight)comboFlightNum.getSelectedItem());
            
            airRequest.setReceiver(airliner);
            airliner.getWorkQueue().getWorkRequestList().add(airRequest);
            System.out.println(userAccount.getWorkQueue().getRequestMap());
            if (!userAccount.getWorkQueue().getRequestMap().containsKey("Airliner")){
                ArrayList<WorkRequest> airRequestList = new ArrayList<WorkRequest>();
                airRequestList.add(airRequest);
                userAccount.getWorkQueue().getRequestMap().put("Airliner", airRequestList);
                
            }
            else{
                userAccount.getWorkQueue().getRequestMap().get("Airliner").add(airRequest);
            }
            
        }
            
        
        populateTable();
        JOptionPane.showMessageDialog(null, "Congrats! You have sucessfully booked your flight!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        comboFlightNum.setSelectedItem("");
        comboSeatSel.removeAllItems();
    }//GEN-LAST:event_btnCredApplyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BookFlightPanel;
    private javax.swing.JTable LeftSeat;
    private javax.swing.JTable RightSeat;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnCredApply;
    private javax.swing.JComboBox comboFlightNum;
    private javax.swing.JComboBox comboSeatSel;
    private javax.swing.JButton findAvailBtn;
    private javax.swing.JTable flightDetailTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelCredits;
    private javax.swing.JLabel labelDOB;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelPhoneNum;
    private javax.swing.JButton reserveFlightBtn;
    // End of variables declaration//GEN-END:variables
}
