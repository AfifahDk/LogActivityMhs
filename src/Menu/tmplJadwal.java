/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import Menu.konek;
import Menu.konek;
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
            String sql = "SELECT * FROM jadwal WHERE hari LIKE ('%"+txts.getText()+"%') AND username='" + Username + "'";
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
        model.addColumn("hari");
        model.addColumn("kegiatan");
        model.addColumn("tempat");
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

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JLabel();
        txtshow = new javax.swing.JLabel();
        txts = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbljadwal = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(254, 211, 48));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tampilan/Files-2-icon.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("LOG ACITIVITY MAHASISWA");

        txtsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tampilan/Zoom-icon.png"))); // NOI18N
        txtsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsearchMouseClicked(evt);
            }
        });

        txtshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tampilan/Button-1-play-icon (1).png"))); // NOI18N
        txtshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtshowMouseClicked(evt);
            }
        });

        txts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(txtshow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtshow)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsearch))))
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        jPanel3.setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tbljadwal.setBackground(new java.awt.Color(254, 211, 48));
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

        jPanel1.setBackground(new java.awt.Color(254, 211, 48));

        txtback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tampilan/Arrow-prevous-5-icon.png"))); // NOI18N
        txtback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtback)
                .addContainerGap(802, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtback)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel4, "card2");

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 860, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbackMouseClicked
        // TODO add your handling code here:
        dispose();
        jadwal n = new jadwal();
        n.setVisible(true);
    }//GEN-LAST:event_txtbackMouseClicked

    private void txtsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseClicked
        // TODO add your handling code here:
        Stampil();
    }//GEN-LAST:event_txtsearchMouseClicked

    private void txtshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtshowMouseClicked
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_txtshowMouseClicked

    private void txtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbljadwal;
    private javax.swing.JLabel txtback;
    private javax.swing.JTextField txts;
    private javax.swing.JLabel txtsearch;
    private javax.swing.JLabel txtshow;
    // End of variables declaration//GEN-END:variables
}
