/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entidade.Mercadorias;
import javax.swing.*;
import entidade.Status;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author vinicius_piai
 */
public class Mercado extends javax.swing.JDialog {

    Status st;
    Mercadorias m;

    public Mercado(java.awt.Frame parentFrame, boolean modal, Status st, Mercadorias m) {
        super(parentFrame, modal);
        this.st = st;
        this.m = m;
        initComponents();
        btnDinheiro.setText("Dinheiro: " + st.getDinheiro());
        btnPao.setEnabled(false);
        btnChocolate.setEnabled(false);
        btnBeterraba.setEnabled(false);
        btnBoloMorango.setEnabled(false);
        btnSacoDormir.setEnabled(false);
        btnCamaMadeira.setEnabled(false);
        btnCamaBox.setEnabled(false);
        btnChuveiroInterior.setEnabled(false);
        btnChuveiroEletrico.setEnabled(false);
        btnMaxHp.setEnabled(false);
        btnMaxFelicidade.setEnabled(false);
        btnMaxDisp.setEnabled(false);
        st.t = new Timer(250, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificar();
            }
        });
        st.t.start();

    }

    private void verificar() {
        if (this.st.getDinheiro() >= 2.5) {
            btnPao.setEnabled(true);
        } else if (this.st.getDinheiro() < 2.5) {
            btnPao.setEnabled(false);
        }
        if (st.getDinheiro() >= 5) {
            btnChocolate.setEnabled(true);
        } else if (st.getDinheiro() < 5) {
            btnChocolate.setEnabled(false);
        }
        if (st.getDinheiro() >= 3.5) {
            btnBeterraba.setEnabled(true);
        } else if (st.getDinheiro() < 3.5) {
            btnBeterraba.setEnabled(false);
        }
        if (st.getDinheiro() >= 8.5) {
            btnBoloMorango.setEnabled(true);
        } else if (st.getDinheiro() < 8.5) {
            btnBoloMorango.setEnabled(false);
        }
        if(m.getContSacoDormir()==0){   
            if (st.getDinheiro() >= 65) {
                btnSacoDormir.setEnabled(true);
            } else if (st.getDinheiro() < 65) {
                btnSacoDormir.setEnabled(false);
            }
        }else{
            btnSacoDormir.setEnabled(false);
        }
        if(m.getContCamaMadeira()==0){    
            if (st.getDinheiro() >= 95) {
                btnCamaMadeira.setEnabled(true);
            } else if (st.getDinheiro() < 95) {
                btnCamaMadeira.setEnabled(false);
            }
        }else{
            btnCamaMadeira.setEnabled(false);
        }
        if(m.getContCamaBox()==0){    
            if (st.getDinheiro() >= 135) {
                btnCamaBox.setEnabled(true);
            } else if (st.getDinheiro() < 135) {
                btnCamaBox.setEnabled(false);
            }
        }else{
            btnCamaBox.setEnabled(false);
        }
        if (m.getChuveiroInterior() == 0) {
            if (st.getDinheiro() >= 75) {
                btnChuveiroInterior.setEnabled(true);
            } else if (st.getDinheiro() < 75) {
                btnChuveiroInterior.setEnabled(false);
            }
        } else {
            btnChuveiroInterior.setEnabled(false);
        }
        if (m.getChuveiroEletrico() == 0) {
            if (st.getDinheiro() >= 125) {
                btnChuveiroEletrico.setEnabled(true);
            } else if (st.getDinheiro() < 125) {
                btnChuveiroEletrico.setEnabled(false);
            }
        } else {
            btnChuveiroEletrico.setEnabled(false);
        }
        if (st.getDinheiro() >= 500) {
            btnMaxHp.setEnabled(true);
        } else if (st.getDinheiro() < 500) {
            btnMaxHp.setEnabled(false);
        }
        if (st.getDinheiro() >= 150) {
            btnMaxFelicidade.setEnabled(true);
        } else if (st.getDinheiro() < 150) {
            btnMaxFelicidade.setEnabled(false);
        }
        if (st.getDinheiro() >= 150) {
            btnMaxDisp.setEnabled(true);
        } else if (st.getDinheiro() < 150) {
            btnMaxDisp.setEnabled(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnPao = new javax.swing.JButton();
        btnChocolate = new javax.swing.JButton();
        btnBeterraba = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnBoloMorango = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnSacoDormir = new javax.swing.JButton();
        btnCamaMadeira = new javax.swing.JButton();
        btnCamaBox = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        btnChuveiroInterior = new javax.swing.JButton();
        btnChuveiroEletrico = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btnMaxHp = new javax.swing.JButton();
        btnMaxDisp = new javax.swing.JButton();
        btnMaxFelicidade = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnDinheiro = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Mercado");

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Mercado");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Comida");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPao.setText("Pão");
        btnPao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaoActionPerformed(evt);
            }
        });

        btnChocolate.setText("Chocolate");
        btnChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChocolateActionPerformed(evt);
            }
        });

        btnBeterraba.setText("Beterraba");
        btnBeterraba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeterrabaActionPerformed(evt);
            }
        });

        btnBoloMorango.setText("Bolo de Morango");
        btnBoloMorango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoloMorangoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Camas");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSacoDormir.setText("Saco de dormir");
        btnSacoDormir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacoDormirActionPerformed(evt);
            }
        });

        btnCamaMadeira.setText("Cama de madeira");
        btnCamaMadeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamaMadeiraActionPerformed(evt);
            }
        });

        btnCamaBox.setText("Cama Box");
        btnCamaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamaBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Chuveiros");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnChuveiroInterior.setText("Chuveiro do interior");
        btnChuveiroInterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuveiroInteriorActionPerformed(evt);
            }
        });

        btnChuveiroEletrico.setText("Chuveiro elétrico");
        btnChuveiroEletrico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuveiroEletricoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Poções");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnMaxHp.setText("Max. HP");
        btnMaxHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxHpActionPerformed(evt);
            }
        });

        btnMaxDisp.setText("Max. Disposição");
        btnMaxDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxDispActionPerformed(evt);
            }
        });

        btnMaxFelicidade.setText("Max. Felicidade");
        btnMaxFelicidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxFelicidadeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Preços");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Pão --------------------- 2,50\nChocolate --------------- 5,0\nBeterraba --------------- 3,5\nBolo de Morango --------- 8,5\nSaco de dormir ---------- 65,00\nCama de madeira --------- 95,00\nCama Box ---------------- 135,00\nChuveiro de interior ---- 75,00\nChuveiro elétrico ------- 125,00\nMax. HP ----------------- 500,00\nMax. Disposição --------- 150,00\nMax.Felicidade ---------- 150,00");
        jScrollPane1.setViewportView(jTextArea1);

        btnDinheiro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDinheiro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMaxHp)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMaxDisp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMaxFelicidade)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator10)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSacoDormir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCamaMadeira)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCamaBox)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnChuveiroInterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChuveiroEletrico)
                                .addGap(62, 62, 62))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChocolate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBeterraba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoloMorango)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPao)
                    .addComponent(btnChocolate)
                    .addComponent(btnBeterraba)
                    .addComponent(btnBoloMorango))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacoDormir)
                    .addComponent(btnCamaMadeira)
                    .addComponent(btnCamaBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChuveiroInterior)
                    .addComponent(btnChuveiroEletrico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMaxHp)
                    .addComponent(btnMaxDisp)
                    .addComponent(btnMaxFelicidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnFechar)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaoActionPerformed
        st.diminuirDinheiro((float) 2.5);
        btnDinheiro.setText("Dinheiro: " + st.getDinheiro());
        m.aumentarPao(1);
    }//GEN-LAST:event_btnPaoActionPerformed

    private void btnChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChocolateActionPerformed
        st.diminuirDinheiro((float) 5.0);
        btnDinheiro.setText("Dinheiro: " + st.getDinheiro());
        m.aumentarChocolate(1);
    }//GEN-LAST:event_btnChocolateActionPerformed

    private void btnBeterrabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeterrabaActionPerformed
        st.diminuirDinheiro((float) 3.5);
        btnDinheiro.setText("Dinheiro: " + st.getDinheiro());
        m.aumentarBeterraba(1);
    }//GEN-LAST:event_btnBeterrabaActionPerformed

    private void btnBoloMorangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoloMorangoActionPerformed
        st.diminuirDinheiro((float) 8.5);
        btnDinheiro.setText("Dinheiro: " + st.getDinheiro());
        m.aumentarBoloMorango(1);
    }//GEN-LAST:event_btnBoloMorangoActionPerformed

    private void btnSacoDormirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacoDormirActionPerformed
        st.diminuirDinheiro((float) 65);
        btnDinheiro.setText("Dinheiro: " + st.getDinheiro());
        m.aumentarSacoDormir(1);
        m.setContSacoDormir(1);
        btnSacoDormir.setEnabled(false);
    }//GEN-LAST:event_btnSacoDormirActionPerformed

    private void btnCamaMadeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamaMadeiraActionPerformed
        st.diminuirDinheiro((float) 95);
        btnDinheiro.setText("Dinheiro: " + st.getDinheiro());
        m.aumentarSacoDormir(1);
        m.aumentarCamaMadeira(1);
        m.setContSacoDormir(2);
        m.setContCamaMadeira(1);
        btnCamaMadeira.setEnabled(false);
    }//GEN-LAST:event_btnCamaMadeiraActionPerformed

    private void btnCamaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamaBoxActionPerformed
        st.diminuirDinheiro((float) 135);
        btnDinheiro.setText("Dinheiro: " + st.getDinheiro());
        m.aumentarSacoDormir(1);
        m.aumentarCamaMadeira(1);
        m.aumentarCamaBox(1);
        m.setContSacoDormir(2);
        m.setContCamaMadeira(2);
        m.setContCamaBox(1);
        
    }//GEN-LAST:event_btnCamaBoxActionPerformed

    private void btnChuveiroInteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuveiroInteriorActionPerformed
        st.diminuirDinheiro((float) 75);
        btnDinheiro.setText("Dinheiro: " + st.getDinheiro());
        m.aumentarChuveiroInterior(1);
        m.setContChuveiroInterior(1);
        btnChuveiroInterior.setEnabled(false);
    }//GEN-LAST:event_btnChuveiroInteriorActionPerformed

    private void btnChuveiroEletricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuveiroEletricoActionPerformed
        st.diminuirDinheiro((float) 125);
        btnDinheiro.setText("Dinheiro: " + st.getDinheiro());
        m.aumentarChuveiroEletrico(1);
        m.aumentarChuveiroInterior(1);
        m.setContChuveiroInterior(2);
        m.setContChuveiroEletrico(1);
    }//GEN-LAST:event_btnChuveiroEletricoActionPerformed

    private void btnMaxHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxHpActionPerformed
        st.diminuirDinheiro((float) 150);
        btnDinheiro.setText("Dinheiro: " + st.getDinheiro());
        m.aumentarMaxHP(1);
    }//GEN-LAST:event_btnMaxHpActionPerformed

    private void btnMaxDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxDispActionPerformed
        st.diminuirDinheiro((float) 150);
        btnDinheiro.setText("Dinheiro: " + st.getDinheiro());
        m.aumentarMaxDisp(1);
    }//GEN-LAST:event_btnMaxDispActionPerformed

    private void btnMaxFelicidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxFelicidadeActionPerformed
        st.diminuirDinheiro((float) 150);
        btnDinheiro.setText("Dinheiro: " + st.getDinheiro());
        m.aumentarMaxFelicidade(1);
    }//GEN-LAST:event_btnMaxFelicidadeActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        Mercado.this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

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
//            java.util.logging.Logger.getLogger(Mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Mercado dialog = new Mercado(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBeterraba;
    private javax.swing.JButton btnBoloMorango;
    private javax.swing.JButton btnCamaBox;
    private javax.swing.JButton btnCamaMadeira;
    private javax.swing.JButton btnChocolate;
    private javax.swing.JButton btnChuveiroEletrico;
    private javax.swing.JButton btnChuveiroInterior;
    private javax.swing.JLabel btnDinheiro;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnMaxDisp;
    private javax.swing.JButton btnMaxFelicidade;
    private javax.swing.JButton btnMaxHp;
    private javax.swing.JButton btnPao;
    private javax.swing.JButton btnSacoDormir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
