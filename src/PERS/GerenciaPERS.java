package PERS;

import RN.GerenciaRN;
import VO.BeneficioVO;
import VO.GerenciaVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Jean
 * @author Andressa
 * @author Eric
 */
public class GerenciaPERS {

    private GerenciaRN gerenciaRN;

    public GerenciaPERS(GerenciaRN gerenciaRN) {
        this.setGerenciaRN(gerenciaRN);
    }

    public boolean excluir() {
        int cod = this.getGerenciaRN().getGerenciaVO().getCod();
        String sql;
        Connection con = new Conexao().getConnection();
        try (Statement stm = con.createStatement()) {
            if (cod != 0) {
                sql = "delete from gerencia where gerenciacodigo = " + cod + "";
                stm.executeUpdate(sql);
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Erro.");
            return false;
        }
        return false;
    }

    public void salvar() {
        int cod = this.getGerenciaRN().getGerenciaVO().getCod();
        String nome = this.getGerenciaRN().getGerenciaVO().getNome();
        double salario = this.getGerenciaRN().getGerenciaVO().getSalario();
        String sql;
        Connection con = new Conexao().getConnection();
        try (Statement stm = con.createStatement()) {
            if (cod == 0) {
                sql = "insert into gerencia(gerencianome, gerenciaadicionalsalario)" + "values('" + nome + "'," + salario + ") RETURNING gerenciacodigo";
                ResultSet rs =  stm.executeQuery(sql);
                rs.next();
                int resultado = rs.getInt(1);
                this.getGerenciaRN().getGerenciaVO().setCod(resultado);
            } else {
                sql = "update gerencia set gerencianome = '" + nome + "', gerenciaadicionalsalario = " + salario + " where gerenciacodigo = " + cod + "";
                stm.executeUpdate(sql);
            }
           
            
           
             
        } catch (SQLException ex) {
            System.out.println("Erro.");
        }

    }

    public ArrayList<GerenciaVO> carregarTabela(String nome) {
        ArrayList<GerenciaVO> lista = new ArrayList<GerenciaVO>();

        Connection con = new Conexao().getConnection();
        String sql = "select gerenciacodigo, gerencianome, gerenciaadicionalsalario from gerencia where gerencianome LIKE '%" + nome + "%'";
        Statement stm = null;
        try {
            stm = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(GerenciaPERS.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
        try {
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(GerenciaPERS.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while (rs.next()) {

                int id = rs.getInt(1);
                String nomeGerencia = rs.getString(2);
                double salario = rs.getDouble(3);

                GerenciaVO gerenciaVO = new GerenciaVO(id, nomeGerencia, salario);
                lista.add(gerenciaVO);

            }
        } catch (SQLException ex) {
            Logger.getLogger(GerenciaPERS.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public GerenciaRN getGerenciaRN() {
        return gerenciaRN;
    }

    public void setGerenciaRN(GerenciaRN gerenciaRN) {
        this.gerenciaRN = gerenciaRN;
    }

}
