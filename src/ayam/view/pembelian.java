/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayam.view;

import java.awt.event.MouseListener;

/**
 *
 * @author anggy
 */
public class pembelian extends javax.swing.JFrame {

    public pembelian() {
        initComponents();
        back1.setVisible(false);
        back2.setVisible(false);
        back3.setVisible(false);
      
        this.setLocationRelativeTo(null);
    }

    public void setModal(String modal) {
        this.modal.setText(modal);
    }

    public String getModal() {
        return modal.getText();
    }

    public void ayam(MouseListener e) {
        this.back1.addMouseListener(e);
    }

    public void kembali(MouseListener e) {
        this.kembali.addMouseListener(e);
    }

    public void kandang(MouseListener e) {
        this.back2.addMouseListener(e);
    }

    public void pakan(MouseListener e) {
        this.back3.addMouseListener(e);
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ayam = new javax.swing.JLabel();
        back1 = new javax.swing.JLabel();
        kandang = new javax.swing.JLabel();
        back2 = new javax.swing.JLabel();
        oval3 = new javax.swing.JLabel();
        pakan = new javax.swing.JLabel();
        back3 = new javax.swing.JLabel();
        oval4 = new javax.swing.JLabel();
        oval2 = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        modal = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ayam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/3.png"))); // NOI18N
        ayam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(ayam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 90, 120));

        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/2.png"))); // NOI18N
        back1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, 130));

        kandang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/4.png"))); // NOI18N
        kandang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(kandang, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 100, 110));

        back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/2.png"))); // NOI18N
        back2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 130, -1));

        oval3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1.png"))); // NOI18N
        oval3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oval3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oval3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                oval3MouseExited(evt);
            }
        });
        getContentPane().add(oval3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 140, 140));

        pakan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/5.png"))); // NOI18N
        pakan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(pakan, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 100, 130));

        back3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/2.png"))); // NOI18N
        back3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(back3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 130, -1));

        oval4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1.png"))); // NOI18N
        oval4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oval4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oval4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                oval4MouseExited(evt);
            }
        });
        getContentPane().add(oval4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 140, 140));

        oval2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1.png"))); // NOI18N
        oval2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oval2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oval2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                oval2MouseExited(evt);
            }
        });
        getContentPane().add(oval2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 140, 140));

        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button-kembali-1.png"))); // NOI18N
        kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/coinkecil.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 50, 40));

        modal.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        getContentPane().add(modal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 130, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bg-tampilan-awal.png"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oval2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oval2MouseEntered
        back1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_oval2MouseEntered

    private void oval3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oval3MouseEntered
        back2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_oval3MouseEntered

    private void oval4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oval4MouseEntered
        back3.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_oval4MouseEntered

    private void oval2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oval2MouseExited
        back1.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_oval2MouseExited

    private void oval3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oval3MouseExited
        back2.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_oval3MouseExited

    private void oval4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oval4MouseExited
        back3.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_oval4MouseExited

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
//        new utama().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ayam;
    private javax.swing.JLabel back1;
    private javax.swing.JLabel back2;
    private javax.swing.JLabel back3;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kandang;
    private javax.swing.JButton kembali;
    private javax.swing.JLabel modal;
    private javax.swing.JLabel oval2;
    private javax.swing.JLabel oval3;
    private javax.swing.JLabel oval4;
    private javax.swing.JLabel pakan;
    // End of variables declaration//GEN-END:variables
}