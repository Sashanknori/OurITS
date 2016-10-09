/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourits.jobcosting.ui;

import com.ourits.jobcosting.helpers.InvokerHelper;

/**
 *
 * @author Other guest
 */
public class HomeSreen extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form NewJFrame
     */
    public HomeSreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonProjectEntry = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonSubProjectEntry = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonTaskEntry = new javax.swing.JButton();
        buttonExpensesEntry = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        buttonBackup = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        seperatorLogAndButtons = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 150), new java.awt.Dimension(0, 150), new java.awt.Dimension(32767, 150));
        seperatorLogoAndDashboard = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelAccountSettings = new javax.swing.JLabel();
        labelCompanyName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelCompanyLogo = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        menuItemFile = new javax.swing.JMenu();
        menuItemEdit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        buttonProjectEntry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/resources/1474589767_Portfolio.png"))); // NOI18N
        buttonProjectEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProjectEntryActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(buttonProjectEntry);
        jLabel1.setText("Project Entry");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonSubProjectEntry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/resources/1474591217_Draft.png"))); // NOI18N
        buttonSubProjectEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubProjectEntryActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setLabelFor(buttonProjectEntry);
        jLabel2.setText("Sub Project Entry");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setLabelFor(buttonProjectEntry);
        jLabel3.setText("Task Entry");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonTaskEntry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/resources/1474591225_Todo.png"))); // NOI18N
        buttonTaskEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTaskEntryActionPerformed(evt);
            }
        });

        buttonExpensesEntry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/resources/1474591405_Project Plan - Gant Chart.png"))); // NOI18N
        buttonExpensesEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExpensesEntryActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setLabelFor(buttonProjectEntry);
        jLabel4.setText("Expenses Entry");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/resources/1474591768_backup.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setLabelFor(buttonProjectEntry);
        jLabel5.setText("Backup");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setText("(c) Intuitive Technologies & Solutions | All rights reserved");

        seperatorLogoAndDashboard.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/resources/1474593395_Bar_Graph80x90.png"))); // NOI18N
        jLabel11.setText("Dashboard");

        jLabel12.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/resources/Icon - alert.png"))); // NOI18N
        jLabel12.setText("Alerts");

        jLabel13.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/resources/1474594325_Milestone100x100.png"))); // NOI18N
        jLabel13.setText("Milestones");

        jLabel14.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/resources/1474594919_vector_65_1480x90.png"))); // NOI18N
        jLabel14.setText("Reports");

        labelAccountSettings.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelAccountSettings.setForeground(new java.awt.Color(0, 51, 153));
        labelAccountSettings.setText("Account settings");

        labelCompanyName.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        labelCompanyName.setText("INTUITIVE TECHNOLOGIES & SOLUTIONS");
        labelCompanyName.setToolTipText("");

        labelCompanyLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/resources/00106-3D-company-logos-design-free-logo-online-02.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCompanyLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCompanyLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuItemFile.setText("File");
        menubar.add(menuItemFile);

        menuItemEdit.setText("Edit");
        menubar.add(menuItemEdit);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAccountSettings)
                                    .addComponent(labelCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seperatorLogoAndDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonProjectEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonSubProjectEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonTaskEntry))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonExpensesEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(seperatorLogAndButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelCompanyName)
                                .addGap(18, 18, 18)
                                .addComponent(labelAccountSettings)
                                .addGap(36, 36, 36))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seperatorLogoAndDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                .addComponent(seperatorLogAndButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonTaskEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonSubProjectEntry)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonProjectEntry)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonExpensesEntry))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonProjectEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProjectEntryActionPerformed
    InvokerHelper invokerHelper = new InvokerHelper();
    invokerHelper.doInvoke(new ProjectEntry());
    }//GEN-LAST:event_buttonProjectEntryActionPerformed

    private void buttonSubProjectEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubProjectEntryActionPerformed
    InvokerHelper invokerHelper = new InvokerHelper();
    invokerHelper.doInvoke(new SubProjectEntry());    }//GEN-LAST:event_buttonSubProjectEntryActionPerformed

    private void buttonTaskEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTaskEntryActionPerformed
    InvokerHelper invokerHelper = new InvokerHelper();
    invokerHelper.doInvoke(new TaskEntry());    }//GEN-LAST:event_buttonTaskEntryActionPerformed

    private void buttonExpensesEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExpensesEntryActionPerformed
    InvokerHelper invokerHelper = new InvokerHelper();
    invokerHelper.doInvoke(new ProjectExpensesEntry());
    }//GEN-LAST:event_buttonExpensesEntryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeSreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeSreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeSreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeSreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeSreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBackup;
    private javax.swing.JButton buttonExpensesEntry;
    private javax.swing.JButton buttonProjectEntry;
    private javax.swing.JButton buttonSubProjectEntry;
    private javax.swing.JButton buttonTaskEntry;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAccountSettings;
    private javax.swing.JLabel labelCompanyLogo;
    private javax.swing.JLabel labelCompanyName;
    private javax.swing.JMenu menuItemEdit;
    private javax.swing.JMenu menuItemFile;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JSeparator seperatorLogAndButtons;
	private javax.swing.JSeparator seperatorLogoAndDashboard;
	// End of variables declaration//GEN-END:variables
}
