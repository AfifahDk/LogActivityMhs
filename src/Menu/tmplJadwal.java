/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;


import Menu.jadwal;
import Menu.konek;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import View.Login;

/**
 *
 * @author ASUS
 */
public class tmplJadwal extends javax.swing.JFrame {

    /**
     * Creates new form tmplJadwal
     */
    String Username;
    private void Stampil(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("no");
        model.addColumn("semester");
        model.addColumn("hari");
        model.addColumn("mata kuliah / kegiatan");
        model.addColumn("ruangan / tempat");
        model.addColumn("waktu mulai");
        model.addColumn("waktu selesai");
        
        try{
            String sql = "SELECT * FROM jadwal WHERE hari LIKE ('"+cbshari.getSelectedItem()+"')";
            java.sql.Connection con = (Connection)konek.konekDB();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[] {res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});   
            }
            tbljadwal.setModel(model);
            
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }

    }
    private void tampil(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("no");
 //       model.addColumn("semester");
        model.addColumn("hari");
        model.addColumn("mata kuliah / kegiatan");
        model.addColumn("ruangan / tempat");
        model.addColumn("waktu mulai");
        model.addColumn("waktu selesai");
        
        try{
           
            String sql = "SELECT * FROM jadwal where username ='"+Username+"'";
            java.sql.Connection con = (Connection)konek.konekDB();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[] {res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});   
            }
            tbljadwal.setModel(model);
            
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }

    }
    public tmplJadwal() {
        initComponents();
        Stampil();
        tampil();
    }
    
    public tmplJadwal(String Username) {
        initComponents();
        this.Username=Username;
        Stampil();
        tampil();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbljadwal = new javax.swing.JTable();
        btnback = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        cbshari = new javax.swing.JComboBox<>();
        btnall = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbljadwal.setBackground(new java.awt.Color(0, 153, 102));
        tbljadwal.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        tbljadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbljadwal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 930, 100));

        btnback.setBackground(new java.awt.Color(0, 153, 102));
        btnback.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnback.setText("back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btnsearch.setBackground(new java.awt.Color(0, 153, 102));
        btnsearch.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnsearch.setText("search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 11, -1, -1));

        cbshari.setBackground(new java.awt.Color(0, 153, 102));
        cbshari.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        cbshari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SENIN", "SELASA", "RABU", "KAMIS", "JUMAT", "SABTU", "MINGGU" }));
        cbshari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbshariActionPerformed(evt);
            }
        });
        getContentPane().add(cbshari, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 12, -1, -1));

        btnall.setBackground(new java.awt.Color(0, 153, 102));
        btnall.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnall.setText("show all");
        btnall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallActionPerformed(evt);
            }
        });
        getContentPane().add(btnall, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 11, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\Microsoft Surface Laptop.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 930, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        dispose();
        jadwal n = new jadwal();
        n.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        Stampil();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void cbshariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbshariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbshariActionPerformed

    private void btnallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallActionPerformed
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_btnallActionPerformed

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
            java.util.logging.Logger.getLogger(tmplJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tmplJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tmplJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tmplJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tmplJadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnall;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> cbshari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbljadwal;
    // End of variables declaration//GEN-END:variables
}