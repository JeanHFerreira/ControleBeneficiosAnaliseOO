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
    
    public boolean salvar(){
        int cod = this.getFuncionarioRN().getFuncionarioVO().getCod();
        String nome = this.getFuncionarioRN().getFuncionarioVO().getNome();
        String cpf = this.getFuncionarioRN().getFuncionarioVO().getCpf();
        int cargoCodigo = this.getFuncionarioRN().getFuncionarioVO().getCargoVO().getCod();
        int gerenciaCodigo = this.getFuncionarioRN().getFuncionarioVO().getGerenciaVO().getCod();
        //Validação
        if (cod == -1 || nome == null || nome.trim().equals("")|| 
                cpf.trim().equals("")||this.getFuncionarioRN().validarCpf(cpf)) {
            return false;
        }

        String sql;
        Connection con = new Conexao().getConnection();
        try (Statement stm = con.createStatement()) {
            if (cod == 0) {
                sql = "insert into funcionario(funcionarionome, "
                                            + "funcionariocpf, "
                                            + "cargocodigo, "
                                            + "gerenciacodigo)" + 
                        "values('" + nome + "'," +
                                    cpf + ","+
                                ((cargoCodigo>0)?gerenciaCodigo:"null")+
                                ","+((gerenciaCodigo>0)?gerenciaCodigo:"null")+")"
                        + "RETURNING funcionariocodigo";
                ResultSet rs = stm.executeQuery(sql);
                rs.next();
                int resultado = rs.getInt(1);
                this.getFuncionarioRN().getFuncionarioVO().setCod(resultado);
            } else {
                sql = "update funcionario "
                        + "set funcionarionome = '" + nome + "', "
                        + "funcionariocpf = " + cpf + "', "
                        + "cargocodigo = " + cargoCodigo + "', "
                        + "gerenciacodigo = " + gerenciaCodigo + "', "
                        + " where gerenciacodigo = " + cod + "";
                stm.executeUpdate(sql);
            }
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro.\n" + ex.getMessage());
        }
        return false;
    }

    public ArrayList<FuncionarioVO> carregarTabela(String nome) {
        ArrayList<FuncionarioVO> lista = new ArrayList<FuncionarioVO>();

        Connection con = new Conexao().getConnection();
        String sql = "select F.funcionariocodigo, "
                          + "F.funcionarionome, "
                          + "F.funcionariocpf,"
                          + "C.cargocodigo,"
                          + "C.cargonome,"
                          + "C.cargosalariobase,"
                          + "G.gerenciacodigo,"
                          + "G.gerencianome,"
                          + "G.gerenciadicionalsalario"
                     + "from funcionario F";
        sql+="inner join cargo C on F.cargocodigo = C.cargocodigo";
        sql+="inner join gerencia G on G.gerenciacodigo = G.gerencianome";
        sql+="where funcionarionome LIKE '%" + nome + "%'";
        Statement stm = null;
        ResultSet rs = null;
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Erro na sql tabela funcionario\nErro:"+ex.getMessage());
        }

        try {
            while (rs.next()) {
                int idFuncionario = rs.getInt(1);
                String nomeFuncionario = rs.getString(2);
                String cpf = rs.getString(3);
                int idCargo = rs.getInt(4);
                String nomeCargo = rs.getString(5);
                double salarioCargo = rs.getDouble(6);
                CargoVO cargoVO = new CargoVO(idCargo,nomeCargo,salarioCargo);
                int idGerencia = rs.getInt(7);
                String nomeGerencia = rs.getString(8);
                double salarioGerencia = rs.getDouble(9);
                GerenciaVO gerenciaVO = new GerenciaVO(idGerencia,nomeGerencia,salarioGerencia);
                FuncionarioVO FuncionarioVO = new FuncionarioVO(idFuncionario, nomeFuncionario, cpf,cargoVO,gerenciaVO);
                lista.add(FuncionarioVO);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ralação funcionario\nErro:"+ex.getMessage());
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
    
    public FuncionarioRN getFuncionarioRN(){
        return funcionarioRN;
    }
    
    public void setFuncionarioRN(FuncionarioRN funcionarioRN){
        this.funcionarioRN = funcionarioRN;
    }

}
