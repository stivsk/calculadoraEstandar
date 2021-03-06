/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardcalculator;

/**
 *
 * @author calle
 */

public class MainFrame extends javax.swing.JFrame {
    
    StandardCalculator standard = new StandardCalculator();
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        txtEntrada.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEntrada = new javax.swing.JTextField();
        btnNumUno = new javax.swing.JButton();
        btnNumDos = new javax.swing.JButton();
        btnNumTres = new javax.swing.JButton();
        btnNumCuatro = new javax.swing.JButton();
        btnNumCinco = new javax.swing.JButton();
        btnNumSeis = new javax.swing.JButton();
        btnNumSiete = new javax.swing.JButton();
        btnNumOcho = new javax.swing.JButton();
        btnNumNueve = new javax.swing.JButton();
        btnOpDividir = new javax.swing.JButton();
        btnOpMultiplicar = new javax.swing.JButton();
        btnOpSumar = new javax.swing.JButton();
        btnOpRestar = new javax.swing.JButton();
        btnNumCero = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnOpModulo = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnOpRaiz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtEntrada.setBackground(new java.awt.Color(238, 238, 238));
        txtEntrada.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        txtEntrada.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEntrada.setBorder(null);
        txtEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaActionPerformed(evt);
            }
        });

        btnNumUno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumUno.setText("1");
        btnNumUno.setToolTipText("");
        btnNumUno.setBorderPainted(false);
        btnNumUno.setContentAreaFilled(false);
        btnNumUno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumUno.setFocusable(false);
        btnNumUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumUnoActionPerformed(evt);
            }
        });

        btnNumDos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumDos.setText("2");
        btnNumDos.setToolTipText("");
        btnNumDos.setBorderPainted(false);
        btnNumDos.setContentAreaFilled(false);
        btnNumDos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumDos.setFocusable(false);
        btnNumDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumDosActionPerformed(evt);
            }
        });

        btnNumTres.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumTres.setText("3");
        btnNumTres.setToolTipText("");
        btnNumTres.setBorderPainted(false);
        btnNumTres.setContentAreaFilled(false);
        btnNumTres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumTres.setFocusable(false);
        btnNumTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumTresActionPerformed(evt);
            }
        });

        btnNumCuatro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumCuatro.setText("4");
        btnNumCuatro.setToolTipText("");
        btnNumCuatro.setBorderPainted(false);
        btnNumCuatro.setContentAreaFilled(false);
        btnNumCuatro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumCuatro.setFocusable(false);
        btnNumCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumCuatroActionPerformed(evt);
            }
        });

        btnNumCinco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumCinco.setText("5");
        btnNumCinco.setToolTipText("");
        btnNumCinco.setBorderPainted(false);
        btnNumCinco.setContentAreaFilled(false);
        btnNumCinco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumCinco.setFocusable(false);
        btnNumCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumCincoActionPerformed(evt);
            }
        });

        btnNumSeis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumSeis.setText("6");
        btnNumSeis.setToolTipText("");
        btnNumSeis.setBorderPainted(false);
        btnNumSeis.setContentAreaFilled(false);
        btnNumSeis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumSeis.setFocusable(false);
        btnNumSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumSeisActionPerformed(evt);
            }
        });

        btnNumSiete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumSiete.setText("7");
        btnNumSiete.setToolTipText("");
        btnNumSiete.setBorderPainted(false);
        btnNumSiete.setContentAreaFilled(false);
        btnNumSiete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumSiete.setFocusable(false);
        btnNumSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumSieteActionPerformed(evt);
            }
        });

        btnNumOcho.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumOcho.setText("8");
        btnNumOcho.setToolTipText("");
        btnNumOcho.setBorderPainted(false);
        btnNumOcho.setContentAreaFilled(false);
        btnNumOcho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumOcho.setFocusable(false);
        btnNumOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumOchoActionPerformed(evt);
            }
        });

        btnNumNueve.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumNueve.setText("9");
        btnNumNueve.setToolTipText("");
        btnNumNueve.setBorderPainted(false);
        btnNumNueve.setContentAreaFilled(false);
        btnNumNueve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumNueve.setFocusable(false);
        btnNumNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumNueveActionPerformed(evt);
            }
        });

        btnOpDividir.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnOpDividir.setText("/");
        btnOpDividir.setToolTipText("");
        btnOpDividir.setBorderPainted(false);
        btnOpDividir.setContentAreaFilled(false);
        btnOpDividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpDividir.setFocusable(false);
        btnOpDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpDividirActionPerformed(evt);
            }
        });

        btnOpMultiplicar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnOpMultiplicar.setText("*");
        btnOpMultiplicar.setToolTipText("");
        btnOpMultiplicar.setBorderPainted(false);
        btnOpMultiplicar.setContentAreaFilled(false);
        btnOpMultiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpMultiplicar.setFocusable(false);
        btnOpMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpMultiplicarActionPerformed(evt);
            }
        });

        btnOpSumar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnOpSumar.setText("+");
        btnOpSumar.setToolTipText("");
        btnOpSumar.setBorderPainted(false);
        btnOpSumar.setContentAreaFilled(false);
        btnOpSumar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpSumar.setFocusable(false);
        btnOpSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpSumarActionPerformed(evt);
            }
        });

        btnOpRestar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnOpRestar.setText("-");
        btnOpRestar.setToolTipText("");
        btnOpRestar.setBorderPainted(false);
        btnOpRestar.setContentAreaFilled(false);
        btnOpRestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpRestar.setFocusable(false);
        btnOpRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpRestarActionPerformed(evt);
            }
        });

        btnNumCero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumCero.setText("0");
        btnNumCero.setToolTipText("");
        btnNumCero.setBorderPainted(false);
        btnNumCero.setContentAreaFilled(false);
        btnNumCero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumCero.setFocusable(false);
        btnNumCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumCeroActionPerformed(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setToolTipText("");
        btnIgual.setBorderPainted(false);
        btnIgual.setContentAreaFilled(false);
        btnIgual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIgual.setFocusable(false);
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnPunto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPunto.setText(".");
        btnPunto.setToolTipText("");
        btnPunto.setBorderPainted(false);
        btnPunto.setContentAreaFilled(false);
        btnPunto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPunto.setFocusable(false);
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnOpModulo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnOpModulo.setText("%");
        btnOpModulo.setToolTipText("");
        btnOpModulo.setBorderPainted(false);
        btnOpModulo.setContentAreaFilled(false);
        btnOpModulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpModulo.setFocusable(false);
        btnOpModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpModuloActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnC.setText("C");
        btnC.setToolTipText("");
        btnC.setBorderPainted(false);
        btnC.setContentAreaFilled(false);
        btnC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC.setFocusable(false);
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnCE.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnCE.setText("CE");
        btnCE.setToolTipText("");
        btnCE.setBorderPainted(false);
        btnCE.setContentAreaFilled(false);
        btnCE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCE.setFocusable(false);
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnOpRaiz.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnOpRaiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/standardcalculator/sqrt.png"))); // NOI18N
        btnOpRaiz.setToolTipText("");
        btnOpRaiz.setBorderPainted(false);
        btnOpRaiz.setContentAreaFilled(false);
        btnOpRaiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpRaiz.setFocusable(false);
        btnOpRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpRaizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNumSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNumCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNumUno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOpModulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNumCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNumDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNumCero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnCE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnNumTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnOpRaiz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOpRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOpDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOpSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnNumSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEntrada)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNumSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNumNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOpMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNumOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNumSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOpRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNumCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNumCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNumDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNumUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNumTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOpSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNumCero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOpModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNumOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumOchoActionPerformed
        //Envia la equivalencia numerica de la tecla presionada
        standard.NumPresionado(8);
        //Establece los digitos de @txtEntrada actualizandolos cada vez que se ingresa un numero
        txtEntrada.setText(standard.getData());
    }//GEN-LAST:event_btnNumOchoActionPerformed

    private void btnNumCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumCincoActionPerformed
        standard.NumPresionado(5);
        txtEntrada.setText(standard.getData());
    }//GEN-LAST:event_btnNumCincoActionPerformed

    private void btnNumDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumDosActionPerformed
        standard.NumPresionado(2);
        txtEntrada.setText(standard.getData());
    }//GEN-LAST:event_btnNumDosActionPerformed

    private void btnNumNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumNueveActionPerformed
        standard.NumPresionado(9);
        txtEntrada.setText(standard.getData());
    }//GEN-LAST:event_btnNumNueveActionPerformed

    private void btnNumUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumUnoActionPerformed
        standard.NumPresionado(1);
        txtEntrada.setText(standard.getData());
    }//GEN-LAST:event_btnNumUnoActionPerformed

    private void btnOpDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpDividirActionPerformed
        standard.opPresionada("/", txtEntrada.getText());
        txtEntrada.setText("0");
    }//GEN-LAST:event_btnOpDividirActionPerformed

    private void btnOpMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpMultiplicarActionPerformed
        standard.opPresionada("*", txtEntrada.getText());
        txtEntrada.setText("0");
    }//GEN-LAST:event_btnOpMultiplicarActionPerformed

    private void btnOpSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpSumarActionPerformed
        standard.opPresionada("+", txtEntrada.getText());
        txtEntrada.setText("0");
    }//GEN-LAST:event_btnOpSumarActionPerformed

    private void btnOpRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpRestarActionPerformed
        standard.opPresionada("-", txtEntrada.getText());
        txtEntrada.setText("0");
    }//GEN-LAST:event_btnOpRestarActionPerformed

    private void btnNumCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumCeroActionPerformed
        standard.NumPresionado("0");
        txtEntrada.setText(standard.getData());
    }//GEN-LAST:event_btnNumCeroActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        /*
            Como ya se conoce el valor de la primer entrada y la operacion a realizar,
            se procede con el calculo del total
        */
        String calculo = String.valueOf(standard.total(txtEntrada.getText()));
        txtEntrada.setText(calculo);
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        standard.NumPresionado(".");
        txtEntrada.setText(standard.getData());
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnOpModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpModuloActionPerformed
        standard.opPresionada("%", txtEntrada.getText());
        txtEntrada.setText("0");
    }//GEN-LAST:event_btnOpModuloActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        standard.C(txtEntrada.getText());
        txtEntrada.setText("0");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        standard.opPresionada("CE", txtEntrada.getText());
        txtEntrada.setText("0");
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnOpRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpRaizActionPerformed
        standard.opPresionada("v/", txtEntrada.getText());
        txtEntrada.setText("0");
    }//GEN-LAST:event_btnOpRaizActionPerformed

    private void btnNumSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumSieteActionPerformed
        standard.NumPresionado(7);
        txtEntrada.setText(standard.getData());
    }//GEN-LAST:event_btnNumSieteActionPerformed

    private void btnNumCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumCuatroActionPerformed
        standard.NumPresionado(4);
        txtEntrada.setText(standard.getData());
    }//GEN-LAST:event_btnNumCuatroActionPerformed

    private void btnNumSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumSeisActionPerformed
        standard.NumPresionado(6);
        txtEntrada.setText(standard.getData());
    }//GEN-LAST:event_btnNumSeisActionPerformed

    private void btnNumTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumTresActionPerformed
        standard.NumPresionado(3);
        txtEntrada.setText(standard.getData());
    }//GEN-LAST:event_btnNumTresActionPerformed

    private void txtEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaActionPerformed
        
    }//GEN-LAST:event_txtEntradaActionPerformed
    
    public static void main(String[] args) {
        
        MainFrame basica = new MainFrame();
        
        basica.setVisible(true);
        basica.setTitle("Calculadora Estándar");
        basica.setLocationRelativeTo(null);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnNumCero;
    private javax.swing.JButton btnNumCinco;
    private javax.swing.JButton btnNumCuatro;
    private javax.swing.JButton btnNumDos;
    private javax.swing.JButton btnNumNueve;
    private javax.swing.JButton btnNumOcho;
    private javax.swing.JButton btnNumSeis;
    private javax.swing.JButton btnNumSiete;
    private javax.swing.JButton btnNumTres;
    private javax.swing.JButton btnNumUno;
    private javax.swing.JButton btnOpDividir;
    private javax.swing.JButton btnOpModulo;
    private javax.swing.JButton btnOpMultiplicar;
    private javax.swing.JButton btnOpRaiz;
    private javax.swing.JButton btnOpRestar;
    private javax.swing.JButton btnOpSumar;
    private javax.swing.JButton btnPunto;
    private javax.swing.JTextField txtEntrada;
    // End of variables declaration//GEN-END:variables
}
