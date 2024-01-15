
package View;

import javax.swing.JOptionPane;
public class Tela03_GUI extends javax.swing.JFrame {
    int Total= 0;
        
    public Tela03_GUI() {
        initComponents();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        valor3 = new javax.swing.JButton();
        valor1 = new javax.swing.JButton();
        valor5 = new javax.swing.JButton();
        valor4 = new javax.swing.JButton();
        valor8 = new javax.swing.JButton();
        SAIR = new javax.swing.JButton();
        concluir = new javax.swing.JButton();
        valor7 = new javax.swing.JButton();
        valor6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        resul = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valor2 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 41, 152));
        jPanel1.setLayout(null);

        valor3.setBackground(new java.awt.Color(153, 204, 255));
        valor3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        valor3.setForeground(new java.awt.Color(255, 255, 255));
        valor3.setText("R$50");
        valor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor3ActionPerformed(evt);
            }
        });
        jPanel1.add(valor3);
        valor3.setBounds(30, 330, 140, 60);

        valor1.setBackground(new java.awt.Color(153, 204, 255));
        valor1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        valor1.setForeground(new java.awt.Color(255, 255, 255));
        valor1.setText("R$20");
        valor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor1ActionPerformed(evt);
            }
        });
        jPanel1.add(valor1);
        valor1.setBounds(30, 150, 140, 60);

        valor5.setBackground(new java.awt.Color(153, 204, 255));
        valor5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        valor5.setForeground(new java.awt.Color(255, 255, 255));
        valor5.setText("R$300");
        valor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor5ActionPerformed(evt);
            }
        });
        jPanel1.add(valor5);
        valor5.setBounds(610, 150, 140, 60);

        valor4.setBackground(new java.awt.Color(153, 204, 255));
        valor4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        valor4.setForeground(new java.awt.Color(255, 255, 255));
        valor4.setText("R$100");
        valor4.setBorderPainted(false);
        valor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor4ActionPerformed(evt);
            }
        });
        jPanel1.add(valor4);
        valor4.setBounds(30, 420, 140, 60);

        valor8.setBackground(new java.awt.Color(153, 204, 255));
        valor8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        valor8.setForeground(new java.awt.Color(255, 255, 255));
        valor8.setText("R$1000");
        valor8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor8ActionPerformed(evt);
            }
        });
        jPanel1.add(valor8);
        valor8.setBounds(610, 420, 140, 60);

        SAIR.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        SAIR.setText("VOLTAR");
        SAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAIRActionPerformed(evt);
            }
        });
        jPanel1.add(SAIR);
        SAIR.setBounds(230, 420, 140, 60);

        concluir.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        concluir.setText("CONCLUIR");
        concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirActionPerformed(evt);
            }
        });
        jPanel1.add(concluir);
        concluir.setBounds(420, 420, 140, 60);

        valor7.setBackground(new java.awt.Color(153, 204, 255));
        valor7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        valor7.setForeground(new java.awt.Color(255, 255, 255));
        valor7.setText("R$900");
        valor7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor7ActionPerformed(evt);
            }
        });
        jPanel1.add(valor7);
        valor7.setBounds(610, 330, 140, 60);

        valor6.setBackground(new java.awt.Color(153, 204, 255));
        valor6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        valor6.setForeground(new java.awt.Color(255, 255, 255));
        valor6.setText("R$500");
        valor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor6ActionPerformed(evt);
            }
        });
        jPanel1.add(valor6);
        valor6.setBounds(610, 240, 140, 60);

        jPanel2.setBackground(new java.awt.Color(67, 195, 255));
        jPanel2.setLayout(null);

        resul.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resul.setForeground(new java.awt.Color(0, 51, 204));
        resul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resulActionPerformed(evt);
            }
        });
        jPanel2.add(resul);
        resul.setBounds(110, 9, 260, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("VALOR:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 20, 80, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("NOTAS DISPONÍVEIS: R$ 20,00, R$ 50,00 E R$ 100,00");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 100, 360, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(200, 150, 380, 210);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECIONE A OPÇÃO DESEJADA OU DIGITE O VALOR E TECLE ENTRA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 90, 660, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/saquedigital.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 780, 70);

        valor2.setBackground(new java.awt.Color(153, 204, 255));
        valor2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        valor2.setForeground(new java.awt.Color(255, 255, 255));
        valor2.setText("R$40");
        valor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor2ActionPerformed(evt);
            }
        });
        jPanel1.add(valor2);
        valor2.setBounds(30, 240, 140, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(775, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void valor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor3ActionPerformed
       Total+=50;
        resul.setText(String.valueOf("R$ " + Total + " ,00"));
    }//GEN-LAST:event_valor3ActionPerformed

    private void valor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor1ActionPerformed
        Total+=20;
        resul.setText(String.valueOf("R$ " + Total + " ,00"));
    }//GEN-LAST:event_valor1ActionPerformed

    private void valor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor5ActionPerformed
        Total+=300;
        resul.setText(String.valueOf("R$ " + Total + " ,00"));        
    }//GEN-LAST:event_valor5ActionPerformed

    private void valor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor4ActionPerformed
        Total+=100;
        resul.setText(String.valueOf("R$ " + Total + " ,00"));
    }//GEN-LAST:event_valor4ActionPerformed

    private void valor8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor8ActionPerformed
        Total+=1000;
        resul.setText(String.valueOf("R$ " + Total + " ,00"));        
    }//GEN-LAST:event_valor8ActionPerformed

    private void SAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAIRActionPerformed
       new Tela02_GUI().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_SAIRActionPerformed

    private void concluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirActionPerformed

        JOptionPane.showMessageDialog(null,"SAQUE REALIZADO !");
         this.dispose(); 

        
    }//GEN-LAST:event_concluirActionPerformed

    private void valor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor2ActionPerformed
       Total+=40;
        resul.setText(String.valueOf("R$ " + Total + " ,00"));
        

    }//GEN-LAST:event_valor2ActionPerformed

    private void valor7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor7ActionPerformed
        Total+=900;
        resul.setText(String.valueOf("R$ " + Total + " ,00"));        // TODO add your handling code here:
    }//GEN-LAST:event_valor7ActionPerformed

    private void valor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor6ActionPerformed
        Total+=500;
        resul.setText(String.valueOf("R$ " + Total + " ,00"));        // TODO add your handling code here:
    }//GEN-LAST:event_valor6ActionPerformed

    private void resulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resulActionPerformed

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
            java.util.logging.Logger.getLogger(Tela03_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela03_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela03_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela03_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SAIR;
    private javax.swing.JButton concluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField resul;
    private javax.swing.JButton valor1;
    private javax.swing.JButton valor2;
    private javax.swing.JButton valor3;
    private javax.swing.JButton valor4;
    private javax.swing.JButton valor5;
    private javax.swing.JButton valor6;
    private javax.swing.JButton valor7;
    private javax.swing.JButton valor8;
    // End of variables declaration//GEN-END:variables
}
