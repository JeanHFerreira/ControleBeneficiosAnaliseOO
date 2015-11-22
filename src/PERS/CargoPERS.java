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

    public boolean excluir() {
        int cod = this.getCargoRN().getCargoVO().getCod();
        String nome = this.getCargoRN().getCargoVO().getNome().trim();
        Double salario = this.getCargoRN().getCargoVO().getSalario_base();
        if (cod <= -1 || nome == null || nome.equals("") || salario <= 0.0) {
            return false;
        }
        String sql;
        Connection con = new Conexao().getConnection();
        try (Statement stm = con.createStatement()) {
            if (cod != 0) {
                sql = "delete from cargo where cargocodigo = " + cod + "";
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
        int cod = this.getCargoRN().getCargoVO().getCod();
        String nome = this.getCargoRN().getCargoVO().getNome();
        double salario = this.getCargoRN().getCargoVO().getSalario_base();
        int cod_gerencia = this.getCargoRN().getCargoVO().getCod_gerencia();
        //Validação
        if (cod == -1 || nome == null || nome.trim().equals("") || salario <= 0.0) {
            return false;
        }

        String sql;
        Connection con = new Conexao().getConnection();
        try (Statement stm = con.createStatement()) {
            if (cod == 0) {
                sql = "insert into cargo(cargonome, cargosalariobase)" + "values('" + nome + "'," + salario + ") RETURNING cargocodigo";
                ResultSet rs = stm.executeQuery(sql);
                rs.next();
                int resultado = rs.getInt(1);
                this.getCargoRN().getCargoVO().setCod(resultado);
            } else {
                sql = "update cargo set cargonome = '" + nome + "', cargosalariobase = " + salario + " where cargocodigo = " + cod + "";
                stm.executeUpdate(sql);

            }
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro.");
        }
        return false;
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
