/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entidade.CavernaDeMineracao;
import entidade.Status;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import jdk.nashorn.internal.ir.BreakNode;


public class Caverna extends javax.swing.JDialog {
    
    private Random r = new Random();
    Status st;
    CavernaDeMineracao cm = new CavernaDeMineracao();
    
    public Caverna(java.awt.Frame parent, boolean modal, Status st) {
        super(parent, modal);
        this.st = st;
        initComponents();
        lblStamina.setText("Stamina: " + st.getDisposicao());
        lblClay.setText("Argila: "+cm.getClay());
        lblCopper.setText("Cobre: "+cm.getCopperOre());
        lblPedra.setText("Pedra: "+cm.getStone());
        lblFerro.setText("Ferro: "+cm.getIronOre());
        lblOuro.setText("Ouro: "+cm.getGoldOre());
        lblDiamante.setText("Diamante: "+cm.getDiamond());
        lblEstanho.setText("Estanho: "+cm.getTinOre());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblStamina = new javax.swing.JLabel();
        lblPedra = new javax.swing.JLabel();
        lblClay = new javax.swing.JLabel();
        lblCopper = new javax.swing.JLabel();
        lblEstanho = new javax.swing.JLabel();
        lblFerro = new javax.swing.JLabel();
        lblOuro = new javax.swing.JLabel();
        lblDiamante = new javax.swing.JLabel();
        btnMinerar = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Caverna da Mineração");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStamina.setText("jLabel1");
        lblStamina.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPedra.setText("jLabel1");
        lblPedra.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblClay.setText("jLabel1");
        lblClay.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCopper.setText("jLabel1");
        lblCopper.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblEstanho.setText("jLabel1");
        lblEstanho.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblFerro.setText("jLabel1");
        lblFerro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblOuro.setText("jLabel1");
        lblOuro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDiamante.setText("jLabel1");
        lblDiamante.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnMinerar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnMinerar.setText("Minerar");
        btnMinerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinerarActionPerformed(evt);
            }
        });

        btnVender.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/minerar.png"))); // NOI18N

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblEstanho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStamina, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPedra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFerro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblClay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOuro, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDiamante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCopper, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFechar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMinerar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStamina)
                    .addComponent(lblPedra)
                    .addComponent(lblClay)
                    .addComponent(lblCopper))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstanho)
                            .addComponent(lblFerro)
                            .addComponent(lblOuro)
                            .addComponent(lblDiamante))
                        .addGap(18, 18, 18)
                        .addComponent(btnMinerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVender))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblImagem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinerarActionPerformed
        st.t.stop();
        btnMinerar.setEnabled(false);
        Integer numero = r.nextInt(19);
        switch(numero){
            case 0: cm.aumentarClay(1);
            break;
            case 1: cm.aumentarClay(1);
            break;
            case 2: cm.aumentarClay(1);
            break;
            case 3: cm.aumentarClay(1);
            break;
            case 4: cm.aumentarClay(1);
            break;
            case 5: cm.aumentarClay(1);
            break;
            case 6: cm.aumentarClay(1);
            break;
            case 7: cm.aumentarClay(1);
            break;
            case 8: cm.aumentarStone(1);
            break;
            case 9: cm.aumentarStone(1);
            break;
            case 10: cm.aumentarStone(1);
            break;
            case 11: cm.aumentarStone(1);
            break;
            case 12: cm.aumentarStone(1);
            break;
            case 13: cm.aumentarStone(1);
            break;
            case 14: cm.aumentarCopperOre(1);
            break;
            case 15: cm.aumentarDiamond(1);
            break;
            case 16: cm.aumentarGoldOre(1);
            break;
            case 17: cm.aumentarIronOre(1);
            break;
            case 18: cm.aumentarTinOre(1);
            break;
        }
        st.diminuirStamina(r.nextInt(3)+1);
        lblStamina.setText("Stamina: " + st.getStamina());
        lblClay.setText("Argila: "+cm.getClay());
        lblCopper.setText("Cobre: "+cm.getCopperOre());
        lblPedra.setText("Pedra: "+cm.getStone());
        lblFerro.setText("Ferro: "+cm.getIronOre());
        lblOuro.setText("Ouro: "+cm.getGoldOre());
        lblDiamante.setText("Diamante: "+cm.getDiamond());
        lblEstanho.setText("Estanho: "+cm.getTinOre());
        if(st.getStamina()>0){
            st.t = new Timer(100, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    btnMinerar.setEnabled(true);
                }
            });
            st.t.start();
        }
        if(st.getStamina()<=0){
            btnMinerar.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Sua stamina chegou ao fim."
                    + "\nVolte mais tarde");
            
        }
        
    }//GEN-LAST:event_btnMinerarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        Caverna.this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        Float dinhero = (float)((cm.getStone()*0.5)+(cm.getClay()*0.5)
                +(cm.getCopperOre()*1)+(cm.getDiamond()*5)+(cm.getGoldOre()*4)
                +(cm.getIronOre()*2)+(cm.getTinOre()*1));
        st.aumentarDinheiro(dinhero);
        cm.setClay(0);
        cm.setCopperOre(0);
        cm.setDiamond(0);
        cm.setGoldOre(0);
        cm.setIronOre(0);
        cm.setStone(0);
        cm.setTinOre(0);
        lblStamina.setText("Stamina: " + st.getStamina());
        lblClay.setText("Argila: "+cm.getClay());
        lblCopper.setText("Cobre: "+cm.getCopperOre());
        lblPedra.setText("Pedra: "+cm.getStone());
        lblFerro.setText("Ferro: "+cm.getIronOre());
        lblOuro.setText("Ouro: "+cm.getGoldOre());
        lblDiamante.setText("Diamante: "+cm.getDiamond());
        lblEstanho.setText("Estanho: "+cm.getTinOre());
        JOptionPane.showMessageDialog(null, "Você ganhou R$"+dinhero+""
                + "\ne agora você tem R$"+st.getDinheiro());
    }//GEN-LAST:event_btnVenderActionPerformed

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
//            java.util.logging.Logger.getLogger(Dungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Dungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Dungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Dungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Dungeon dialog = new Dungeon(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnMinerar;
    private javax.swing.JButton btnVender;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblClay;
    private javax.swing.JLabel lblCopper;
    private javax.swing.JLabel lblDiamante;
    private javax.swing.JLabel lblEstanho;
    private javax.swing.JLabel lblFerro;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblOuro;
    private javax.swing.JLabel lblPedra;
    private javax.swing.JLabel lblStamina;
    // End of variables declaration//GEN-END:variables
}
