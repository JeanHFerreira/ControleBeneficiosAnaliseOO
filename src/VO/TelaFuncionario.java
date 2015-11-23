package VO;

import PERS.FuncionarioPERS;
import RN.FuncionarioRN;
import VO.FuncionarioVO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Jean
 * @author Andressa
 * @author Eric
 */
public class TelaFuncionario extends javax.swing.JFrame {

    public TelaFuncionario() {
        initComponents();
        this.setSize(900, 323);
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRelacao = new javax.swing.JTextField();
        btRelacao = new javax.swing.JButton();
        btDetalhe = new javax.swing.JButton();
        btIncluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de funcionário");
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(txtRelacao);
        txtRelacao.setBounds(20, 10, 740, 30);

        btRelacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VO/imgs/bt_lupa_buscar.png"))); // NOI18N
        btRelacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btRelacao);
        btRelacao.setBounds(770, 10, 50, 30);

        btDetalhe.setText("Detalhe");
        btDetalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDetalheActionPerformed(evt);
            }
        });
        getContentPane().add(btDetalhe);
        btDetalhe.setBounds(560, 260, 90, 23);

        btIncluir.setText("Incluir");
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });
        getContentPane().add(btIncluir);
        btIncluir.setBounds(790, 260, 90, 23);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Sexo", "RG", "CPF", "Data nascimento", "Nível", "Login", "Senha", "Endereço", "Cargo", "Gerencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(4).setResizable(false);
            tabela.getColumnModel().getColumn(5).setResizable(false);
            tabela.getColumnModel().getColumn(6).setResizable(false);
            tabela.getColumnModel().getColumn(7).setResizable(false);
            tabela.getColumnModel().getColumn(8).setResizable(false);
            tabela.getColumnModel().getColumn(9).setResizable(false);
            tabela.getColumnModel().getColumn(10).setResizable(false);
            tabela.getColumnModel().getColumn(11).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 880, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDetalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDetalheActionPerformed
        if (this.tabela.getSelectedRowCount() == 1) {
            FuncionarioVO funcionarioVO = new FuncionarioVO();
            funcionarioVO.setCod(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
            funcionarioVO.setNome(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            funcionarioVO.setSexo(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            funcionarioVO.setRg(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            funcionarioVO.setCpf(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
            funcionarioVO.setDataNasc(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
            funcionarioVO.setNivel(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 6).toString()));
            funcionarioVO.setLogin(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());
            funcionarioVO.setSenha(tabela.getValueAt(tabela.getSelectedRow(), 8).toString());
            funcionarioVO.setEndereço(tabela.getValueAt(tabela.getSelectedRow(), 9).toString());
            CargoVO cargoVO = new CargoVO();
            cargoVO.setNome(tabela.getValueAt(tabela.getSelectedRow(), 10).toString());
            GerenciaVO gerenciaVO = new GerenciaVO();
            gerenciaVO.setNome(tabela.getValueAt(tabela.getSelectedRow(), 11).toString());
            funcionarioVO.setCargoVO(cargoVO);
            funcionarioVO.setGerenciaVO(gerenciaVO);
            FuncionarioDetalhe telaFuncDetalhe = new FuncionarioDetalhe(funcionarioVO);
            telaFuncDetalhe.setarCombo(funcionarioVO);
            telaFuncDetalhe.setVisible(true);
        } else {
            if (tabela.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Selecione um item para modificar", null, JOptionPane.ERROR_MESSAGE, null);
            } else {
                JOptionPane.showMessageDialog(this, "Selecione somente um item para modificar", null, JOptionPane.ERROR_MESSAGE, null);
            }
        }
    }//GEN-LAST:event_btDetalheActionPerformed


    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
        FuncionarioDetalhe telaFuncDetalhe = new FuncionarioDetalhe();
        telaFuncDetalhe.setarCombo(null);
        telaFuncDetalhe.setVisible(true);
    }//GEN-LAST:event_btIncluirActionPerformed

    private void btRelacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelacaoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        String texto = txtRelacao.getText();
        if (texto == null) {
            texto = "";
        }
        ArrayList<FuncionarioVO> lista = funcionarioPERS.carregarTabela(texto);

        for (FuncionarioVO item : lista) {
            modelo.addRow(new Object[]{
                item.getCod(), item.getNome(), item.getSexo(),
                item.getRg(), item.getCpf(), item.getDataNasc(), item.getNivel(),
                item.getLogin(), item.getSenha(), item.getEndereço(),
                item.getCargoVO().getNome(), item.getGerenciaVO().getNome()});
        }
    }//GEN-LAST:event_btRelacaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDetalhe;
    private javax.swing.JButton btIncluir;
    private javax.swing.JButton btRelacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtRelacao;
    // End of variables declaration//GEN-END:variables
}
