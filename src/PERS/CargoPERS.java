/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import RN.CargoRN;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Eric
 */
public class CargoPERS {
    
    private CargoRN cargoRN;
    
    public CargoPERS(CargoRN cargoRN){
        this.setCargoRN(cargoRN);
    }
    
    public void salvar(){
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

    public CargoRN getCargoRN() {
        return cargoRN;
    }

    public void setCargoRN(CargoRN cargoRN) {
        this.cargoRN = cargoRN;
    }
    

    
    
    
}
