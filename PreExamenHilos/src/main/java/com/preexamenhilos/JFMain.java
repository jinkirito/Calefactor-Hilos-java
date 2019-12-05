/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.preexamenhilos;

import java.util.concurrent.Executors;

/**
 *
 * @author Jorge
 */
public class JFMain extends javax.swing.JFrame {

    private hiloc hc;
    private hilore hr;

    private static Integer deseadaValor;
    private static int prioridadCalefactor;
    private static int prioridadRefrigeracion;

    /**
     * Creates new form JFMain
     */
    public JFMain() {
        prioridadCalefactor = 1;
        prioridadRefrigeracion = 1;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jla = new javax.swing.JLabel();
        Deseada = new javax.swing.JLabel();
        bajarDeseada = new javax.swing.JButton();
        subirDesada = new javax.swing.JButton();
        startRefrigeracion = new javax.swing.JButton();
        stopRefrigeracion = new javax.swing.JButton();
        startCalefactor = new javax.swing.JButton();
        stopCalefator = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        aumentaPrefrigerador = new javax.swing.JButton();
        disminuirPRefregerador = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        aumentarPCalefactor = new javax.swing.JButton();
        disminuirPCalefactor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Actual = new javax.swing.JLabel();
        prioridadR = new javax.swing.JLabel();
        prioridadC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jla.setText("Temperatura deseada:");

        Deseada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Deseada.setForeground(new java.awt.Color(0, 0, 255));
        Deseada.setText("0");

        bajarDeseada.setText("-");
        bajarDeseada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajarDeseadaActionPerformed(evt);
            }
        });

        subirDesada.setText("+");
        subirDesada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirDesadaActionPerformed(evt);
            }
        });

        startRefrigeracion.setText("start");
        startRefrigeracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startRefrigeracionActionPerformed(evt);
            }
        });

        stopRefrigeracion.setText("stop");
        stopRefrigeracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopRefrigeracionActionPerformed(evt);
            }
        });

        startCalefactor.setText("start");
        startCalefactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startCalefactorActionPerformed(evt);
            }
        });

        stopCalefator.setText("stop");
        stopCalefator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopCalefatorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Hilo refrigerador");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Hilo calefactor");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Actual:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Prioridad:");

        aumentaPrefrigerador.setText("+");
        aumentaPrefrigerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentaPrefrigeradorActionPerformed(evt);
            }
        });

        disminuirPRefregerador.setText("-");
        disminuirPRefregerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disminuirPRefregeradorActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Prioridad:");

        aumentarPCalefactor.setText("+");
        aumentarPCalefactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarPCalefactorActionPerformed(evt);
            }
        });

        disminuirPCalefactor.setText("-");
        disminuirPCalefactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disminuirPCalefactorActionPerformed(evt);
            }
        });

        jLabel9.setText("prioridad");

        jLabel10.setText("prioridad");

        Actual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Actual.setForeground(new java.awt.Color(255, 0, 0));
        Actual.setText("0");

        prioridadR.setText("0");

        prioridadC.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startCalefactor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(stopCalefator))
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(aumentarPCalefactor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(disminuirPCalefactor))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(prioridadC, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 91, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(startRefrigeracion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(stopRefrigeracion))
                                    .addComponent(jLabel3))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(aumentaPrefrigerador)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(disminuirPRefregerador))
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(prioridadR, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bajarDeseada)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(subirDesada))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jla)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Deseada)
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Actual)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jla)
                    .addComponent(Deseada)
                    .addComponent(jLabel5)
                    .addComponent(Actual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bajarDeseada)
                    .addComponent(subirDesada))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startRefrigeracion)
                            .addComponent(stopRefrigeracion)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(aumentaPrefrigerador)
                                    .addComponent(disminuirPRefregerador)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(prioridadR)))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startCalefactor)
                            .addComponent(stopCalefator)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aumentarPCalefactor)
                            .addComponent(disminuirPCalefactor)
                            .addComponent(prioridadC))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subirDesadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirDesadaActionPerformed
       Temperatura.getInstance().aumentarDeseada();
        this.Deseada.setText(String.valueOf( Temperatura.getInstance().getDeseada()));
    }//GEN-LAST:event_subirDesadaActionPerformed

    private void bajarDeseadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajarDeseadaActionPerformed
         Temperatura.getInstance().disminuirDeseada();
        this.Deseada.setText(String.valueOf(  Temperatura.getInstance().getDeseada()));
    }//GEN-LAST:event_bajarDeseadaActionPerformed

    private void startRefrigeracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startRefrigeracionActionPerformed
         if (hr==null) {
            hr = new hilore();
            hr.start();
        }else if(!hr.isAlive()){
            hr = new hilore();
            hr.start();
        }else{
           hr.renaudarhilo();
        } 

    }//GEN-LAST:event_startRefrigeracionActionPerformed

    private void startCalefactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startCalefactorActionPerformed
        if (hc==null) {
            hc = new hiloc();
            hc.start();
        }else if(!hc.isAlive()){
            hc = new hiloc();
            hc.start();
        }else{
            hc.renaudarhilo();
        } 
    }//GEN-LAST:event_startCalefactorActionPerformed

    private void stopCalefatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopCalefatorActionPerformed
        if (hc != null && hc.isAlive()) {
            hc.pausarhilo();
        }
    }//GEN-LAST:event_stopCalefatorActionPerformed

    private void aumentaPrefrigeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentaPrefrigeradorActionPerformed

        prioridadRefrigeracion++;
        if (hr != null && prioridadRefrigeracion <= 10) {
            hr.setPriority(prioridadRefrigeracion);
            
        } else {
            prioridadRefrigeracion = 10;
        }
        pintaPrioridadR(String.valueOf(prioridadRefrigeracion));
    }//GEN-LAST:event_aumentaPrefrigeradorActionPerformed

    private void aumentarPCalefactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarPCalefactorActionPerformed
        prioridadCalefactor++;
        if (hc != null && prioridadCalefactor <= 10) {
            hc.setPriority(prioridadCalefactor);
        } else {
            prioridadCalefactor = 10;
        }
      pintaPrioridadC(String.valueOf(prioridadCalefactor));
    }//GEN-LAST:event_aumentarPCalefactorActionPerformed

    private void disminuirPCalefactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disminuirPCalefactorActionPerformed
        prioridadCalefactor--;

        if (hc != null && prioridadCalefactor >= 1) {
            hc.setPriority(prioridadCalefactor);
       
        } else {
            prioridadCalefactor = 1;
        }
     pintaPrioridadC(String.valueOf(prioridadCalefactor));

    }//GEN-LAST:event_disminuirPCalefactorActionPerformed

    private void stopRefrigeracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopRefrigeracionActionPerformed
        if (hr != null && hr.isAlive()) {
            hr.pausarhilo();
        }
    }//GEN-LAST:event_stopRefrigeracionActionPerformed

    private void disminuirPRefregeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disminuirPRefregeradorActionPerformed
          
         pintaPrioridadR(String.valueOf(prioridadRefrigeracion));
        if (hr != null && prioridadRefrigeracion>= 1) {
            hr.setPriority(prioridadRefrigeracion);
        } else {
            prioridadRefrigeracion = 1;
        }
       prioridadRefrigeracion--;
    }//GEN-LAST:event_disminuirPRefregeradorActionPerformed

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
            java.util.logging.Logger.getLogger(JFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMain().setVisible(true);
            }
        });
    }

    public static void ajustarTemperatura(String valor) {
        JFMain.Actual.setText(valor);
    }

    public static void pintaPrioridadR(String s) {
        JFMain.prioridadR.setText(s);
    }

    public static void pintaPrioridadC(String s) {
        JFMain.prioridadC.setText(s);
    }
    
    public static boolean compruevaPrioridad(int valor){
       boolean correcto =false;       
       if(valor<=10 && valor>=0){
          correcto = true;
       }
       return correcto;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel Actual;
    private static javax.swing.JLabel Deseada;
    private javax.swing.JButton aumentaPrefrigerador;
    private javax.swing.JButton aumentarPCalefactor;
    private javax.swing.JButton bajarDeseada;
    private javax.swing.JButton disminuirPCalefactor;
    private javax.swing.JButton disminuirPRefregerador;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jla;
    private static javax.swing.JLabel prioridadC;
    private static javax.swing.JLabel prioridadR;
    private javax.swing.JButton startCalefactor;
    private javax.swing.JButton startRefrigeracion;
    private javax.swing.JButton stopCalefator;
    private javax.swing.JButton stopRefrigeracion;
    private javax.swing.JButton subirDesada;
    // End of variables declaration//GEN-END:variables
}
