package view;

import entidade.Mercadorias;
import entidade.Status;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tamagotchi extends javax.swing.JDialog {

    private final Status st;
    private final Integer tempo_status = 10000;
    private final Mercadorias m;

    public Tamagotchi(java.awt.Frame parent, boolean modal, Status st, Mercadorias m) {
        super(parent, modal);
        this.st = st;
        this.m = m;
        initComponents();
        lblCansado.setEnabled(false);
        lblDoente.setEnabled(false);
        lblTriste.setEnabled(false);
        lblFaminto.setEnabled(false);
        lblSujo.setEnabled(false);
        
        st.t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblNome.setText("Nome: "+st.toString());
                lblDinheiro.setText("Dinheiro: " + st.getDinheiro());
                lblHP.setText("Vida: " + st.getHP());
                lblComida.setText("Comida: " + st.getComida());
                lblFelicidade.setText("Felicidade: " + st.getFelicidade());
                lblDisposicao.setText("Disposição: " + st.getDisposicao());
                lblHigiene.setText("Higiene: " + st.getHigiene());
            }
        });
        st.t.start();
        st.t = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                st.diminuirComida(4);
                st.diminuirDisposicao(8);
                st.diminuirFelicidade(13);
                st.diminuirHP(7);
                st.diminuirHigiene(11);
                lblNome.setText("Nome: " + st.toString());
                lblHP.setText("Vida: " + st.getHP());
                lblComida.setText("Comida: " + st.getComida());
                lblFelicidade.setText("Felicidade: " + st.getFelicidade());
                lblDisposicao.setText("Disposição: " + st.getDisposicao());
                lblHigiene.setText("Higiene: " + st.getHigiene());
                if (st.getHP() < 80) {
                    if (st.getDisposicao() <= 45) {
                        st.diminuirComida(6);
                        st.diminuirFelicidade(9);
                        lblCansado.setEnabled(true);
                        lblFeliz.setEnabled(false);
                    }
                    if (st.getFelicidade() <= 75) {
                        st.diminuirDisposicao(8);
                        st.diminuirHP(3);
                        lblTriste.setEnabled(true);
                        lblFeliz.setEnabled(false);
                    }
                    if (st.getComida() <= 40) {
                        st.diminuirFelicidade(12);
                        st.diminuirHP(7);
                        st.diminuirDisposicao(5);
                        lblFaminto.setEnabled(true);
                        lblFeliz.setEnabled(false);
                    }
                    if (st.getHigiene() <= 70) {
                        st.diminuirComida(6);
                        st.diminuirFelicidade(10);
                        st.diminuirDisposicao(6);
                        st.diminuirHP(13);
                        lblDoente.setEnabled(true);
                        lblSujo.setEnabled(true);
                        lblFeliz.setEnabled(false);
                    }
                } else {
                    lblFeliz.setEnabled(true);
                    lblCansado.setEnabled(false);
                    lblDoente.setEnabled(false);
                    lblTriste.setEnabled(false);
                    lblFaminto.setEnabled(false);
                    lblSujo.setEnabled(false);
                }
                st.verificarStatus();
            }
        });
        st.t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblHP = new javax.swing.JLabel();
        lblComida = new javax.swing.JLabel();
        lblFelicidade = new javax.swing.JLabel();
        lblDisposicao = new javax.swing.JLabel();
        lblHigiene = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnHigiene = new javax.swing.JButton();
        btnHP = new javax.swing.JButton();
        btnComida = new javax.swing.JButton();
        btnFelicidade = new javax.swing.JButton();
        btnDisposicao = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        lblDinheiro = new javax.swing.JLabel();
        btnMercado = new javax.swing.JButton();
        btnMinerar = new javax.swing.JButton();
        lblFeliz = new javax.swing.JLabel();
        lblCansado = new javax.swing.JLabel();
        lblDoente = new javax.swing.JLabel();
        lblFaminto = new javax.swing.JLabel();
        lblTriste = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblSujo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tamagoshi");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHP.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblComida.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblFelicidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDisposicao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHigiene.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnHigiene.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/chuveiro.png"))); // NOI18N
        btnHigiene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHigieneActionPerformed(evt);
            }
        });

        btnHP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/heart.png"))); // NOI18N
        btnHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHPActionPerformed(evt);
            }
        });

        btnComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/poteComida.jpg"))); // NOI18N
        btnComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComidaActionPerformed(evt);
            }
        });

        btnFelicidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/smile.jpg"))); // NOI18N
        btnFelicidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFelicidadeActionPerformed(evt);
            }
        });

        btnDisposicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cama.png"))); // NOI18N
        btnDisposicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisposicaoActionPerformed(evt);
            }
        });

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
                .addComponent(btnHigiene, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDisposicao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnFelicidade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnComida, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnHP, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnFechar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnHigiene, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFechar)
                            .addComponent(btnComida, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHP)
                            .addComponent(btnFelicidade, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDisposicao))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        lblDinheiro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnMercado.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnMercado.setText("Mercado");
        btnMercado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMercadoActionPerformed(evt);
            }
        });

        btnMinerar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnMinerar.setText("Minerar");
        btnMinerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinerarActionPerformed(evt);
            }
        });

        lblFeliz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/feliz.png"))); // NOI18N

        lblCansado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cansado.png"))); // NOI18N

        lblDoente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/doente.png"))); // NOI18N

        lblFaminto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/faminto.png"))); // NOI18N

        lblTriste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/triste.png"))); // NOI18N

        lblSujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/sujo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFeliz)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCansado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDoente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFaminto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTriste)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSujo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblHigiene, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblHP, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblComida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblFelicidade, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDisposicao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMercado)
                                .addGap(18, 18, 18)
                                .addComponent(btnMinerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblDisposicao, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFelicidade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHigiene, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMinerar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFeliz)
                                    .addComponent(lblCansado)
                                    .addComponent(lblDoente)
                                    .addComponent(lblFaminto)
                                    .addComponent(lblTriste)
                                    .addComponent(lblSujo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblHP, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblComida, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnMercado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFelicidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFelicidadeActionPerformed
        btnFelicidade.setEnabled(false);
        st.aumentarFelicidade(20);
        lblFelicidade.setText("Felicidade: " + st.getFelicidade());
        st.t = new Timer(tempo_status, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnFelicidade.setEnabled(true);
                st.t.stop();
            }
        });
        st.t.start();
    }//GEN-LAST:event_btnFelicidadeActionPerformed

    private void btnHigieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHigieneActionPerformed
        btnHigiene.setEnabled(false);
        Banheiro b = new Banheiro((Frame) this.getOwner(), rootPaneCheckingEnabled, st, m);
        b.setVisible(true);
        st.t = new Timer(tempo_status, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnHigiene.setEnabled(true);
                st.t.stop();
            }
        });
        st.t.start();
    }//GEN-LAST:event_btnHigieneActionPerformed

    private void btnComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComidaActionPerformed
        Comida c = new Comida((Frame) this.getOwner(), rootPaneCheckingEnabled, st, m);
        btnComida.setEnabled(false);
        c.setVisible(true);
        st.t = new Timer(tempo_status, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnComida.setEnabled(true);
                st.t.stop();
            }
        });
        st.t.start();
    }//GEN-LAST:event_btnComidaActionPerformed

    private void btnHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHPActionPerformed
        btnHP.setEnabled(false);
        st.aumentarHP(60);
        lblHP.setText("Vida: " + st.getHP());
        
    }//GEN-LAST:event_btnHPActionPerformed

    private void btnDisposicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisposicaoActionPerformed
        btnDisposicao.setEnabled(false);
        Quarto q = new Quarto((Frame) this.getOwner(), rootPaneCheckingEnabled, st, m);
        q.setVisible(true);
        st.t = new Timer(tempo_status, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnDisposicao.setEnabled(true);
                st.t.stop();
            }
        });
        st.t.start();
    }//GEN-LAST:event_btnDisposicaoActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnMinerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinerarActionPerformed
        Caverna d = new Caverna((Frame) this.getOwner(), rootPaneCheckingEnabled, st);
        st.aumentarStamina(100);
        btnMinerar.setEnabled(false);
        st.t = new Timer(tempo_status, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnMinerar.setEnabled(true);
            }
        });
        st.t.start();
        d.setVisible(true);
    }//GEN-LAST:event_btnMinerarActionPerformed

    private void btnMercadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMercadoActionPerformed
        Mercado me = new Mercado((Frame) this.getOwner(), rootPaneCheckingEnabled, st, m);
        me.setVisible(true);
    }//GEN-LAST:event_btnMercadoActionPerformed

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
//            java.util.logging.Logger.getLogger(Tamagotchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Tamagotchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Tamagotchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Tamagotchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Tamagotchi dialog = new Tamagotchi(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnComida;
    private javax.swing.JButton btnDisposicao;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFelicidade;
    private javax.swing.JButton btnHP;
    private javax.swing.JButton btnHigiene;
    private javax.swing.JButton btnMercado;
    private javax.swing.JButton btnMinerar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCansado;
    private javax.swing.JLabel lblComida;
    private javax.swing.JLabel lblDinheiro;
    private javax.swing.JLabel lblDisposicao;
    private javax.swing.JLabel lblDoente;
    private javax.swing.JLabel lblFaminto;
    private javax.swing.JLabel lblFelicidade;
    private javax.swing.JLabel lblFeliz;
    public javax.swing.JLabel lblHP;
    private javax.swing.JLabel lblHigiene;
    public javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSujo;
    private javax.swing.JLabel lblTriste;
    // End of variables declaration//GEN-END:variables

}
