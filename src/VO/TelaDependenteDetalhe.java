/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import PERS.DependentePERS;
import RN.DependenteRN;
import javax.swing.JOptionPane;

/**
 *
 * @author Eric
 */
public class TelaDependenteDetalhe extends javax.swing.JFrame {

    /**
     * Creates new form TelaDependenteDetalhe
     */
    private FuncionarioVO funcionarioVO=null;
    
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

    public TelaDependenteDetalhe() {
        initComponents();
        this.setSize(400, 210);
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.
    }

    public TelaDependenteDetalhe(DependenteVO dependenteVO) {
        initComponents();
        this.setSize(400, 210);
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.
        this.setFuncionarioVO(dependenteVO.getFuncionarioVO());
        lblCodDependente.setText("" + dependenteVO.getCod());
        txtNomeDependente.setText(dependenteVO.getNome());
        txtSexo.setSelectedItem(dependenteVO.getSexo());
        txtCPFDependente.setText(dependenteVO.getCpf());

    }
    public TelaDependenteDetalhe(FuncionarioVO funcionarioVO) {
        initComponents();
        this.setSize(400, 210);
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.
        this.setFuncionarioVO(funcionarioVO);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCodDependente = new javax.swing.JLabel();
        txtNomeDependente = new javax.swing.JTextField();
        txtSexo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        btSalvarEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        txtCPFDependente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cod");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 20, 23, 16);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nome");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 50, 34, 16);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Sexo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 80, 27, 16);

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cpf");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 110, 19, 16);

        lblCodDependente.setForeground(new java.awt.Color(0, 0, 0));
        lblCodDependente.setText("-");
        getContentPane().add(lblCodDependente);
        lblCodDependente.setBounds(110, 20, 180, 16);
        getContentPane().add(txtNomeDependente);
        txtNomeDependente.setBounds(110, 50, 250, 28);

        txtSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MASCULINO", "FEMININO" }));
        getContentPane().add(txtSexo);
        txtSexo.setBounds(110, 80, 250, 26);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 140, 100, 28);

        btSalvarEditar.setText("Qualquer coisa");
        btSalvarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvarEditar);
        btSalvarEditar.setBounds(150, 140, 120, 28);

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(274, 140, 90, 28);
        getContentPane().add(txtCPFDependente);
        txtCPFDependente.setBounds(110, 110, 250, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VO/imgs/bt_gerenciaDetalhe.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btSalvarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarEditarActionPerformed
        if (btSalvarEditar.getText().equals("Salvar")) {
            btSalvarEditar.setText("Editar");
            txtNomeDependente.setEnabled(false);
            txtSexo.setEnabled(false);
            txtCPFDependente.setEnabled(false);
            int codigo;
            if (lblCodDependente.getText().equals("-")) {
                codigo = 0;
            } else {
                codigo = Integer.parseInt(lblCodDependente.getText());
            }
            
            DependenteVO dependenteVO = new DependenteVO(codigo, this.txtNomeDependente.getText(), "" + this.txtSexo.getSelectedItem(), this.txtCPFDependente.getText());
            dependenteVO.setFuncionarioVO(funcionarioVO);
            DependenteRN dependenteRN = new DependenteRN(dependenteVO);
            DependentePERS dependentePERS = new DependentePERS(dependenteRN);
            dependentePERS.salvar();
            this.lblCodDependente.setText("" + dependenteVO.getCod());
            this.btExcluir.setEnabled(true);

        } else {
            if (btSalvarEditar.getText().equals("Editar")) {
                btSalvarEditar.setText("Salvar");
                txtNomeDependente.setEnabled(true);
                txtSexo.setEnabled(true);
                txtCPFDependente.setEnabled(true);
                this.btExcluir.setEnabled(false);
                
            }
        }


    }//GEN-LAST:event_btSalvarEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

    DependenteVO dependenteVO = new DependenteVO();
        dependenteVO.setCod(Integer.parseInt(lblCodDependente.getText()));
        dependenteVO.setNome(txtNomeDependente.getText());
        dependenteVO.setSexo(""+txtSexo.getSelectedItem());
        dependenteVO.setCpf(txtCPFDependente.getText());
        
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);

        if (dependentePERS.excluir()) {
            JOptionPane.showMessageDialog(this, "Excluído com sucesso!");
            this.lblCodDependente.setText("-");
            this.txtNomeDependente.setText("");
            this.txtCPFDependente.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir!");
        }


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
            java.util.logging.Logger.getLogger(TelaDependenteDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDependenteDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDependenteDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDependenteDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDependenteDetalhe().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblCodDependente;
    private javax.swing.JTextField txtCPFDependente;
    private javax.swing.JTextField txtNomeDependente;
    private javax.swing.JComboBox txtSexo;
    // End of variables declaration//GEN-END:variables

    public FuncionarioVO getFuncionarioVO() {
        return funcionarioVO;
    }

    public void setFuncionarioVO(FuncionarioVO funcionarioVO) {
        this.funcionarioVO = funcionarioVO;
    }
}
