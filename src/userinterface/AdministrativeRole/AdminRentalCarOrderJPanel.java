/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;
import Business.EcoSystem;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Car;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.util.Comparator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collections;
/**
 *
 * @author Oliver
 */
public class AdminRentalCarOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminRentalCarOrderJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount adminUserAccount;
    private CustomerOrganization customerOrganization;
    private Map<String, Double> carRentalMap;
    private Map<String, Integer> carMadeMap;
    public AdminRentalCarOrderJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.adminUserAccount = account;
        this.system = business;
        this.customerOrganization = (CustomerOrganization)organization;
        carRentalMap = new HashMap<String, Double>();
        carMadeMap = new HashMap<String, Integer>();
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
            if (cusAccount.getCustomerOrder().size() == 0){
                continue;
            }
            int cnt = 0;
            //System.out.println("Flight orders size: "+cusAccount.getFlightOrder().size());
            for (Car car : cusAccount.getCustomerOrder()){
                Object row[] = new Object[8];
                row[0] = cusAccount.getEmail();
                row[1] = cusAccount.getCustomerOrder().get(cnt).getCompanyName();
                row[2] = cusAccount.getCustomerOrder().get(cnt).getCarType();
                row[3] = cusAccount.getCustomerOrder().get(cnt).getCarClass();
                row[4] = cusAccount.getCustomerOrder().get(cnt).getMade();
                row[5] = cusAccount.getCustomerOrder().get(cnt).getModel();
                row[6] = cusAccount.getCustomerOrder().get(cnt).getCapacity();
                if (cusAccount.getWorkQueue().getRequestMap().get("CarRental").get(cnt).getPriceChange()){
                    row[7] = cusAccount.getWorkQueue().getRequestMap().get("CarRental").get(cnt).getPrice();
                }
                else{
                    row[7] = car.getPrice();
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

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        btnAnalyzeCarRental = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrderHistory = new javax.swing.JTable();
        btnCarMade = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("RENTAL CAR ORDER HISTORY");

        backBtn.setText("<<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        btnAnalyzeCarRental.setText("Analyze By Car Rentals Company");
        btnAnalyzeCarRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzeCarRentalActionPerformed(evt);
            }
        });

        tableOrderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer Email", "Rental Company", "Vehicle Type", "Vehicle Class", "Vehicle Made", "Vehicle Model", "Passenger Cap", "Price"
            }
        ));
        jScrollPane1.setViewportView(tableOrderHistory);

        btnCarMade.setText("Analyze By Rental Car Made");
        btnCarMade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarMadeActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/icon-p_lishibaobiao.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/zonghefenxi.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/zonghefenxi.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/denglu.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/riqi.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/qiche.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/meiyuandollar153.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backBtn)
                        .addGap(501, 501, 501)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCarMade)
                            .addComponent(btnAnalyzeCarRental)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backBtn)
                            .addComponent(btnAnalyzeCarRental)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCarMade)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    
    private void btnAnalyzeCarRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzeCarRentalActionPerformed
        // TODO add your handling code here:
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(UserAccount cusAccount : customerOrganization.getUserAccountDirectory().getUserAccountList()){
            //System.out.println(cusAccount.getCustomerOrder().size());
            if (cusAccount.getCustomerOrder().size() == 0){
                
                continue;
            }
            for (Car car : cusAccount.getCustomerOrder()){
                if (carRentalMap.containsKey(car.getCompanyName())){
                    
                    carRentalMap.put(car.getCompanyName(), carRentalMap.get(car.getCompanyName())+car.getPrice());
                }
                else{

                    carRentalMap.put(car.getCompanyName(), car.getPrice());

                }
            }
        }
        Set<Entry<String, Double>> set = carRentalMap.entrySet();
        List<Entry<String, Double>> list = new ArrayList<Entry<String, Double>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Double>>()
        {
            public int compare( Map.Entry<String, Double> o1, Map.Entry<String, Double> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Double> entry:list){
            dataset.setValue(entry.getValue(), "Rental Value($)", entry.getKey());
        }
        JFreeChart rentalCompChart = ChartFactory.createBarChart("Rental Company Total Rental Value", "Car Rental Company Name", "Rental Value($)", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = rentalCompChart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame frame = new ChartFrame("Bar chart for Car Rental Company", rentalCompChart);
        frame.setVisible(true);
        frame.setSize(800, 500);
    }//GEN-LAST:event_btnAnalyzeCarRentalActionPerformed

    private void btnCarMadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarMadeActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(UserAccount cusAccount : customerOrganization.getUserAccountDirectory().getUserAccountList()){
            if (cusAccount.getCustomerOrder().size() == 0){
                continue;
            }
            for (Car car : cusAccount.getCustomerOrder()){
                if (carMadeMap.containsKey(car.getMade())){

                    carMadeMap.put(car.getMade(), carMadeMap.get(car.getMade())+1);
                }
                else{

                    carMadeMap.put(car.getMade(), 1);

                }
            }
        }
        Set<Entry<String, Integer>> set = carMadeMap.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            dataset.setValue(entry.getValue(), "Rental Count", entry.getKey());
        }
        JFreeChart carMadeChart = ChartFactory.createBarChart("Popular Car Made In Market", "Car Made", "Rental Count", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = carMadeChart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame frame = new ChartFrame("Bar chart for Popular Car Made In Market", carMadeChart);
        frame.setVisible(true);
        frame.setSize(800, 500);
    }//GEN-LAST:event_btnCarMadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnAnalyzeCarRental;
    private javax.swing.JButton btnCarMade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableOrderHistory;
    // End of variables declaration//GEN-END:variables
}
