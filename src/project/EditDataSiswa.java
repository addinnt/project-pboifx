/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer Swift 3
 */
public class EditDataSiswa extends javax.swing.JFrame {

    /**
     * Creates new form EditDataSiswa
     */
    public EditDataSiswa() {
        initComponents();
        tampil_combo();
       
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
        jLabelId = new javax.swing.JLabel();
        jLabelNama = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jLabelKelas = new javax.swing.JLabel();
        jTextFieldKelas = new javax.swing.JTextField();
        jLabelNoTelp = new javax.swing.JLabel();
        jTextFieldNoTelp = new javax.swing.JTextField();
        jLabelAlamat = new javax.swing.JLabel();
        jTextFieldAlamat = new javax.swing.JTextField();
        jButtonSubmit = new javax.swing.JButton();
        jComboBoxId = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Form Edit Data Siswa");

        jLabelId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelId.setText("ID");

        jLabelNama.setText("Nama");

        jTextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaActionPerformed(evt);
            }
        });

        jLabelKelas.setText("Kelas");

        jLabelNoTelp.setText("No.Telp");

        jLabelAlamat.setText("Alamat");

        jTextFieldAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlamatActionPerformed(evt);
            }
        });

        jButtonSubmit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonSubmit.setText("Update");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jComboBoxId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-pilih ID-" }));
        jComboBoxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIdActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelId)
                            .addComponent(jLabelNama)
                            .addComponent(jLabelKelas)
                            .addComponent(jLabelNoTelp)
                            .addComponent(jLabelAlamat))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSubmit)
                                .addGap(46, 46, 46)
                                .addComponent(jButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldNama)
                                .addComponent(jTextFieldKelas)
                                .addComponent(jTextFieldNoTelp)
                                .addComponent(jTextFieldAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                .addComponent(jComboBoxId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelId)
                            .addComponent(jComboBoxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNama)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabelKelas))
                    .addComponent(jTextFieldKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoTelp)
                    .addComponent(jTextFieldNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAlamat)
                    .addComponent(jTextFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSubmit)
                    .addComponent(jButton1))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void tampil_combo()
    {
        try {
        Connection c = KoneksiDatabase.getKoneksi();
        Statement s = c.createStatement();
        String sql = "select id from siswa order by id asc";      // disini saya menampilkan NIM, anda dapat menampilkan
        ResultSet res = s.executeQuery(sql);                                // yang anda ingin kan
        
        while(res.next()){
            Object[] ob = new Object[4];
            ob[0] = res.getString(1);
            
            jComboBoxId.addItem(ob[0]);                                      // fungsi ini bertugas menampung isi dari database
        }
        res.close(); s.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void tampil()
    {
        try {
        Connection c = KoneksiDatabase.getKoneksi();
        Statement s = c.createStatement();
        String sql = "select nama, alamat, no_telp, kelas from siswa where id='"+jComboBoxId.getSelectedItem()+"'";  
        ResultSet res = s.executeQuery(sql);
        
        while(res.next()){
            Object[] ob = new Object[4];
            ob[0]=  res.getString(1);//nama
            ob[1]= res.getString(2);//alamat
            ob[2]= res.getString(3);//no_telp
            ob[3]= res.getString(4);//kelas
            
            jTextFieldNama.setText((String) ob[0]);
            jTextFieldKelas.setText((String) ob[3]);
            jTextFieldNoTelp.setText((String) ob[2]);
            jTextFieldAlamat.setText((String) ob[1]);
        }
        res.close(); s.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }              
    }
    private void DeleteData() {
    
    String sql = "DELETE FROM siswa WHERE id='" + jComboBoxId.getSelectedItem() + "'";
    try {
        Connection c = KoneksiDatabase.getKoneksi();
        Statement s = c.createStatement();
        s.executeUpdate(sql);
    } catch (Exception e) {
        System.out.println("Terjadi kesalahan, karena " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan, karena " + e.getMessage());
    }
}
    
    private void jTextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaActionPerformed

    private void jTextFieldAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlamatActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        try {
            Connection c = KoneksiDatabase.getKoneksi();
             Statement s = c.createStatement();
             //String sql = "UPDATE siswa SET nama='" + jTextFieldNama.getText() + "',kelas='" + jTextFieldKelas.getText() + "',WHERE id_barang='" + idBarang + "'";
             String sql = "update siswa SET "
                     + "nama='"+this.jTextFieldNama.getText()+"'"
                     + ",kelas='"+this.jTextFieldKelas.getText()+"'"
                     + ",alamat='"+this.jTextFieldAlamat.getText()+"'"
                     + ",no_telp='"+this.jLabelNoTelp.getText()+"'"
                     + "where id='"+this.jComboBoxId.getSelectedItem()+"'";
             PreparedStatement mStatement = (PreparedStatement) c.prepareStatement(sql);
             mStatement.executeUpdate();
             mStatement.close();
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "terjadi kesalahan"+ex.getMessage());
        }
       
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jComboBoxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxIdActionPerformed
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_jComboBoxIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int hasil = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data dengan id " + jComboBoxId.getSelectedItem(), null, JOptionPane.YES_NO_OPTION);
        if (hasil == JOptionPane.YES_OPTION) {
            DeleteData();
            new LihatDataAdmin().show();
            
            JOptionPane.showMessageDialog(null, "Data telah berhasil dihapus!");
        } else if (hasil == JOptionPane.NO_OPTION) {
           JOptionPane.showMessageDialog(null, "Data batal dihapus!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditDataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditDataSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JComboBox jComboBoxId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAlamat;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelKelas;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelNoTelp;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextFieldAlamat;
    private javax.swing.JTextField jTextFieldKelas;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldNoTelp;
    // End of variables declaration//GEN-END:variables
}
