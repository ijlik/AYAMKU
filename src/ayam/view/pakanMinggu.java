/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayam.view;

import ayam.Controller.Pakan;
import ayam.Model.PAKAN;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

public class pakanMinggu extends javax.swing.JFrame {

    ayam.Model.PAKAN ayam;
    String[][] pakan;
    String keterangan;
    String komposisi;
    String minggu;

    public pakanMinggu() throws SQLException {
        ayam = new PAKAN();
        jenisPakan = new JComboBox();
        pakan = ayam.getPakan3();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void clearInput() {
        jumlah.setText("");
        harga.setText("");
        efek.setText("");
    }
    public pakanMinggu(String s) throws SQLException {
        ayam = new PAKAN();
        jenisPakan = new JComboBox();
        pakan = ayam.getPakan3();
        initComponents();
        this.setLocationRelativeTo(null);        
    }

    public String getPakan1() {
        int a= jenisPakan.getSelectedIndex();
         System.out.println("woooooooyyyyyy " + pakan[0][a]);
         return pakan[0][a];
         
    }
     public String getPakan() {
        return jenisPakan.getSelectedItem().toString();
    }
//     public String getPakan1() {
//        return jenisPakan.getSelectedItem().toString();
//    }
    public String getEfek() {
        return efek.getText();
    }
    
    public String getHarga() {
        return harga.getText();
    }
    
    public String getKeterangan() {
        return keterangan;
    }
    
    public String getKomposisi() {
        return komposisi;
    }
    
    public String getJumlah() {
        return jumlah.getText();
    }
    
    public void setefek(String efek) {
        this.efek.setText(efek);
    }
    public void setKeterangan(String efek) {
        this.keterangan = efek;
    }
    public void setKomposisi(String efek) {
        this.komposisi = efek;
    }
    
    public void setMinggu(String efek) {
        this.minggu = efek;
    }
    
    public void setharga(String harga) {
        this.harga.setText(harga);
    }
    
    public void setjumlah(String jumlah) {
        this.jumlah.setText(jumlah);
    }
    
    public void addbeliListener(ActionListener listener) {
        beli.addActionListener(listener);
    }

    public void addrincianListener(ActionListener listener) {
        rincian.addActionListener(listener);
    }
    
    public void addpilihListener(ActionListener listener) {
        jenisPakan.addActionListener(listener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rincian = new javax.swing.JButton();
        harga = new javax.swing.JLabel();
        efek = new javax.swing.JLabel();
        beli = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jumlah = new javax.swing.JTextField();
        jenisPakan = new javax.swing.JComboBox(pakan[1]);
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rincian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button rincian 1.png"))); // NOI18N
        rincian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(rincian, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 90, 30));
        getContentPane().add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 100, 40));
        getContentPane().add(efek, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 90, 40));

        beli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button beli 1.png"))); // NOI18N
        beli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(beli, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 90, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button-info-1.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 100, 30));

        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button-kembali-1.png"))); // NOI18N
        kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 90, 30));

        jumlah.setBorder(null);
        getContentPane().add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 120, 40));
        getContentPane().add(jenisPakan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 130, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pembelian pakan.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new infoPakan1().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_kembaliActionPerformed

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
                // TODO add your handling code here:
    }//GEN-LAST:event_kembaliMouseClicked

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
            java.util.logging.Logger.getLogger(pakanMinggu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pakanMinggu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pakanMinggu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pakanMinggu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new pakanMinggu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(pakanMinggu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton beli;
    private javax.swing.JLabel efek;
    private javax.swing.JLabel harga;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jenisPakan;
    private javax.swing.JTextField jumlah;
    private javax.swing.JButton kembali;
    private javax.swing.JButton rincian;
    // End of variables declaration//GEN-END:variables
}