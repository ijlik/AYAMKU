/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayam.view;

/**
 *
 * @author anggy
 */
public class infoObat3 extends javax.swing.JFrame {

    /**
     * Creates new form infoObat3
     */
    public infoObat3() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kembali2 = new javax.swing.JLabel();
        kembali1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembali2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembali2MouseClicked(evt);
            }
        });
        getContentPane().add(kembali2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 20, 30));

        kembali1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembali1MouseClicked(evt);
            }
        });
        getContentPane().add(kembali1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/info obat 3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembali2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembali2MouseClicked
        new infoObat2().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_kembali2MouseClicked

    private void kembali1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembali1MouseClicked
        new infoObat().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_kembali1MouseClicked

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
            java.util.logging.Logger.getLogger(infoObat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(infoObat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(infoObat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(infoObat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new infoObat3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kembali1;
    private javax.swing.JLabel kembali2;
    // End of variables declaration//GEN-END:variables
}
