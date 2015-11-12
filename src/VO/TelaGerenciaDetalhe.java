/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import PERS.GerenciaPERS;
import RN.GerenciaRN;

/**
 *
 * @author Eric
 */
public class TelaGerenciaDetalhe extends javax.swing.JFrame {

    public void setBotaoSalvarEditar(String texto) {
        this.btSalvarEditar.setText(texto);
    }

    public TelaGerenciaDetalhe() {
        initComponents();
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCodGerencia = new javax.swing.JLabel();
        txtNomeGerencia = new javax.swing.JTextField();
        txtSalarioAdicional = new javax.swing.JTextField();
        btSalvarEditar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel1.setText("Cod");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 27, -1, 20));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 54, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel3.setText("Salári Adicional");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, -1, -1));

        lblCodGerencia.setBackground(new java.awt.Color(255, 255, 255));
        lblCodGerencia.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblCodGerencia.setForeground(new java.awt.Color(51, 51, 51));
        lblCodGerencia.setText("CODIGO");
        getContentPane().add(lblCodGerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        txtNomeGerencia.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        txtNomeGerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeGerenciaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeGerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 250, -1));

        txtSalarioAdicional.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        getContentPane().add(txtSalarioAdicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 250, -1));

        btSalvarEditar.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        btSalvarEditar.setText("Quaquer coisa");
        btSalvarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvarEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jButton2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jButton2.setText("Excluir");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VO/imgs/bt_gerenciaDetalhe.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeGerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeGerenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeGerenciaActionPerformed

    private void btSalvarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarEditarActionPerformed
        if (btSalvarEditar.getText().equals("Salvar")) {
            btSalvarEditar.setText("Editar");
            txtNomeGerencia.setEnabled(false);
            txtSalarioAdicional.setEnabled(false);
            GerenciaVO gerenciaVO = new GerenciaVO(-1, this.txtNomeGerencia.getText(), Double.parseDouble(this.txtSalarioAdicional.getText()));

            GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
            GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
            gerenciaPERS.salvar();

        } else {
            if (btSalvarEditar.getText().equals("Editar")) {
                btSalvarEditar.setText("Salvar");
                txtNomeGerencia.setEnabled(true);
                txtSalarioAdicional.setEnabled(true);
            }
        }

    }//GEN-LAST:event_btSalvarEditarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerenciaDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciaDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciaDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciaDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciaDetalhe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvarEditar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCodGerencia;
    private javax.swing.JTextField txtNomeGerencia;
    private javax.swing.JTextField txtSalarioAdicional;
    // End of variables declaration//GEN-END:variables
}