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
    import java.text.DecimalFormat;
    import java.text.DecimalFormatSymbols;
    import javax.swing.*;
    import javax.swing.table.DefaultTableModel;
/**
 *
 * @author reyna
 */
public class history extends javax.swing.JFrame {
    int user_id;
    int page = 0;
    float totalpage = 0;
    int offset = page * 10;
    Connection conn;
    Statement stmt;
    ResultSet rs;
    String sql;
   
    DefaultTableModel model;
   
    /**
     * Creates new form history
     */

    public history(int user_id) {
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
        
        sql = "SELECT * FROM history WHERE user_id=" + user_id + " ORDER BY transaction_id DESC LIMIT 10;";
        try{
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                int transaction_id = rs.getInt("transaction_id");
                String type = rs.getString("type");
                int amount = rs.getInt("amount");
                String date = rs.getString("date");
                model.addRow(new Object[]{transaction_id, type, rp.format(amount), date});
            }
            sql = "SELECT count(*) FROM history WHERE user_id=" + user_id + ";";
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                totalpage = rs.getInt("count(*)");
                totalpage = (float)Math.ceil(totalpage/10) - 1;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public void init(){
        model = (DefaultTableModel) display.getModel();
        Object[] newIdentifiers = new Object[]{"Transaction ID", "Type", "Amount", "Date"};
        model.setColumnIdentifiers(newIdentifiers);
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
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        display = new javax.swing.JTable();
        previous = new javax.swing.JButton();
        next = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transaction History");
        setMinimumSize(new java.awt.Dimension(787, 452));
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(799, 0, 28, 400);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
                .addContainerGap(696, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(back)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 770, 60);

        jPanel4.setBackground(new java.awt.Color(251, 211, 176));

        display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jScrollPane3.setViewportView(display);

    previous.setBackground(new java.awt.Color(64, 191, 64));
    previous.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    previous.setText("Previous Page");
    previous.setBorderPainted(false);
    previous.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            previousActionPerformed(evt);
        }
    });

    next.setBackground(new java.awt.Color(64, 191, 64));
    next.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    next.setText("Next Page");
    next.setBorderPainted(false);
    next.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            nextActionPerformed(evt);
        }
    });

    search.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            searchKeyPressed(evt);
        }
    });

    jLabel2.setText("Search by Date ( ex : Apr 1 )");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(85, 85, 85)
            .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(113, 113, 113)
            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(85, 85, 85))
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addGap(316, 316, 316)
            .addComponent(jLabel2)
            .addGap(331, 331, 331))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel2)
                    .addGap(10, 10, 10)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(69, 69, 69))
    );

    getContentPane().add(jPanel4);
    jPanel4.setBounds(0, 60, 770, 350);

    pack();
    setLocationRelativeTo(null);
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
        
        sql = "SELECT * FROM history WHERE user_id=" + user_id + " ORDER BY transaction_id DESC LIMIT 10 OFFSET " + offset + ";";
        try{
            DecimalFormat rp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');

            rp.setDecimalFormatSymbols(formatRp);
            
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                int transaction_id = rs.getInt("transaction_id");
                String type = rs.getString("type");
                int amount = rs.getInt("amount");
                String date = rs.getString("date");
                model.addRow(new Object[]{transaction_id, type, rp.format(amount), date});
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


        sql = "SELECT * FROM history WHERE user_id=" + user_id + " ORDER BY transaction_id DESC LIMIT 10 OFFSET " + offset + ";";
        try{
            DecimalFormat rp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');

            rp.setDecimalFormatSymbols(formatRp);
            
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                int transaction_id = rs.getInt("transaction_id");
                String type = rs.getString("type");
                int amount = rs.getInt("amount");
                String date = rs.getString("date");
                model.addRow(new Object[]{transaction_id, type, rp.format(amount), date});
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_nextActionPerformed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            init();
            String date = search.getText();
            for(int i = display.getRowCount() - 1; i >= 0; i--){
                model.removeRow(i);
            }
            
            DecimalFormat rp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');

            rp.setDecimalFormatSymbols(formatRp);
            
            sql = "SELECT * FROM history WHERE date LIKE '%" + date + "%' AND user_id=" + user_id + ";";
            try{
                rs = stmt.executeQuery(sql);
                while(rs.next()){
                    int transaction_id = rs.getInt("transaction_id");
                    String type = rs.getString("type");
                    int amount = rs.getInt("amount");
                    date = rs.getString("date");
                    model.addRow(new Object[]{transaction_id, type, rp.format(amount), date});
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_searchKeyPressed

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
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
