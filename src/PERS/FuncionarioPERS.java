package PERS;

import RN.FuncionarioRN;
import VO.CargoVO;
import VO.FuncionarioVO;
import VO.GerenciaVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Eric
 * @author Andressa
 * @author Jean_H_xD
 */
public class FuncionarioPERS {

    FuncionarioRN funcionarioRN;

    public FuncionarioPERS(FuncionarioRN funcionarioRN) {
        this.funcionarioRN = funcionarioRN;
    }

    public ArrayList<FuncionarioVO> carregarTabela(String nome) {
        ArrayList<FuncionarioVO> lista = new ArrayList<FuncionarioVO>();

        Connection con = new Conexao().getConnection();
        String sql = "select funcionariocodigo, funcionarionome, funcionariocpf from funcionario where funcionarionome LIKE '%" + nome + "%'";
        Statement stm = null;
        try {
            stm = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioPERS.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
        try {
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioPERS.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while (rs.next()) {

                int id = rs.getInt(1);
                String nomeFuncionario = rs.getString(2);
                String cpf = rs.getString(3);

                FuncionarioVO FuncionarioVO = new FuncionarioVO(id, nomeFuncionario, cpf);
                lista.add(FuncionarioVO);

            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioPERS.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public ArrayList<CargoVO> BuscarComboCargo() {
        ArrayList <CargoVO> lista = new ArrayList<CargoVO>();
        Connection con = new Conexao().getConnection();
        String sql = "select cargocodigo, cargonome from cargo";
        Statement stm = null;
        ResultSet rs = null;
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Erro na sql de cargo\nErro:"+ex.getMessage());
        }
        try {
            while (rs.next()) {

                int id = rs.getInt(1);
                String nomeCargo = rs.getString(2);

                CargoVO cargoVO = new CargoVO(id,nomeCargo,0.0);
                lista.add(cargoVO);

            }
        } catch (SQLException ex) {
           System.out.println("Erro ao mandar a lista de cargo");
        }
        return lista;
    }
    
    public ArrayList<GerenciaVO> BuscarComboGerencia() {
        ArrayList <GerenciaVO> lista = new ArrayList<>();
        Connection con = new Conexao().getConnection();
        String sql = "select gerenciacodigo, gerencianome from gerencia";
        Statement stm = null;
        ResultSet rs = null;
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Erro na sql de gerencia\nErro:"+ex.getMessage());
        }
        try {
            while (rs.next()) {
                int id = rs.getInt(1);
                String nomeGerencia = rs.getString(2);
                GerenciaVO gerenciaVO = new GerenciaVO(id,nomeGerencia,0.0);
                lista.add(gerenciaVO);
            }
        } catch (SQLException ex) {
           System.out.println("Erro ao mandar a lista de cargo");
        }
        return lista;
    }

}
