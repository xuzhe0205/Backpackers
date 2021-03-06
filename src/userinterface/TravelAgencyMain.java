/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainJFrame.java
 *
 * Created on Sep 28, 2012, 11:21:25 PM
 */

package userinterface;
import userinterface.Airliner.AirlinerLoginJPanel;
import Business.*;
import Business.DB4OUtil.DB4OUtil;
import Business.Network.Network;
import Business.Enterprise.Enterprise;
import Business.Organization.OrganizationDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.Customer.CustomerLoginJPanel;
import java.awt.CardLayout;
import userinterface.CarRental.*;
import userinterface.Hotel.*;
import userinterface.RailWay.*;
import javax.swing.JPanel;
import userinterface.AdministrativeRole.AdministrativeLoginJPanel;

/**
 *
 * @author Rushabh
 */
public class TravelAgencyMain extends javax.swing.JFrame {

//    private MasterOrderCatalog moc;
    private AirlinerDirectory airlinerDir;
    private CustomerDirectory cusDir;
    private OrganizationDirectory organizationDir;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /** Creates new form MainJFrame */





    public TravelAgencyMain() {
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH);
//        moc = new MasterOrderCatalog();
        airlinerDir = new AirlinerDirectory();
        cusDir = new CustomerDirectory();
        organizationDir = new OrganizationDirectory();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSysAdmin = new javax.swing.JButton();
        customerBtn = new javax.swing.JButton();
        btnRailway = new javax.swing.JButton();
        btnCarRental = new javax.swing.JButton();
        btnHotel = new javax.swing.JButton();
        btnAirliner = new javax.swing.JButton();
        btnAdministrative = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(150);

        jLabel1.setFont(new java.awt.Font("华文宋体", 0, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(97, 102, 100));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BackPackers");

        btnSysAdmin.setFont(new java.awt.Font("华文宋体", 0, 18)); // NOI18N
        btnSysAdmin.setForeground(new java.awt.Color(97, 102, 100));
        btnSysAdmin.setText("System Admin");
        btnSysAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSysAdminActionPerformed(evt);
            }
        });

        customerBtn.setFont(new java.awt.Font("华文宋体", 0, 18)); // NOI18N
        customerBtn.setForeground(new java.awt.Color(97, 102, 100));
        customerBtn.setText("Customer");
        customerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerBtnActionPerformed(evt);
            }
        });

        btnRailway.setFont(new java.awt.Font("华文宋体", 0, 18)); // NOI18N
        btnRailway.setForeground(new java.awt.Color(97, 102, 100));
        btnRailway.setText("Railway Co.");
        btnRailway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRailwayActionPerformed(evt);
            }
        });

        btnCarRental.setFont(new java.awt.Font("华文宋体", 0, 18)); // NOI18N
        btnCarRental.setForeground(new java.awt.Color(97, 102, 100));
        btnCarRental.setText("CarRental.Co");
        btnCarRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarRentalActionPerformed(evt);
            }
        });

        btnHotel.setFont(new java.awt.Font("华文宋体", 0, 18)); // NOI18N
        btnHotel.setForeground(new java.awt.Color(97, 102, 100));
        btnHotel.setText("Hotel");
        btnHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHotelActionPerformed(evt);
            }
        });

        btnAirliner.setFont(new java.awt.Font("华文宋体", 0, 18)); // NOI18N
        btnAirliner.setForeground(new java.awt.Color(97, 102, 100));
        btnAirliner.setText("Airliner Co.");
        btnAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirlinerActionPerformed(evt);
            }
        });

        btnAdministrative.setFont(new java.awt.Font("华文宋体", 0, 18)); // NOI18N
        btnAdministrative.setForeground(new java.awt.Color(97, 102, 100));
        btnAdministrative.setText("Administrative");
        btnAdministrative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrativeActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/32lvxing.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/xitong.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/denglu.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/hangbandongtai.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/tielu.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/qiche.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/AdministrativeRole/jiudian.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Customer/huiyishi.png"))); // NOI18N

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHotel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCarRental, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRailway, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAirliner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdministrative, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSysAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(60, 60, 60)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSysAdmin)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdministrative)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAirliner)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRailway)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarRental)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHotel)
                    .addComponent(jLabel8))
                .addGap(50, 50, 50)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customerBtn)
                    .addComponent(jLabel9))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(controlPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());

        jTextField1.setBackground(new java.awt.Color(240, 240, 240));
        jTextField1.setFont(new java.awt.Font("华文宋体", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(97, 102, 100));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Feed Your Wanderlust");
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        userProcessContainer.add(jTextField1, "card2");

        jSplitPane1.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSysAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSysAdminActionPerformed
        // TODO add your handling code here:
        SysAdminLoginJPanel adminLoginJPanel = new SysAdminLoginJPanel(userProcessContainer, system);
        userProcessContainer.add("AdminLoginJPanel",adminLoginJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSysAdminActionPerformed

    private void customerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerBtnActionPerformed
        // TODO add your handling code here:
        CustomerLoginJPanel customerLoginJPanel = new CustomerLoginJPanel(userProcessContainer, system);
        userProcessContainer.add("CustomerLoginJPanel",customerLoginJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_customerBtnActionPerformed

    
    private void btnAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirlinerActionPerformed
        // TODO add your handling code here:
        AirlinerLoginJPanel airlinerLoginJPanel = new AirlinerLoginJPanel(userProcessContainer, system);
        userProcessContainer.add("AirlinerLoginJPanel",airlinerLoginJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAirlinerActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnAdministrativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrativeActionPerformed
        // TODO add your handling code here:
        AdministrativeLoginJPanel adminLoginJPanel = new AdministrativeLoginJPanel(userProcessContainer, system);
        userProcessContainer.add("AdminLoginJPanel",adminLoginJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAdministrativeActionPerformed

    private void btnHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHotelActionPerformed
        // TODO add your handling code here:
        HotelLogInJpanel hotelLoginJPanel = new HotelLogInJpanel(userProcessContainer, system);
        userProcessContainer.add("HotelLoginJPanel",hotelLoginJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnHotelActionPerformed

    private void btnCarRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarRentalActionPerformed
        // TODO add your handling code here:
//        for (Network network : system.getNetworkList()){
//            
//            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
//                
//                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//                    
//                    if (organization.getName().equals("CarRental Organization")){
//                        for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()){
//                            System.out.println(ua.getUsername());
//
//                        }
//                    }
//                }
//            }
//        }
        CarRentalLoginJPanel carRentalLoginJPanel = new CarRentalLoginJPanel(userProcessContainer, system);
        userProcessContainer.add("CarRentalLoginJPanel",carRentalLoginJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCarRentalActionPerformed

    private void btnRailwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRailwayActionPerformed
        // TODO add your handling code here:
        RailWayLoginJPanel railwayLoginJPanel = new RailWayLoginJPanel(userProcessContainer, system);
        userProcessContainer.add("RailwayLoginJPanel",railwayLoginJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRailwayActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrative;
    private javax.swing.JButton btnAirliner;
    private javax.swing.JButton btnCarRental;
    private javax.swing.JButton btnHotel;
    private javax.swing.JButton btnRailway;
    private javax.swing.JButton btnSysAdmin;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton customerBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

}
 


