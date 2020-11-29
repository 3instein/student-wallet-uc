/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
    import java.sql.Connection;
    import java.sql.ResultSet;
    import java.sql.Statement;
    import java.text.DecimalFormat;
    import java.text.DecimalFormatSymbols;
    import javax.swing.*;
/**
 *
 * @author micha
 */
public class transfer extends javax.swing.JFrame {
    int user_id;
    int balance = 0;
    int transaction_id;
    String target;
    Connection conn;
    Statement stmt;
    ResultSet rs;
    String sql;
    String sql_target;
    /**
     * Creates new form transfer
     */
    public transfer(int user_id) {
        initComponents();
        connection DB = new connection();
        DB.config();
        conn = DB.conn;
        stmt = DB.stmt;
        this.user_id = user_id;
        try{
            sql = "SELECT balance FROM user WHERE user_id=" + user_id + ";";
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                balance = rs.getInt("balance");
                DecimalFormat rp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
                DecimalFormatSymbols formatRp =  new DecimalFormatSymbols();
                
                formatRp.setCurrencySymbol("Rp. ");
                formatRp.setMonetaryDecimalSeparator(',');
                formatRp.setGroupingSeparator('.');
                rp.setDecimalFormatSymbols(formatRp);
                
                transfer_balance.setText(rp.format(balance));
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
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

        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        transfer_balance = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        transfer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        transfer_amount = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        transfer_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transfer");
        setMinimumSize(new java.awt.Dimension(787, 452));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("<- Back");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addContainerGap(688, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 770, 60);

        jPanel4.setBackground(new java.awt.Color(251, 211, 176));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Available for Transfer");

        transfer_balance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        transfer_balance.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Student  ID");

        transfer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Amount");

        transfer_amount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Note : Minimun transfer amount Rp. 10.000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(500, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        transfer_button.setBackground(new java.awt.Color(64, 191, 64));
        transfer_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        transfer_button.setText("Transfer");
        transfer_button.setBorderPainted(false);
        transfer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(transfer_balance)
                    .addComponent(jLabel3)
                    .addComponent(transfer)
                    .addComponent(transfer_amount)
                    .addComponent(transfer_button, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(transfer_balance)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(transfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(transfer_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(transfer_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 60, 770, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MainMenu(user_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void transfer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer_buttonActionPerformed
        int amount = Integer.valueOf(transfer_amount.getText());
        try{
            if(transfer.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Student ID cannot be empty!");
                return;
            } else {
                target = transfer.getText();
            }                    
            if(amount > 10000){
                if (amount < balance - 100000){
                    sql = "SELECT balance, user_id FROM user WHERE nim=" + target + ";";
                    rs = stmt.executeQuery(sql);
                    balance = balance - amount;
                    if(rs.next()){
                        int balance_target = rs.getInt("balance");
                        int user_id_target = rs.getInt("user_id");
                        if(user_id_target == user_id){
                            JOptionPane.showMessageDialog(this, "You cannot transfer to yourself!");
                            transfer.setText("");
                            transfer_amount.setText("");
                            return;
                        }
                        balance_target = balance_target + amount;
                        sql = "UPDATE user SET balance=" + balance + " WHERE user_id=" + user_id + ";";
                        sql_target = "UPDATE user SET balance=" + balance_target + " WHERE nim=" + target + ";";
                        stmt.execute(sql);
                        stmt.execute(sql_target);
                        DecimalFormat rp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
                        DecimalFormatSymbols formatRp =  new DecimalFormatSymbols();

                        formatRp.setCurrencySymbol("Rp. ");
                        formatRp.setMonetaryDecimalSeparator(',');
                        formatRp.setGroupingSeparator('.');
                        rp.setDecimalFormatSymbols(formatRp);
                        transfer_balance.setText(rp.format(balance));
                        transfer.setText("");
                        transfer_amount.setText("");
                        
                        java.util.Date date=java.util.Calendar.getInstance().getTime();
                        sql = "INSERT INTO history (user_id, type, amount, date) VALUE("+ user_id +", 'Outgoing Transfer', " + amount + ", '" + date + "');";
                        sql_target = "INSERT INTO history (user_id, type, amount, date) VALUE("+ user_id_target +", 'Incoming Transfer', " + amount + ", '" + date + "');";
                        stmt.execute(sql);
                        stmt.execute(sql_target);
                        sql = "SELECT transaction_id FROM history WHERE user_id=" + user_id + ";";
                        rs = stmt.executeQuery(sql);
                        if(rs.next()){
                            transaction_id = rs.getInt("transaction_id");
                        }
                        JOptionPane.showMessageDialog(this, "Transfer Successful! Transaction ID: #" + transaction_id + "\n" + target + "\n" + rp.format(amount) + "\n" + date);
                    } else {
                        JOptionPane.showMessageDialog(this, "Student ID not found!");
                        transfer.setText("");
                    }
                } else{
                    JOptionPane.showMessageDialog(this, "Minimum balance left after withdrawal is Rp. 100.000");
                    transfer_amount.setText("");
                }
            } else if(amount < 10000){
                JOptionPane.showMessageDialog(this, "Minimum transfer amount is Rp. 10.000");
                transfer_amount.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_transfer_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField transfer;
    private javax.swing.JTextField transfer_amount;
    private javax.swing.JLabel transfer_balance;
    private javax.swing.JButton transfer_button;
    // End of variables declaration//GEN-END:variables
}
