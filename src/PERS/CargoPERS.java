/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import RN.CargoRN;
import VO.CargoVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eric
 */
public class CargoPERS {

    private CargoRN cargoRN;

    public CargoPERS(CargoRN cargoRN) {
        this.setCargoRN(cargoRN);
    }

    public void salvar() {
        int cod = this.getCargoRN().getCargoVO().getCod();
        String nome = this.getCargoRN().getCargoVO().getNome();
        int cod_gerencia = this.getCargoRN().getCargoVO().getCod_gerencia();
        Double salario_base = this.getCargoRN().getCargoVO().getSalario_base();

        Connection con = new Conexao().getConnection();
        try (Statement stm = con.createStatement()) {
            String sql = ""; //Antes de criar a SQL, verificar como será inserido o codigo da gerencia
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Erro.");
        }

    }

    public ArrayList<CargoVO> carregarTabela(String nome) {
        ArrayList<CargoVO> lista = new ArrayList<CargoVO>();

        Connection con = new Conexao().getConnection();
        String sql = "select cargocodigo, cargonome, cargosalariobase from cargo where cargonome LIKE '%" + nome + "%'";
        Statement stm = null;
        try {
            stm = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(CargoPERS.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
        try {
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CargoPERS.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while (rs.next()) {

                int id = rs.getInt(1);
                String nomeCargo = rs.getString(2);
                double salarioBase = rs.getDouble(3);

                CargoVO cargoVO = new CargoVO(id, nomeCargo, salarioBase);
                lista.add(cargoVO);

            }
        } catch (SQLException ex) {
            Logger.getLogger(CargoPERS.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public CargoRN getCargoRN() {
        return cargoRN;
    }

    public void setCargoRN(CargoRN cargoRN) {
        this.cargoRN = cargoRN;
    }

}
