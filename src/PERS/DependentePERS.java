/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import RN.DependenteRN;
import VO.DependenteVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eric
 */
public class DependentePERS {

    private DependenteRN dependenteRN;

    public DependentePERS(DependenteRN dependenteRN) {
        this.setDependenteRN(dependenteRN);
    }

    public boolean excluir() {
        int cod = this.getDependenteRN().getDependenteVO().getCod();
        String nome = this.getDependenteRN().getDependenteVO().getNome().trim();
        String sexo = this.getDependenteRN().getDependenteVO().getSexo().trim();
        String cpf = this.getDependenteRN().getDependenteVO().getCpf().trim();

        if (cod <= -1 || nome == null || nome.equals("")) {
            return false;
        }
        String sql;
        Connection con = new Conexao().getConnection();
        try (Statement stm = con.createStatement()) {
            if (cod != 0) {
                sql = "delete from dependente where dependentecodigo = " + cod + "";
                stm.executeUpdate(sql);
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Erro.");
            return false;
        }
        return false;
    }

    public boolean salvar() {
        int cod = this.getDependenteRN().getDependenteVO().getCod();
        String nome = this.getDependenteRN().getDependenteVO().getNome().trim();
        String sexo = this.getDependenteRN().getDependenteVO().getSexo().trim();
        String cpf = this.getDependenteRN().getDependenteVO().getCpf().trim();
        System.out.println("AQUI");
        int funcionario_codigo = this.getDependenteRN().getDependenteVO().getFuncionarioVO().getCod();
        //Validação
        if (cod == -1 || nome == null || nome.trim().equals("")) {
            return false;
        }

        String sql;
        Connection con = new Conexao().getConnection();
        try (Statement stm = con.createStatement()) {
            if (cod == 0) {
                sql = "insert into dependente(dependentenome, dependentesexo, dependentecpf, funcionariocodigo)" + 
                        "values('" + nome + "','" + sexo + "','" + cpf + "'," + funcionario_codigo + ") RETURNING dependentecodigo";
                ResultSet rs = stm.executeQuery(sql);
                rs.next();
                int resultado = rs.getInt(1);
                this.getDependenteRN().getDependenteVO().setCod(resultado);
            } else {
                sql = "update dependente set dependenteNome  = '" + nome + "', dependenteSexo = '" + sexo + "', dependenteCPF  = '" + cpf + "' where dependenteCodigo = " + cod + "";
                stm.executeUpdate(sql);

            }
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro.");
        }
        return false;
    }

    public ArrayList<DependenteVO> carregarTabela(String nome) {
        ArrayList<DependenteVO> lista = new ArrayList<DependenteVO>();

        Connection con = new Conexao().getConnection();
        String sql = "select dependentecodigo, "
                + "dependentenome, "
                + "dependentesexo, "
                + "dependentecpf "
                + "from dependente "
                + "where funcionariocodigo = " + this.getDependenteRN().getDependenteVO().getFuncionarioVO().getCod()
                + " and dependentenome LIKE '%" + nome + "%'";
        Statement stm = null;
        try {
            stm = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DependentePERS.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
        try {
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DependentePERS.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while (rs.next()) {

                int id = rs.getInt(1);
                String nomeDependente = rs.getString(2);
                String sexo = rs.getString(3);
                String cpf = rs.getString(4);

                DependenteVO dependenteVO = new DependenteVO(id, nomeDependente, sexo, cpf);
                lista.add(dependenteVO);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DependentePERS.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public DependenteRN getDependenteRN() {
        return dependenteRN;
    }

    public void setDependenteRN(DependenteRN dependenteRN) {
        this.dependenteRN = dependenteRN;
    }
}
