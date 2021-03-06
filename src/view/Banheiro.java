/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entidade.Mercadorias;
import entidade.Status;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Convidado1
 */
public class Banheiro extends javax.swing.JDialog {

    Status st;
    Mercadorias m;

    public Banheiro(java.awt.Frame parent, boolean modal, Status st, Mercadorias m) {
        super(parent, modal);
        this.st = st;
        this.m = m;
        initComponents();
        btnChuveiroEletrico.setEnabled(false);
        btnChuveiroInteiror.setEnabled(false);
        
        if(m.getContChuveiroInterior()==1){
            btnChuveiroInteiror.setEnabled(true);
            btnTomarBanho.setEnabled(false);
        } else{
            btnChuveiroInteiror.setEnabled(false);
        }
        if(m.getContChuveiroEletrico()==1){
            btnChuveiroEletrico.setEnabled(true);
            btnTomarBanho.setEnabled(false);
        } else{
            btnChuveiroEletrico.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTomarBanho = new javax.swing.JButton();
        btnChuveiroInteiror = new javax.swing.JButton();
        btnChuveiroEletrico = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Banheiro");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Banheiro");

        btnTomarBanho.setText("Tomar banho de água usada");
        btnTomarBanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomarBanhoActionPerformed(evt);
            }
        });

        btnChuveiroInteiror.setText("Chuveiro de interior");
        btnChuveiroInteiror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuveiroInteirorActionPerformed(evt);
            }
        });

        btnChuveiroEletrico.setText("Chuveiro Elétrico");
        btnChuveiroEletrico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuveiroEletricoActionPerformed(evt);
            }
        });

        jButton4.setText("Fechar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTomarBanho)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnChuveiroInteiror)
                                            .addComponent(btnChuveiroEletrico)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTomarBanho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChuveiroEletrico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChuveiroInteiror)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Banheiro.this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnTomarBanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomarBanhoActionPerformed
        btnTomarBanho.setEnabled(false);
        st.aumentarHigiene(10);
        st.t = new Timer(90000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnTomarBanho.setEnabled(true);
                st.t.stop();
            }
        });
        st.t.start();
    }//GEN-LAST:event_btnTomarBanhoActionPerformed

    private void btnChuveiroEletricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuveiroEletricoActionPerformed
        btnChuveiroEletrico.setEnabled(false);
        st.aumentarHigiene(50);
        st.t = new Timer(90000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnChuveiroEletrico.setEnabled(true);
                st.t.stop();
            }
        });
        st.t.start();
    }//GEN-LAST:event_btnChuveiroEletricoActionPerformed

    private void btnChuveiroInteirorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuveiroInteirorActionPerformed
        btnChuveiroInteiror.setEnabled(false);
        st.aumentarHigiene(25);
        st.t = new Timer(90000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnChuveiroInteiror.setEnabled(true);
                st.t.stop();
            }
        });
        st.t.start();
    }//GEN-LAST:event_btnChuveiroInteirorActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Banheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Banheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Banheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Banheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Banheiro dialog = new Banheiro(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuveiroEletrico;
    private javax.swing.JButton btnChuveiroInteiror;
    private javax.swing.JButton btnTomarBanho;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
