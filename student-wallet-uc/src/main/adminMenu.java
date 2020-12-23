/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Timer;

/**
 *
 * @author reyna
 */
public class adminMenu extends javax.swing.JPanel {
    Timer updateTimer;
    int DELAY = 100;
    int user_id;

   
    /**
     * Creates new form adminMenu
     */
    public adminMenu(int user_id) {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        change_balance = new javax.swing.JButton();
        change_status = new javax.swing.JButton();
        change_password = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        finance = new javax.swing.JButton();
        history = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(746, 592));

        jPanel1.setBackground(new java.awt.Color(251, 211, 176));

        jPanel3.setBackground(new java.awt.Color(244, 129, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Ciputra_logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        welcome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        welcome.setText("0");

        clock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clock.setText("0");

        change_balance.setBackground(new java.awt.Color(64, 191, 64));
        change_balance.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        change_balance.setForeground(new java.awt.Color(255, 255, 255));
        change_balance.setText("Change Balane");
        change_balance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        change_balance.setBorderPainted(false);
        change_balance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        change_balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_balanceActionPerformed(evt);
            }
        });

        change_status.setBackground(new java.awt.Color(64, 191, 64));
        change_status.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        change_status.setForeground(new java.awt.Color(255, 255, 255));
        change_status.setText("Change Status");
        change_status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        change_status.setBorderPainted(false);
        change_status.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        change_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_statusActionPerformed(evt);
            }
        });

        change_password.setBackground(new java.awt.Color(64, 191, 64));
        change_password.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        change_password.setForeground(new java.awt.Color(255, 255, 255));
        change_password.setText("Change Password");
        change_password.setBorderPainted(false);
        change_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        change_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_passwordActionPerformed(evt);
            }
        });

        withdraw.setBackground(new java.awt.Color(64, 191, 64));
        withdraw.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        withdraw.setForeground(new java.awt.Color(255, 255, 255));
        withdraw.setText("Withdraw");
        withdraw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        withdraw.setBorderPainted(false);
        withdraw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        finance.setBackground(new java.awt.Color(64, 191, 64));
        finance.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        finance.setForeground(new java.awt.Color(255, 255, 255));
        finance.setText("Finance");
        finance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        finance.setBorderPainted(false);
        finance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        finance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financeActionPerformed(evt);
            }
        });

        history.setBackground(new java.awt.Color(64, 191, 64));
        history.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        history.setForeground(new java.awt.Color(255, 255, 255));
        history.setText("Transaction History");
        history.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        history.setBorderPainted(false);
        history.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(64, 191, 64));
        logout.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.setBorderPainted(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clock)
                .addGap(30, 30, 30))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(change_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(change_password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(change_status, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finance, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(change_password, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(finance, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(change_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(change_status, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(146, 146, 146))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(welcome)
                            .addComponent(clock))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void change_balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_balanceActionPerformed
        new deposit(user_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_change_balanceActionPerformed

    private void change_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_statusActionPerformed
        new transfer(user_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_change_statusActionPerformed

    private void change_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_passwordActionPerformed
        new balance(user_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_change_passwordActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        new withdraw(user_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_withdrawActionPerformed

    private void financeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financeActionPerformed
        new finance(user_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_financeActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        new history(user_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_historyActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new auth().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change_balance;
    private javax.swing.JButton change_password;
    private javax.swing.JButton change_status;
    private javax.swing.JLabel clock;
    private javax.swing.JButton finance;
    private javax.swing.JButton history;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logout;
    private javax.swing.JLabel welcome;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}
