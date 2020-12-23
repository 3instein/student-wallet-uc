/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.Timer;

/**
 *
 * @author reyna
 */
public class adminMenu extends javax.swing.JFrame {
    Timer updateTimer;
    int DELAY = 100;
    int user_id;
    /**
     * Creates new form adminMenu
     */
    public adminMenu(int user_id) {
        this.user_id = user_id;
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
        view_history = new javax.swing.JButton();
        view_finance = new javax.swing.JButton();
        maintanance = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(730, 560));
        getContentPane().setLayout(null);

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
        change_balance.setText("Change Balance");
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

        view_history.setBackground(new java.awt.Color(64, 191, 64));
        view_history.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        view_history.setForeground(new java.awt.Color(255, 255, 255));
        view_history.setText("View History");
        view_history.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        view_history.setBorderPainted(false);
        view_history.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_historyActionPerformed(evt);
            }
        });

        view_finance.setBackground(new java.awt.Color(64, 191, 64));
        view_finance.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        view_finance.setForeground(new java.awt.Color(255, 255, 255));
        view_finance.setText("View Finance");
        view_finance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        view_finance.setBorderPainted(false);
        view_finance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_finance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_financeActionPerformed(evt);
            }
        });

        maintanance.setBackground(new java.awt.Color(64, 191, 64));
        maintanance.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        maintanance.setForeground(new java.awt.Color(255, 255, 255));
        maintanance.setText("Maintanance");
        maintanance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        maintanance.setBorderPainted(false);
        maintanance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maintanance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintananceActionPerformed(evt);
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
                            .addComponent(view_history, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(view_finance, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maintanance, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(view_history, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(view_finance, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(change_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(maintanance, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 730, 560);

        pack();
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

    private void view_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_historyActionPerformed
        new withdraw(user_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_view_historyActionPerformed

    private void view_financeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_financeActionPerformed
        new finance(user_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_view_financeActionPerformed

    private void maintananceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintananceActionPerformed
        new history(user_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_maintananceActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new auth().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change_balance;
    private javax.swing.JButton change_password;
    private javax.swing.JButton change_status;
    private javax.swing.JLabel clock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logout;
    private javax.swing.JButton maintanance;
    private javax.swing.JButton view_finance;
    private javax.swing.JButton view_history;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
