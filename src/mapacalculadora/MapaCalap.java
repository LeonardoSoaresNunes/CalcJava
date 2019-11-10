package mapacalculadora;
import javax.swing.border.EtchedBorder;
/**
 *
 * @author LEONARDO Soares Nunes Curso:Analise Desenvolvimento de Sistemas 
 * Displina :Programação II , Mapa Calculadora Java
 */
public class MapaCalap extends javax.swing.JFrame {

    private Object display;

    /**
     * Creates new form MapaCalap
     */
    public MapaCalap() {
        initComponents();
       jTextField1.setBorder(new EtchedBorder());
    }
   double valor1, valor2;
   String operacao;
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jB7 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB0 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        Multiplicacao = new javax.swing.JButton();
        Subtracao = new javax.swing.JButton();
        Adicao = new javax.swing.JButton();
        Divisao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jB7.setText("7");
        jB7.setFocusable(false);
        jB7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jB7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB4.setText("4");
        jB4.setFocusable(false);
        jB4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jB4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB1.setText("1");
        jB1.setFocusable(false);
        jB1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jB1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        Limpar.setText("CE");
        Limpar.setFocusable(false);
        Limpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Limpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        jB5.setText("5");
        jB5.setFocusable(false);
        jB5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jB5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB2.setText("2");
        jB2.setFocusable(false);
        jB2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jB2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB0.setText("0");
        jB0.setFocusable(false);
        jB0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jB0.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0ActionPerformed(evt);
            }
        });

        jB8.setText("8");
        jB8.setFocusable(false);
        jB8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jB8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB6.setText("6");
        jB6.setFocusable(false);
        jB6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jB6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB3.setText("3");
        jB3.setFocusable(false);
        jB3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jB3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        Igual.setText("=");
        Igual.setFocusable(false);
        Igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Igual.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });

        jB9.setText("9");
        jB9.setFocusable(false);
        jB9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jB9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        Multiplicacao.setText("*");
        Multiplicacao.setFocusable(false);
        Multiplicacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Multiplicacao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacaoActionPerformed(evt);
            }
        });

        Subtracao.setText("-");
        Subtracao.setFocusable(false);
        Subtracao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Subtracao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtracaoActionPerformed(evt);
            }
        });

        Adicao.setText("+");
        Adicao.setFocusable(false);
        Adicao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Adicao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Adicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicaoActionPerformed(evt);
            }
        });

        Divisao.setText("/");
        Divisao.setFocusable(false);
        Divisao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Divisao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Divisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Multiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Subtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Adicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Limpar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB0))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Igual))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Divisao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Multiplicacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Subtracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Adicao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
     jTextField1.setText(jTextField1.getText()+ "1") ;  
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
     jTextField1.setText(jTextField1.getText()+ "5") ;   
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
      jTextField1.setText(jTextField1.getText()+ "7") ;     
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
     jTextField1.setText(jTextField1.getText()+ "4") ;   
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
     jTextField1.setText(jTextField1.getText()+ "8") ;   
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
     jTextField1.setText(jTextField1.getText()+ "2") ;   
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0ActionPerformed
     jTextField1.setText(jTextField1.getText()+ "0") ;   
    }//GEN-LAST:event_jB0ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
     jTextField1.setText(jTextField1.getText()+ "9") ;   
    }//GEN-LAST:event_jB9ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
    jTextField1.setText(jTextField1.getText()+ "6") ;    
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
     jTextField1.setText(jTextField1.getText()+ "3") ;   
    }//GEN-LAST:event_jB3ActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
    //valor1 = 0;
    //valor2 = 0;
    jTextField1.setText("") ;    
    }//GEN-LAST:event_LimparActionPerformed

    private void AdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicaoActionPerformed
     
     valor1 = Double.parseDouble(jTextField1.getText());
     jTextField1.setText(""); 
     operacao = "Adicao";
    }//GEN-LAST:event_AdicaoActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
    valor2 = Double.parseDouble(jTextField1.getText()) ;
    if (operacao == "Adicao"){
        jTextField1.setText(String.valueOf(valor1 + valor2));
    }
    if (operacao == "Subtracao"){
        jTextField1.setText(String.valueOf(valor1 - valor2));   
    }
     if (operacao == "Multiplicacao"){
        jTextField1.setText(String.valueOf(valor1 * valor2));   
    }
      if (operacao == "Divisao"){
        jTextField1.setText(String.valueOf(valor1 / valor2));   
    }
   
    }//GEN-LAST:event_IgualActionPerformed

    private void SubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtracaoActionPerformed
    valor1 = Double.parseDouble(jTextField1.getText()) ;
    jTextField1.setText("");
    operacao = "Subtracao";
     
    }//GEN-LAST:event_SubtracaoActionPerformed

    private void MultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacaoActionPerformed
    valor1 = Double.parseDouble(jTextField1.getText()) ;
    jTextField1.setText("");
    operacao = "Multiplicacao";    
    }//GEN-LAST:event_MultiplicacaoActionPerformed

    private void DivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisaoActionPerformed
     valor1 = Double.parseDouble(jTextField1.getText()) ;
    jTextField1.setText("");
    operacao = "Divisao";   
    }//GEN-LAST:event_DivisaoActionPerformed

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
            java.util.logging.Logger.getLogger(MapaCalap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapaCalap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapaCalap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapaCalap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapaCalap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicao;
    private javax.swing.JButton Divisao;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Limpar;
    private javax.swing.JButton Multiplicacao;
    private javax.swing.JButton Subtracao;
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
