/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourits.jobcosting.ui;

/**
 *
 * @author Other guest
 */
public class LoginScreen extends javax.swing.JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form HomeScreen
	 */
	public LoginScreen() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuBar2 = new javax.swing.JMenuBar();
		jMenu3 = new javax.swing.JMenu();
		jMenu4 = new javax.swing.JMenu();
		jScrollPane1 = new javax.swing.JScrollPane();
		textboxUsername = new javax.swing.JTextPane();
		labelUsername = new javax.swing.JLabel();
		labelPassword = new javax.swing.JLabel();
		testboxPassword = new javax.swing.JPasswordField();
		buttonLogin = new javax.swing.JButton();
		buttonReset = new javax.swing.JButton();
		labelForgotPassword = new javax.swing.JLabel();
		seperatorBottomForCopyrights = new javax.swing.JSeparator();
		labelAboutUs = new javax.swing.JLabel();
		seperatorTopForCompanyLogo = new javax.swing.JSeparator();

		jMenu1.setText("File");
		jMenuBar1.add(jMenu1);

		jMenu2.setText("Edit");
		jMenuBar1.add(jMenu2);

		jMenuItem1.setText("jMenuItem1");

		jMenu3.setText("File");
		jMenuBar2.add(jMenu3);

		jMenu4.setText("Edit");
		jMenuBar2.add(jMenu4);

		setForeground(new java.awt.Color(153, 153, 255));

		jScrollPane1.setViewportView(textboxUsername);

		labelUsername.setText("Username");

		labelPassword.setText("Password");

		testboxPassword.setText("jPasswordField1");

		buttonLogin.setText("Login");
		buttonLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonLoginActionPerformed(evt);
			}
		});

		buttonReset.setText("Reset");

		labelForgotPassword.setText("Forgot Password?");

		labelAboutUs.setForeground(new java.awt.Color(0, 0, 255));
		labelAboutUs.setText("©® 2016 by Intuitive Technologies & Solutions");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(73, 73, 73)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(labelUsername, javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(labelPassword, javax.swing.GroupLayout.Alignment.TRAILING))
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(labelForgotPassword)
										.addGroup(layout.createSequentialGroup().addComponent(buttonLogin)
												.addGap(18, 18, 18).addComponent(buttonReset))
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(testboxPassword).addComponent(jScrollPane1,
														javax.swing.GroupLayout.PREFERRED_SIZE, 196,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 41, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(seperatorTopForCompanyLogo,
												javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(seperatorBottomForCopyrights)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
										.addGap(0, 0, Short.MAX_VALUE).addComponent(labelAboutUs)))))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(89, 89, 89)
						.addComponent(seperatorTopForCompanyLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
								javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(labelUsername).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(testboxPassword, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(labelPassword))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(buttonLogin).addComponent(buttonReset))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(labelForgotPassword)
				.addGap(44, 44, 44)
				.addComponent(seperatorBottomForCopyrights, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(labelAboutUs)
				.addGap(7, 7, 7)));

		buttonLogin.getAccessibleContext().setAccessibleName("Submit");
	}// </editor-fold>//GEN-END:initComponents

	private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonLoginActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_buttonLoginActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton buttonLogin;
	private javax.swing.JButton buttonReset;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuBar jMenuBar2;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel labelAboutUs;
	private javax.swing.JLabel labelForgotPassword;
	private javax.swing.JLabel labelPassword;
	private javax.swing.JLabel labelUsername;
	private javax.swing.JSeparator seperatorBottomForCopyrights;
	private javax.swing.JSeparator seperatorTopForCompanyLogo;
	private javax.swing.JPasswordField testboxPassword;
	private javax.swing.JTextPane textboxUsername;
	// End of variables declaration//GEN-END:variables
}
