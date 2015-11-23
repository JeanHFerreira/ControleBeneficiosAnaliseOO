package VO;

import VO.FuncionarioVO;
import RN.FuncionarioRN;
import PERS.FuncionarioPERS;
import VO.TelaDependente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Jean
 * @author Andressa
 * @author Eric
 */
public class TelaFuncionarioDetalhe extends javax.swing.JFrame {

    private ArrayList<CargoVO> listaCargo;
    private ArrayList<GerenciaVO> listaGerencia;

    public TelaFuncionarioDetalhe() {
        initComponents();
        this.setSize(420, 550);
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.
        this.btDependente.setEnabled(false);
        this.btSalvarEditar.setText("Salvar");
    }

    public TelaFuncionarioDetalhe(FuncionarioVO funcionarioVO) {
        initComponents();
        this.setSize(420, 550);
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.
        this.btDependente.setEnabled(true);
        this.txtCodigo.setText("" + funcionarioVO.getCod());
        this.txtCpf.setText(funcionarioVO.getCpf());
        this.txtDataNasc.setText(funcionarioVO.getDataNasc());
        this.txtLogin.setText(funcionarioVO.getLogin());
        this.txtNome.setText(funcionarioVO.getNome());
        this.txtRG.setText(funcionarioVO.getRg());
        this.txtSenha.setText(funcionarioVO.getSenha());
        this.btSalvarEditar.setText("Salvar");
        if (funcionarioVO.getSexo().equals("M")) {
            this.rbMasculino.setSelected(true);
        } else {
            this.rbFeminino.setSelected(true);
        }
        if (funcionarioVO.getNivel() != 0) {
            this.cbNivel.setSelectedIndex(funcionarioVO.getNivel() - 1);
        }

    }

    public void setarCombo(FuncionarioVO funcionarioVO) {
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        this.listaCargo = funcionarioPERS.BuscarComboCargo();
        this.listaGerencia = funcionarioPERS.BuscarComboGerencia();
        int index = 0;
        for (int i = 0; i < this.listaCargo.size(); i++) {
            this.cbCargo.addItem(this.listaCargo.get(i).getNome());
            if ((funcionarioVO != null)
                    && (this.listaCargo.get(i).getNome().equals(funcionarioVO.getCargoVO().getNome()))) {
                index = i;
            }
        }
        this.cbCargo.setSelectedIndex(index);
        index = 0;

        for (int i = 0; i < this.listaGerencia.size(); i++) {
            this.cbGerencia.addItem(this.listaGerencia.get(i).getNome());
            if ((funcionarioVO != null)
                    && (this.listaGerencia.get(i).getNome().equals(funcionarioVO.getGerenciaVO().getNome()))) {
                index = i;
            }
        }
        this.cbGerencia.setSelectedIndex(index);
    }

    public GerenciaVO pegarIdGerencia(String obj) {
        for (int i = 0; i < listaGerencia.size(); i++) {
            if (listaGerencia.get(i).getNome().equals(obj)) {
                return listaGerencia.get(i);
            }
        }
        return null;
    }

    public CargoVO pegarIdCargo(String obj) {
        System.out.println("OBJ:" + obj);
        for (int i = 0; i < listaCargo.size(); i++) {
            System.out.println("Nome:" + listaCargo.get(i).getNome());
            if (listaCargo.get(i).getNome().equals(obj)) {

                return listaCargo.get(i);
            }
        }
        return null;
    }

    public String pegarSexo() {
        return (this.rbMasculino.isSelected()) ? "M" : "S";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbSalario = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        cbCargo = new javax.swing.JComboBox();
        lbCargo = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        btSalvarEditar = new javax.swing.JButton();
        btDependente = new javax.swing.JButton();
        lbGerencia = new javax.swing.JLabel();
        cbGerencia = new javax.swing.JComboBox();
        lbRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JTextField();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        lbLogin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        cbNivel = new javax.swing.JComboBox();
        txtSenha = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dados de um funcionário");
        getContentPane().setLayout(null);

        lbSalario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSalario.setText("Salário");
        getContentPane().add(lbSalario);
        lbSalario.setBounds(4, 380, 120, 14);

        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNome.setText("Nome");
        getContentPane().add(lbNome);
        lbNome.setBounds(17, 54, 110, 20);

        lbCpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCpf.setText("CPF");
        getContentPane().add(lbCpf);
        lbCpf.setBounds(19, 110, 110, 20);

        txtSalario.setEnabled(false);
        getContentPane().add(txtSalario);
        txtSalario.setBounds(150, 380, 250, 20);
        getContentPane().add(txtNome);
        txtNome.setBounds(150, 50, 250, 20);
        getContentPane().add(txtCpf);
        txtCpf.setBounds(150, 110, 250, 20);

        getContentPane().add(cbCargo);
        cbCargo.setBounds(150, 210, 250, 20);

        lbCargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCargo.setText("Cargo");
        getContentPane().add(lbCargo);
        lbCargo.setBounds(9, 210, 120, 14);

        lbCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCodigo.setText("Código");
        getContentPane().add(lbCodigo);
        lbCodigo.setBounds(50, 20, 80, 20);

        txtCodigo.setText("-");
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(160, 20, 230, 20);

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(290, 450, 90, 23);

        btSalvarEditar.setText("Qualquer coisa");
        btSalvarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvarEditar);
        btSalvarEditar.setBounds(150, 450, 120, 23);

        btDependente.setText("Dependentes");
        btDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDependenteActionPerformed(evt);
            }
        });
        getContentPane().add(btDependente);
        btDependente.setBounds(10, 450, 120, 23);

        lbGerencia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbGerencia.setText("Gerencia");
        getContentPane().add(lbGerencia);
        lbGerencia.setBounds(0, 250, 130, 14);

        getContentPane().add(cbGerencia);
        cbGerencia.setBounds(150, 250, 250, 20);

        lbRG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbRG.setText("RG");
        getContentPane().add(lbRG);
        lbRG.setBounds(24, 80, 100, 20);
        getContentPane().add(txtRG);
        txtRG.setBounds(150, 80, 250, 20);

        lbSexo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSexo.setText("Sexo");
        getContentPane().add(lbSexo);
        lbSexo.setBounds(14, 140, 110, 20);
        getContentPane().add(txtDataNasc);
        txtDataNasc.setBounds(150, 170, 250, 20);

        buttonGroup1.add(rbMasculino);
        rbMasculino.setSelected(true);
        rbMasculino.setText("Masculino");
        getContentPane().add(rbMasculino);
        rbMasculino.setBounds(150, 140, 90, 23);

        buttonGroup1.add(rbFeminino);
        rbFeminino.setText("Feminino");
        getContentPane().add(rbFeminino);
        rbFeminino.setBounds(250, 140, 110, 23);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Data de nascimento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 170, 130, 20);

        lbLogin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbLogin.setText("Login");
        getContentPane().add(lbLogin);
        lbLogin.setBounds(5, 290, 120, 14);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Senha");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 320, 120, 14);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nível");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(3, 350, 130, 10);
        getContentPane().add(txtLogin);
        txtLogin.setBounds(150, 290, 250, 20);

        cbNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        cbNivel.setSelectedIndex(3);
        getContentPane().add(cbNivel);
        cbNivel.setBounds(150, 350, 250, 20);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(150, 320, 250, 20);
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(150, 410, 250, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Endereço");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 414, 90, 20);

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
            this.txtCodigo.setEnabled(true);
            this.txtNome.setEnabled(true);
            this.txtRG.setEnabled(true);
            this.txtCpf.setEnabled(true);
            this.rbFeminino.setEnabled(true);
            this.rbFeminino.setEnabled(true);
            this.txtDataNasc.setEnabled(true);
            this.cbCargo.setEnabled(true);
            this.cbGerencia.setEnabled(true);
            this.txtLogin.setEnabled(true);
            this.txtSenha.setEnabled(true);
            this.cbNivel.setEnabled(true);
            this.txtEndereco.setEnabled(true);
            this.btSalvarEditar.setText("Salvar");
        } else {
            if (btSalvarEditar.getText().equals("Salvar")) {
                this.txtCodigo.setEnabled(false);
                this.txtNome.setEnabled(false);
                this.txtRG.setEnabled(false);
                this.txtCpf.setEnabled(false);
                this.rbFeminino.setEnabled(false);
                this.rbFeminino.setEnabled(false);
                this.txtDataNasc.setEnabled(false);
                this.cbCargo.setEnabled(false);
                this.cbGerencia.setEnabled(false);
                this.txtLogin.setEnabled(false);
                this.txtSenha.setEnabled(false);
                this.cbNivel.setEnabled(false);
                this.txtEndereco.setEnabled(false);
                FuncionarioVO funcionarioVO = new FuncionarioVO();
                int codigo;
                if (txtCodigo.getText().equals("-")) {
                    codigo = 0;
                } else {
                    codigo = Integer.parseInt(txtCodigo.getText());
                }
                funcionarioVO.setCod(codigo);
                funcionarioVO.setNome(this.txtNome.getText());
                funcionarioVO.setRg(this.txtRG.getText());
                funcionarioVO.setCpf(this.txtCpf.getText());
                funcionarioVO.setSexo(this.pegarSexo());
                funcionarioVO.setDataNasc(this.txtDataNasc.getText());
                funcionarioVO.setGerenciaVO(this.pegarIdGerencia((String) this.cbGerencia.getSelectedItem()));
                funcionarioVO.setCargoVO(this.pegarIdCargo((String) this.cbCargo.getSelectedItem()));
                funcionarioVO.setLogin(this.txtLogin.getText());
                funcionarioVO.setSenha(this.txtSenha.getText());
                funcionarioVO.setNivel(this.cbNivel.getSelectedIndex() + 1);
                funcionarioVO.setEndereço(this.txtEndereco.getText());
                FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
                FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
                if (funcionarioPERS.salvar()) {
                    this.lbCodigo.setText("" + funcionarioVO.getCod());
                    this.btDependente.setEnabled(true);
                    this.btSalvarEditar.setText("Editar");
                    JOptionPane.showMessageDialog(this, "Salvo com sucesso", "Salvo!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    this.txtCodigo.setEnabled(true);
                    this.txtNome.setEnabled(true);
                    this.txtRG.setEnabled(true);
                    this.txtCpf.setEnabled(true);
                    this.rbFeminino.setEnabled(true);
                    this.rbFeminino.setEnabled(true);
                    this.txtDataNasc.setEnabled(true);
                    this.cbCargo.setEnabled(true);
                    this.cbGerencia.setEnabled(true);
                    this.txtLogin.setEnabled(true);
                    this.txtSenha.setEnabled(true);
                    this.cbNivel.setEnabled(true);
                    this.txtEndereco.setEnabled(true);
                    JOptionPane.showMessageDialog(this, "Falha ao salvar", "Erro ao salvar", JOptionPane.ERROR_MESSAGE);
                }
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
            java.util.logging.Logger.getLogger(TelaFuncionarioDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarioDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarioDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarioDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionarioDetalhe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDependente;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvarEditar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbCargo;
    private javax.swing.JComboBox cbGerencia;
    private javax.swing.JComboBox cbNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbGerencia;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbRG;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
