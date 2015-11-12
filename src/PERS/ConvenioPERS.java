/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import RN.ConvenioRN;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Eric
 */
public class ConvenioPERS {

    private ConvenioRN convenioRN;

    public ConvenioPERS(ConvenioRN convenioRN) {
        this.setConvenioRN(convenioRN);
    }

    public void salvar() {
        int cod = this.getConvenioRN().getConvenioVO().getCod();
        String nome = this.getConvenioRN().getConvenioVO().getNome();
        Double valor = this.getConvenioRN().getConvenioVO().getValor();

        Connection con = new Conexao().getConnection();
        try (Statement stm = con.createStatement()) {
            String sql = "insert into convenio(convenionome, conveniovalor)" + "values('"+nome+"',"+valor+")";
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Erro.");
        }

    }

    public ConvenioRN getConvenioRN() {
        return convenioRN;
    }

    public void setConvenioRN(ConvenioRN convenioRN) {
        this.convenioRN = convenioRN;
    }
}
