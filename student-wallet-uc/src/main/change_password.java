/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author reyna
 */
public class change_password extends javax.swing.JFrame {
    int user_id;
    Connection conn;
    Statement stmt;
    ResultSet rs;
    String sql;
    /**
     * Creates new form change_password
     */
    public change_password(int user_id) {
        this.user_id = user_id;
        initComponents();
        connection DB = new connection();
        DB.config();
        conn = DB.conn;
        stmt = DB.stmt;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        student_number = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        new_password = new javax.swing.JTextField();
        submit_password = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        back_balance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(787, 60));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(251, 211, 176));
        jPanel2.setMinimumSize(new java.awt.Dimension(787, 320));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("New password");

        student_number.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Student number");

        new_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        submit_password.setBackground(new java.awt.Color(64, 191, 64));
        submit_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit_password.setText("Change Password");
        submit_password.setBorder(null);
        submit_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(student_number)
                    .addComponent(submit_password, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(new_password))
                .addContainerGap(589, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(student_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(new_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(submit_password, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 820, 390);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(787, 60));

        back_balance.setBackground(new java.awt.Color(255, 255, 255));
        back_balance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_balance.setText("<- Back");
        back_balance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        back_balance.setContentAreaFilled(false);
        back_balance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_balanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(back_balance)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(back_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_balanceActionPerformed
        new adminMenu(user_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_back_balanceActionPerformed

    private void submit_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_passwordActionPerformed
       String target = student_number.getText();
       String password = new_password.getText();
       sql = "SELECT user_id FROM user WHERE nim='" + target + "';";
       try{
           rs = stmt.executeQuery(sql);
           if(rs.next()){
               int target_id = rs.getInt("user_id");
               sql = "UPDATE `user` SET `password` = '" + password + "' WHERE user_id=" + target_id + ";";
               stmt.execute(sql);
               JOptionPane.showMessageDialog(this, "Password changed for user with student number " + target);
           } else {
               JOptionPane.showMessageDialog(this, "There is no user associated with student number " + target);
           }
       } catch(Exception e){
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }//GEN-LAST:event_submit_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_balance;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField new_password;
    private javax.swing.JTextField student_number;
    private javax.swing.JToggleButton submit_password;
    // End of variables declaration//GEN-END:variables
}
