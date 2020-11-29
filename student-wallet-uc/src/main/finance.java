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
    import javax.swing.table.DefaultTableModel;
/**
 *
 * @author reyna
 */
public class finance extends javax.swing.JFrame {
    int user_id;
    int payment_id;
    int amount;
    int balance;
    int page = 0;
    float totalpage = 0;
    int offset = page * 5;
    Connection conn;
    Statement stmt;
    ResultSet rs;
    String sql;
    
    DefaultTableModel model;
    int selected;
    String status;
    /**
     * Creates new form finance
     */
    public finance(int user_id) {
        this.user_id = user_id;
        initComponents();
        init();
        connection DB = new connection();
        DB.config();
        conn = DB.conn;
        stmt = DB.stmt;
        
        DecimalFormat rp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        rp.setDecimalFormatSymbols(formatRp);
        
        sql = "SELECT * FROM payment WHERE user_id=" + user_id + " ORDER BY payment_id DESC LIMIT 10;";
        try{
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                int payment_id = rs.getInt("payment_id");
                int amount = rs.getInt("amount");
                String date = rs.getString("date");
                String status = rs.getString("status");
                model.addRow(new Object[]{payment_id, rp.format(amount), date, status});
            }
            sql = "SELECT count(*) FROM payment WHERE user_id=" + user_id + ";";
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                totalpage = rs.getInt("count(*)");
                totalpage = (float)Math.ceil(totalpage/10) - 1;
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
        back = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        previous = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        display = new javax.swing.JTable();
        pay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Finance");
        setBackground(new java.awt.Color(246, 0, 0));
        setMinimumSize(new java.awt.Dimension(807, 452));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("<- Back");
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(back)
                .addContainerGap(708, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(back)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 790, 60);

        jPanel4.setBackground(new java.awt.Color(251, 211, 176));

        previous.setBackground(new java.awt.Color(64, 191, 64));
        previous.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        previous.setText("Previous Page");
        previous.setBorderPainted(false);
        previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        next.setBackground(new java.awt.Color(64, 191, 64));
        next.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        next.setText("Next Page");
        next.setBorderPainted(false);
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    display.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            displayMouseClicked(evt);
        }
    });
    jScrollPane3.setViewportView(display);

    pay.setBackground(new java.awt.Color(244, 129, 30));
    pay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    pay.setText("Pay");
    pay.setBorder(null);
    pay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    pay.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            payActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(75, 75, 75)
            .addComponent(previous)
            .addGap(178, 178, 178)
            .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(next)
            .addGap(68, 68, 68))
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(21, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 67, Short.MAX_VALUE))))
    );

    getContentPane().add(jPanel4);
    jPanel4.setBounds(0, 60, 790, 350);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MainMenu(user_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        init();
        if(page == 0){
            JOptionPane.showMessageDialog(this, "This is the first page!");
            return;
        } else {
            for(int i = display.getRowCount() - 1; i >= 0; i--){
            model.removeRow(i);
            }
            page--;
        }
        offset = page * 10;
        
        sql = "SELECT * FROM payment WHERE user_id=" + user_id + " ORDER BY payment_id DESC LIMIT 10 OFFSET " + offset + ";";
        try{
            DecimalFormat rp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');

            rp.setDecimalFormatSymbols(formatRp);
            
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                int payment_id = rs.getInt("payment_id");
                int amount = rs.getInt("amount");
                String date = rs.getString("date");
                String status = rs.getString("status");
                model.addRow(new Object[]{payment_id, rp.format(amount), date, status});
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_previousActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        init();
        
        if(page < totalpage){
            page++;
            for(int i = display.getRowCount() - 1; i >= 0; i--){
                model.removeRow(i);
            }
        } else {
            JOptionPane.showMessageDialog(this, "This is the last page!");
            return;
        }
        offset = page * 10;


        sql = "SELECT * FROM payment WHERE user_id=" + user_id + " ORDER BY payment_id DESC LIMIT 10 OFFSET " + offset + ";";
        try{
            DecimalFormat rp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');

            rp.setDecimalFormatSymbols(formatRp);
            
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                payment_id = rs.getInt("payment_id");
                amount = rs.getInt("amount");
                String date = rs.getString("date");
                String status = rs.getString("status");
                model.addRow(new Object[]{payment_id, rp.format(amount), date, status});
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_nextActionPerformed

    private void displayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseClicked
        selected = display.getSelectedRow();
        payment_id = (int) display.getValueAt(selected, 0);
        status = (String) display.getValueAt(selected, 3);
    }//GEN-LAST:event_displayMouseClicked

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        sql = "SELECT balance FROM user WHERE user_id=" + user_id + ";";
        try{
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                balance = rs.getInt("balance");
            }
            sql = "SELECT amount FROM payment WHERE payment_id=" + payment_id + ";";
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                amount = rs.getInt("amount");
            }
            if(amount < balance && status.equals("Unpaid")){
                sql = "SELECT status FROM payment WHERE payment_id=" + payment_id + ";";
                rs = stmt.executeQuery(sql);
                if(rs.next()){
                    status = rs.getString("status");
                    if(status.equals("Unpaid")){
                        
                        DecimalFormat rp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
                        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

                        formatRp.setCurrencySymbol("Rp. ");
                        formatRp.setMonetaryDecimalSeparator(',');
                        formatRp.setGroupingSeparator('.');

                        rp.setDecimalFormatSymbols(formatRp);
                        
                        sql = "UPDATE payment SET status='Paid' WHERE payment_id=" + payment_id + ";";
                        stmt.execute(sql);
                        balance -= amount;
                        sql = "UPDATE user SET balance=" + balance + " WHERE user_id=" + user_id + ";";
                        stmt.execute(sql);
                        java.util.Date date = java.util.Calendar.getInstance().getTime();
                        sql = "INSERT INTO history (user_id, type, amount, date) VALUE(" + user_id + ", 'Payment', " + amount + ", '" + date + "');";
                        stmt.execute(sql);
                        JOptionPane.showMessageDialog(this, "Payment Successful! Payment ID: #" + payment_id + "\n" + rp.format(amount) + "\n" + date);
                        model.setValueAt("Paid", selected, 3);
                    } else {
                        JOptionPane.showMessageDialog(this, "This payment is already paid!");
                        return;
                    }
                }
            } else if(status.equals("Paid")){
                JOptionPane.showMessageDialog(this, "This payment is already paid!");
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Your balance is not enough!");
                return;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_payActionPerformed
    public void init(){
        model = (DefaultTableModel) display.getModel();
        Object[] newIdentifiers = new Object[]{"Payment ID", "Amount", "Date", "Status"};
        model.setColumnIdentifiers(newIdentifiers);
    }
    
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
            java.util.logging.Logger.getLogger(finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTable display;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton next;
    private javax.swing.JButton pay;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables
}
