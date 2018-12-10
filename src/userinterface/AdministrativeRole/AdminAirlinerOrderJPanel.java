/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import Business.EcoSystem;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.Flight;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.UserAccount.UserAccount;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.*;
import Business.WorkQueue.*;
import Business.WorkQueue.WorkRequest;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.db4o.cs.internal.messages.Message;
import java.net.PasswordAuthentication;
/**
 *
 * @author Oliver
 */
public class AdminAirlinerOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminAirlinerOrderJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount adminUserAccount;
    private CustomerOrganization customerOrganization;
    String[] seatArr = {"A","B","C","D","E","F"};
    private Map<String, Double> airlinerMap;
    public AdminAirlinerOrderJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.adminUserAccount = account;
        this.system = business;
        this.customerOrganization = (CustomerOrganization)organization;
        airlinerMap = new HashMap<String, Double>();
        populateTable();
        
    }

    
    public void populateTable(){
        
        int rowCount = tableOrderHistory.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tableOrderHistory.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        //System.out.println(customerOrganization.getUserAccountDirectory().getUserAccountList().size());
        for(UserAccount cusAccount : customerOrganization.getUserAccountDirectory().getUserAccountList()){
            if (cusAccount.getFlightOrder().size() == 0){
                continue;
            }
            int cnt = 0;
            //System.out.println("Flight orders size: "+cusAccount.getFlightOrder().size());
            for (Flight myFlight : cusAccount.getFlightOrder()){
                Object row[] = new Object[8];
                row[0] = cusAccount.getEmail();
                row[1] = cusAccount.getFlightOrder().get(cnt).getAirlinerName();
                row[2] = cusAccount.getFlightOrder().get(cnt).getFlightNum();
                row[3] = cusAccount.getFlightOrder().get(cnt).getDate();
                row[4] = cusAccount.getFlightOrder().get(cnt).getDeparture();
                row[5] = cusAccount.getFlightOrder().get(cnt).getArrival();
                UserAccount[][] seats = cusAccount.getFlightOrder().get(cnt).getFlightSeats();
                for(int i = 0; i < 25; i++){
                    for (int j = 0; j < 6; j++){
                        if (seats[i][j] != null){
                            if (seats[i][j].getId().equals(cusAccount.getId())){
                                String seatStr;
                                //Just convert seat format from: "1A" to "01A"
                                if (i+1 < 10){
                                    seatStr = ("0"+Integer.toString(i+1))+seatArr[j];
                                }
                                else{
                                    seatStr = (Integer.toString(i+1))+seatArr[j];
                                }
                                row[6] = seatStr;
                            }
                        }

                    }
                }
                if (cusAccount.getWorkQueue().getRequestMap().get("Airliner").get(cnt).getPriceChange()){
                    row[7] = cusAccount.getWorkQueue().getRequestMap().get("Airliner").get(cnt).getPrice();
                }
                else{
                    row[7] = myFlight.getPrice();
                }
                model.addRow(row);
                cnt++;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrderHistory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        btnAnalyzeAirliners = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEmail = new javax.swing.JButton();

        tableOrderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer Email", "Airliner", "Flight Number", "Date", "Departure", "Arrival", "Seat", "Price"
            }
        ));
        jScrollPane1.setViewportView(tableOrderHistory);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("AIRLINE FLIGHT ORDER HISTORY");

        backBtn.setText("<<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        btnAnalyzeAirliners.setText("Analyze Airliners");
        btnAnalyzeAirliners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzeAirlinersActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/icon-p_lishibaobiao.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/hangbandongtai.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/riqi.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/shijian.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/zuowei.png"))); // NOI18N

        btnEmail.setText("Send Email Confirmation To Customer");
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel2)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(250, 250, 250)
                                .addComponent(btnEmail)
                                .addGap(220, 220, 220)
                                .addComponent(btnAnalyzeAirliners))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)))
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(btnAnalyzeAirliners)
                    .addComponent(btnEmail))
                .addContainerGap(397, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnAnalyzeAirlinersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzeAirlinersActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(UserAccount cusAccount : customerOrganization.getUserAccountDirectory().getUserAccountList()){
            if (cusAccount.getFlightOrder().size() == 0){
                continue;
            }
            for (Flight myFlight : cusAccount.getFlightOrder()){
                if (airlinerMap.containsKey(myFlight.getAirlinerName())){
                    
                    airlinerMap.put(myFlight.getAirlinerName(), airlinerMap.get(myFlight.getAirlinerName())+myFlight.getPrice());
                }
                else{

                    airlinerMap.put(myFlight.getAirlinerName(), myFlight.getPrice());

                }
            }
        }
        Set<Map.Entry<String, Double>> set = airlinerMap.entrySet();
        List<Map.Entry<String, Double>> list = new ArrayList<Map.Entry<String, Double>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Double>>()
        {
            public int compare( Map.Entry<String, Double> o1, Map.Entry<String, Double> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Double> entry:list){
            dataset.setValue(entry.getValue(), "Sales Value($)", entry.getKey());
        }
        JFreeChart airlinerChart = ChartFactory.createBarChart("Airliners Total Sales Value", "Airliner Name", "Sales Value($)", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = airlinerChart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame frame = new ChartFrame("Bar chart for airliners", airlinerChart);
        frame.setVisible(true);
        frame.setSize(800, 500);
    }//GEN-LAST:event_btnAnalyzeAirlinersActionPerformed

    private void btnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailActionPerformed
        // TODO add your handling code here:
        int row = tableOrderHistory.getSelectedRow();
        if (row<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        AdminAirlinerSendEmailJPanel adminAirEmailJPanel = new AdminAirlinerSendEmailJPanel(userProcessContainer, (String)tableOrderHistory.getValueAt(row, 0),(String)tableOrderHistory.getValueAt(row, 1),
                (String)tableOrderHistory.getValueAt(row, 2), (String)tableOrderHistory.getValueAt(row, 3), (String)tableOrderHistory.getValueAt(row, 4), (String)tableOrderHistory.getValueAt(row, 5), (String)tableOrderHistory.getValueAt(row, 6), (Double)tableOrderHistory.getValueAt(row, 7));
        userProcessContainer.add("AdminAirlinerSendEmailJPanel",adminAirEmailJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnAnalyzeAirliners;
    private javax.swing.JButton btnEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableOrderHistory;
    // End of variables declaration//GEN-END:variables
}
