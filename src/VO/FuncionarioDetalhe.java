package VO;

import VO.FuncionarioVO;
import RN.FuncionarioRN;
import PERS.FuncionarioPERS;
import VO.TelaDependente;
import java.util.ArrayList;

/**
 * @author Jean
 * @author Andressa
 * @author Eric
 */
public class FuncionarioDetalhe extends javax.swing.JFrame {

    public FuncionarioDetalhe() {
        initComponents();
        this.setSize(486, 330);
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.
        this.btDependente.setEnabled(false);
    }

    public FuncionarioDetalhe(FuncionarioVO funcionarioVO) {
        initComponents();
        this.setSize(486, 330);
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.
        this.btDependente.setEnabled(true);
        //Setar campos com os dados do funcionarioVO -- funcionarioVO.get...
    }

    public void setarCombo(FuncionarioVO funcionarioVO) {
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        ArrayList <CargoVO> listaCargo = funcionarioPERS.BuscarComboCargo();
        ArrayList <GerenciaVO> listaGerencia = funcionarioPERS.BuscarComboGerencia();
        
        for(int i = 0; i<listaCargo.size(); i++){
            this.cbCargo.addItem(listaCargo.get(i));
        }
        
        for(int i = 0; i<listaGerencia.size(); i++){
            this.cbGerencia.addItem(listaGerencia.get(i));
        }
        
        if (funcionarioVO != null) {
            //this.cbCargo.setSelectedIndex();//setar indice do combo
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbSalario = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        cbCargo = new javax.swing.JComboBox();
        lbCargo = new javax.swing.JLabel();
        blCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        btSalvarEditar = new javax.swing.JButton();
        btDependente = new javax.swing.JButton();
        lbGerencia = new javax.swing.JLabel();
        cbGerencia = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dados de um funcionário");
        getContentPane().setLayout(null);

        lbSalario.setText("Salário");
        getContentPane().add(lbSalario);
        lbSalario.setBounds(20, 180, 34, 14);

        lbNome.setText("Nome");
        getContentPane().add(lbNome);
        lbNome.setBounds(20, 50, 27, 14);

        lbCpf.setText("CPF");
        getContentPane().add(lbCpf);
        lbCpf.setBounds(20, 80, 19, 14);
        getContentPane().add(txtSalario);
        txtSalario.setBounds(70, 170, 230, 20);
        getContentPane().add(txtNome);
        txtNome.setBounds(70, 50, 230, 20);
        getContentPane().add(txtCpf);
        txtCpf.setBounds(70, 80, 230, 20);

        getContentPane().add(cbCargo);
        cbCargo.setBounds(70, 110, 230, 20);

        lbCargo.setText("Cargo");
        getContentPane().add(lbCargo);
        lbCargo.setBounds(20, 110, 29, 14);

        blCodigo.setText("Código");
        getContentPane().add(blCodigo);
        blCodigo.setBounds(20, 20, 33, 14);

        txtCodigo.setText("-");
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(70, 20, 230, 14);

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(310, 260, 90, 23);

        btSalvarEditar.setText("Qualquer coisa");
        btSalvarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvarEditar);
        btSalvarEditar.setBounds(173, 260, 120, 23);

        btDependente.setText("Dependentes");
        btDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDependenteActionPerformed(evt);
            }
        });
        getContentPane().add(btDependente);
        btDependente.setBounds(10, 260, 120, 23);

        lbGerencia.setText("Gerencia");
        getContentPane().add(lbGerencia);
        lbGerencia.setBounds(10, 140, 50, 14);

        getContentPane().add(cbGerencia);
        cbGerencia.setBounds(70, 140, 230, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDependenteActionPerformed
        if (!this.txtCodigo.getText().equals("-")) {
            int cod;
            TelaDependente telaDependente = new TelaDependente();
            cod = Integer.parseInt(this.txtCodigo.getText());
            telaDependente.setarTabela(cod);
            telaDependente.setVisible(true);
        }
    }//GEN-LAST:event_btDependenteActionPerformed

    private void btSalvarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarEditarActionPerformed
        if (btSalvarEditar.getText().equals("Editar")) {

        } else {
            if (btSalvarEditar.getText().equals("Salvar")) {

            }
        }
    }//GEN-LAST:event_btSalvarEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        
    }//GEN-LAST:event_btExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionarioDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioDetalhe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blCodigo;
    private javax.swing.JButton btDependente;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvarEditar;
    private javax.swing.JComboBox cbCargo;
    private javax.swing.JComboBox cbGerencia;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbGerencia;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
