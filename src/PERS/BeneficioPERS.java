/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import RN.BeneficioRN;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Eric
 */
public class BeneficioPERS {

    private BeneficioRN beneficioRN;

    public BeneficioPERS(BeneficioRN beneficioRN) {
        this.setBeneficioRN(beneficioRN);
    }

    public void salvar() {
        int cod = this.getBeneficioRN().getBeneficioVO().getCod();
        String nome = this.getBeneficioRN().getBeneficioVO().getNome();
        Double percentual = this.getBeneficioRN().getBeneficioVO().getPercentual();

        Connection con = new Conexao().getConnection();
        try (Statement stm = con.createStatement()) {
            String sql = "insert into beneficio(beneficionome, beneficiopercentual)" + "values('"+nome+"',"+percentual+")";
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Erro.");
        }

    }

    public BeneficioRN getBeneficioRN() {
        return beneficioRN;
    }

    public void setBeneficioRN(BeneficioRN beneficioRN) {
        this.beneficioRN = beneficioRN;
    }

}
