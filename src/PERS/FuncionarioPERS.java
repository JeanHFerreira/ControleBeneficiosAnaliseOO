package PERS;

import RN.FuncionarioRN;
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
        String sql = "select funcionariocodigo, funcionarionome, funcionariocpf from funcionario where funcionarionomegerencianome LIKE '%" + nome + "%'";
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

}
