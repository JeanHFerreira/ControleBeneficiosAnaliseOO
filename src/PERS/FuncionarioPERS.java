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

    public boolean salvar() {
        int cod = this.getFuncionarioRN().getFuncionarioVO().getCod();
        String nome = this.getFuncionarioRN().getFuncionarioVO().getNome();
        String cpf = this.getFuncionarioRN().getFuncionarioVO().getCpf();
        int cargoCodigo = this.getFuncionarioRN().getFuncionarioVO().getCargoVO().getCod();
        int gerenciaCodigo = this.getFuncionarioRN().getFuncionarioVO().getGerenciaVO().getCod();
        String sexo = this.getFuncionarioRN().getFuncionarioVO().getSexo();
        String rg = this.getFuncionarioRN().getFuncionarioVO().getRg();
        String dataNasc = this.getFuncionarioRN().getFuncionarioVO().getDataNasc();
        int nivel = this.getFuncionarioRN().getFuncionarioVO().getNivel();
        String login = this.getFuncionarioRN().getFuncionarioVO().getLogin();
        String senha = this.getFuncionarioRN().getFuncionarioVO().getSenha();
        String endereço = this.getFuncionarioRN().getFuncionarioVO().getEndereço();

        //Validação
        if (cod == -1 || nome == null || nome.trim().equals("")
                || cpf.trim().equals("") || this.getFuncionarioRN().validarCpf(cpf)) {
            return false;
        }

        String sql;
        Connection con = new Conexao().getConnection();
        try (Statement stm = con.createStatement()) {
            if (cod == 0) {
                sql = "insert into funcionario(";
                sql+="funcionariocodigo,"
                + "funcionarionome, "
                + "funcionariosexo, "
                + "funcionariorg, "
                + "funcionariocpf,"
                + "funcionariodatanascimento,"
                + "funcionarionivel,"
                + "funcionariologin,"
                + "funcionariosenha,"
                + "funcionarioendereco,"
                + "cargocodigo,"
                + "gerenciacodigo) values(";
                sql+= ""+cod+","+
                nome+","+
                sexo+","+
                rg+","+
                dataNasc+","+
                nivel+","+
                login+","+
                senha+","+
                endereço+","+
                cargoCodigo+","+
                gerenciaCodigo+","+
                 ") RETURNING funcionariocodigo";
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
        ArrayList<FuncionarioVO> lista = new ArrayList<>();

        Connection con = new Conexao().getConnection();
        String sql = "select funcionario.funcionariocodigo,"
                + "funcionario.funcionarionome, "
                + "funcionario.funcionariosexo, "
                + "funcionario.funcionariorg, "
                + "funcionario.funcionariocpf,"
                + "funcionario.funcionariodatanascimento,"
                + "funcionario.funcionarionivel,"
                + "funcionario.funcionariologin,"
                + "funcionario.funcionariosenha,"
                + "funcionario.funcionarioendereco,"
                + "cargo.cargocodigo,"
                + "cargo.cargonome,"
                + "cargo.cargosalariobase,"
                + "gerencia.gerenciacodigo,"
                + "gerencia.gerencianome,"
                + "gerencia.gerenciaadicionalsalario"
                + "from funcionario"
                + "inner join cargo on funcionario.cargocodigo = cargo.cargocodigo"
                + "inner join gerencia on funcionario.gerenciacodigo = gerencia.gerenciacodigo"
                + "where funcionarionome LIKE '%'+'" + nome + "'+'%'";
        Statement stm = null;
        ResultSet rs = null;
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                int idFuncionario = rs.getInt(1);
                String nomeFuncionario = rs.getString(2);
                String sexo = rs.getString(3);
                String rg = rs.getString(4);
                String cpf = rs.getString(5);
                String dataNasc = rs.getString(6);
                int nivel = rs.getInt(7);
                String login = rs.getString(8);
                String senha = rs.getString(9);
                String endereço = rs.getString(10);
                int idCargo = rs.getInt(11);
                String nomeCargo = rs.getString(12);
                double salarioCargo = rs.getDouble(13);
                CargoVO cargoVO = new CargoVO(idCargo, nomeCargo, salarioCargo);
                int idGerencia = rs.getInt(14);
                String nomeGerencia = rs.getString(15);
                double salarioGerencia = rs.getDouble(16);
                GerenciaVO gerenciaVO = new GerenciaVO(idGerencia, nomeGerencia, salarioGerencia);
                FuncionarioVO funcionarioVO = new FuncionarioVO(idFuncionario, nomeFuncionario, cpf, cargoVO, gerenciaVO);
                funcionarioVO.setDataNasc(dataNasc);
                funcionarioVO.setRg(rg);
                funcionarioVO.setEndereço(endereço);
                funcionarioVO.setLogin(login);
                funcionarioVO.setSenha(senha);
                funcionarioVO.setSexo(sexo);
                funcionarioVO.setNivel(nivel);
                lista.add(funcionarioVO);
            }
        } catch (SQLException ex) {
            System.out.println("Erro na sql tabela funcionario\nErro:" + ex.getMessage());
            System.out.println("Erro ralação funcionario\nErro:" + ex.getMessage());
        }

        return lista;
    }

    public ArrayList<CargoVO> BuscarComboCargo() {
        ArrayList<CargoVO> lista = new ArrayList<CargoVO>();
        Connection con = new Conexao().getConnection();
        String sql = "select cargocodigo, cargonome from cargo";
        Statement stm = null;
        ResultSet rs = null;
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Erro na sql de cargo\nErro:" + ex.getMessage());
        }
        try {
            while (rs.next()) {

                int id = rs.getInt(1);
                String nomeCargo = rs.getString(2);

                CargoVO cargoVO = new CargoVO(id, nomeCargo, 0.0);
                lista.add(cargoVO);

            }
        } catch (SQLException ex) {
            System.out.println("Erro ao mandar a lista de cargo");
        }
        return lista;
    }

    public ArrayList<GerenciaVO> BuscarComboGerencia() {
        ArrayList<GerenciaVO> lista = new ArrayList<>();
        Connection con = new Conexao().getConnection();
        String sql = "select gerenciacodigo, gerencianome from gerencia";
        Statement stm = null;
        ResultSet rs = null;
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Erro na sql de gerencia\nErro:" + ex.getMessage());
        }
        try {
            while (rs.next()) {
                int id = rs.getInt(1);
                String nomeGerencia = rs.getString(2);
                GerenciaVO gerenciaVO = new GerenciaVO(id, nomeGerencia, 0.0);
                lista.add(gerenciaVO);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao mandar a lista de cargo");
        }
        return lista;
    }

    public FuncionarioRN getFuncionarioRN() {
        return funcionarioRN;
    }

    public void setFuncionarioRN(FuncionarioRN funcionarioRN) {
        this.funcionarioRN = funcionarioRN;
    }

}
