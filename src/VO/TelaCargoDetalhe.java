/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import PERS.CargoPERS;
import RN.CargoRN;
import javax.swing.JOptionPane;

/**
 *
 * @author Eric
 */
public class TelaCargoDetalhe extends javax.swing.JFrame {

    /**
     * Creates new form TelaCargoDetalhe
     * @param texto
     */
    public void setBotaoModificador(String texto) {
        this.btSalvarEditar.setText(texto);
    }

    public void setBotaoExcluir(String texto) {
        if (texto.equals("Incluir")) {
            this.btExcluir.setEnabled(false);
        }
        if (texto.equals("Editar")) {
            this.btExcluir.setEnabled(true);
        }

    }

    public TelaCargoDetalhe() {
        initComponents();
        this.setSize(400, 200);
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.
    }

    public TelaCargoDetalhe(CargoVO cargoVO) {
        initComponents();
        this.setSize(400, 200);
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.

        lblCodCargo.setText("" + cargoVO.getCod());
        txtNomeCargo.setText(cargoVO.getNome());
        txtSalarioCargo.setText("" + cargoVO.getSalario_base());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCodCargo = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        btSalvarEditar = new javax.swing.JButton();
        txtNomeCargo = new javax.swing.JTextField();
        txtSalarioCargo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Salário");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(45, 93, 41, 16);

        jLabel3.setText("Cod");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 30, 41, 16);

        jLabel4.setText("Nome");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 60, 41, 16);

        lblCodCargo.setText("-");
        getContentPane().add(lblCodCargo);
        lblCodCargo.setBounds(100, 30, 160, 16);

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(300, 130, 80, 28);

        btSalvarEditar.setText("Qualquer coisa");
        btSalvarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvarEditar);
        btSalvarEditar.setBounds(130, 130, 150, 28);

        txtNomeCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCargoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeCargo);
        txtNomeCargo.setBounds(90, 58, 250, 30);

        txtSalarioCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioCargoActionPerformed(evt);
            }
        });
        getContentPane().add(txtSalarioCargo);
        txtSalarioCargo.setBounds(90, 90, 250, 30);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 130, 80, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VO/imgs/bt_gerenciaDetalhe.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(Integer.parseInt(lblCodCargo.getText()));
        cargoVO.setNome(txtNomeCargo.getText());
        cargoVO.setSalario_base(Double.parseDouble(txtSalarioCargo.getText()));
        CargoRN cargoRN = new CargoRN(cargoVO);
        CargoPERS cargoPERS = new CargoPERS(cargoRN);

        if (cargoPERS.excluir()) {
            JOptionPane.showMessageDialog(this, "Excluído com sucesso!");
            this.lblCodCargo.setText("-");
            this.txtNomeCargo.setText("");
            this.txtSalarioCargo.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir!");
        }


    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSalvarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarEditarActionPerformed
        if (btSalvarEditar.getText().equals("Salvar")) {
            btSalvarEditar.setText("Editar");
            txtNomeCargo.setEnabled(false);
            txtSalarioCargo.setEnabled(false);
            int codigo;
            if (lblCodCargo.getText().equals("-")) {
                codigo = 0;
            } else {
                codigo = Integer.parseInt(lblCodCargo.getText());
            }

            CargoVO cargoVO = new CargoVO(codigo, this.txtNomeCargo.getText(), Double.parseDouble(this.txtSalarioCargo.getText()));

            CargoRN cargoRN = new CargoRN(cargoVO);
            CargoPERS cargoPERS = new CargoPERS(cargoRN);
            cargoPERS.salvar();
            this.lblCodCargo.setText("" + cargoVO.getCod());
            this.btExcluir.setEnabled(true);

        } else {
            if (btSalvarEditar.getText().equals("Editar")) {
                btSalvarEditar.setText("Salvar");
                txtNomeCargo.setEnabled(true);
                txtSalarioCargo.setEnabled(true);
                this.btExcluir.setEnabled(false);
            }
        }

    }//GEN-LAST:event_btSalvarEditarActionPerformed

    private void txtNomeCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCargoActionPerformed

    private void txtSalarioCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioCargoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaCargo tela = new TelaCargo();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCargoDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCargoDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCargoDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCargoDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCargoDetalhe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvarEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCodCargo;
    private javax.swing.JTextField txtNomeCargo;
    private javax.swing.JTextField txtSalarioCargo;
    // End of variables declaration//GEN-END:variables
}
