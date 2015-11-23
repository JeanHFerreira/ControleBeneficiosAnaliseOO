package VO;

import PERS.DependentePERS;
import PERS.FuncionarioPERS;
import RN.DependenteRN;
import RN.FuncionarioRN;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Jean
 * @author Andressa
 * @author Eric
 */
public class TelaDependente extends javax.swing.JFrame {
    
    private FuncionarioVO funcionarioVO;
    
    public TelaDependente() {
        initComponents();
        this.setSize(486, 330);
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.
    }

    public void setarTabela(int codigoFuncionario) {
        FuncionarioVO funcionarioVO2 = new FuncionarioVO();
        funcionarioVO2.setCod(codigoFuncionario);
        this.funcionarioVO = funcionarioVO2;
        System.out.println(this.funcionarioVO.getCod());
        DependenteVO dependenteVO = new DependenteVO();
        dependenteVO.setFuncionarioVO(this.funcionarioVO);
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);

        ArrayList<DependenteVO> lista = dependentePERS.carregarTabela("");
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        modelo.setNumRows(0);
        for (int i = 0; i < lista.size(); i++) {
            modelo.addRow(new Object[]{lista.get(i).getCod(), lista.get(i).getNome(), lista.get(i).getSexo(), lista.get(i).getCpf()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btIncluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dependente");
        getContentPane().setLayout(null);

        tabela.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Sexo", "CPF"
            }
        ));
        tabela.setGridColor(new java.awt.Color(255, 51, 51));
        tabela.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jScrollPane1.setViewportView(tabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 460, 170);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VO/imgs/bt_lupa_buscar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 6, 50, 28);

        txtBusca.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(txtBusca);
        txtBusca.setBounds(20, 6, 360, 27);

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 240, 100, 28);

        btIncluir.setText("Incluir");
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });
        getContentPane().add(btIncluir);
        btIncluir.setBounds(370, 240, 80, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VO/imgs/bg_telaBusca.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed

        System.out.println(this.funcionarioVO.getCod());
        TelaDependenteDetalhe tela = new TelaDependenteDetalhe(this.funcionarioVO);
        tela.setBotaoModificador("Salvar");
        tela.setBotaoExcluir(this.btIncluir.getText());
        tela.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btIncluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        DependenteVO dependenteVO = new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        dependenteVO.setFuncionarioVO(this.funcionarioVO);
        ArrayList<DependenteVO> lista = dependentePERS.carregarTabela(txtBusca.getText());

        for (int i = 0; i < lista.size(); i++) {
            modelo.addRow(new Object[]{lista.get(i).getCod(), lista.get(i).getNome(), lista.get(i).getSexo(), lista.get(i).getCpf()});
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (tabela.getSelectedRowCount() == 1) {
            DependenteVO dependenteVO = new DependenteVO();
            dependenteVO.setCod(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
            dependenteVO.setNome(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            dependenteVO.setSexo(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            dependenteVO.setCpf(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            dependenteVO.setFuncionarioVO(funcionarioVO);
            TelaDependenteDetalhe tela = new TelaDependenteDetalhe(dependenteVO);
            tela.setBotaoModificador("Salvar");
            tela.setVisible(true);
            this.dispose();
        } else {
            if (tabela.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Selecione um item para modificar", null, JOptionPane.ERROR_MESSAGE, null);
            } else {
                JOptionPane.showMessageDialog(this, "Selecione somente um item para modificar", null, JOptionPane.ERROR_MESSAGE, null);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDependente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDependente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDependente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDependente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDependente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIncluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
