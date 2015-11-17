package VO;

/**
 * @author Ericson
 * @author Andressa
 * @author Jean_H_xD
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastroDiversos = new javax.swing.JMenu();
        miGerencia = new javax.swing.JMenuItem();
        miCargo = new javax.swing.JMenuItem();
        miFuncionario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnCadastroDiversos.setText("Cadastros diversos");

        miGerencia.setText("Gerencia");
        miGerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGerenciaActionPerformed(evt);
            }
        });
        mnCadastroDiversos.add(miGerencia);

        miCargo.setText("Cargo");
        miCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCargoActionPerformed(evt);
            }
        });
        mnCadastroDiversos.add(miCargo);

        miFuncionario.setText("Funcionario");
        miFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFuncionarioActionPerformed(evt);
            }
        });
        mnCadastroDiversos.add(miFuncionario);

        jMenuBar1.add(mnCadastroDiversos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFuncionarioActionPerformed
        /*TelaFuncionario telaFuncionario = new TelaFuncionario();
         telaFuncionario.funcionario.setVisible();*/
    }//GEN-LAST:event_miFuncionarioActionPerformed

    private void miCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCargoActionPerformed
        /*TelaCargo telaCargo = new TelaCargo();
         telaCargo.setVisible(true);*/
    }//GEN-LAST:event_miCargoActionPerformed

    private void miGerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGerenciaActionPerformed
        TelaGerencia telaGerencia = new TelaGerencia();
        telaGerencia.setVisible(true);
    }//GEN-LAST:event_miGerenciaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miCargo;
    private javax.swing.JMenuItem miFuncionario;
    private javax.swing.JMenuItem miGerencia;
    private javax.swing.JMenu mnCadastroDiversos;
    // End of variables declaration//GEN-END:variables
}
