/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import RN.GerenciaRN;
import VO.GerenciaVO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eric
 */
public class GerenciaPERS {

    private GerenciaRN gerenciaRN;

    public GerenciaPERS(GerenciaRN gerenciaRN) {
    }

    public void salvar(GerenciaVO gerenciaVO) {
        int cod = this.getGerenciaRN().getGerenciaVO().getCod();
        String nome = this.getGerenciaRN().getGerenciaVO().getNome();
        double salario = this.getGerenciaRN().getGerenciaVO().getSalario();
        
        
        Connection con = new Conexao().getConnection();
        try (Statement stm = con.createStatement()) {
            String sql = "insert into gerencia(gerencianome, gerenciaadicionalsalario)" + "values('"+nome+"',"+salario+")";
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Erro.");
        }
    }

    public GerenciaRN getGerenciaRN() {
        return gerenciaRN;
    }

    public void setGerenciaRN(GerenciaRN gerenciaRN) {
        this.gerenciaRN = gerenciaRN;
    }

    public void salvar() {

    }

}
