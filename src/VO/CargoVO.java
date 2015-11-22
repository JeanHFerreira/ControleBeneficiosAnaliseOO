/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import RN.CargoRN;

/**
 *
 * @author Eric
 */
public class CargoVO {

    private CargoRN cargoRN;
    private int cod;
    private String nome;
    private double salario_base;

    CargoVO() {
        this.cargoRN = null;
        this.cod = 0;
        this.nome = null;
        this.salario_base = -1.0;
    }

    public CargoVO(int cod, String nome, double salario) {
        this.cod = cod;
        this.nome = nome;
        this.salario_base = salario;
    }

    public CargoRN getCargoRN() {
        return cargoRN;
    }

    public void setCargoRN(CargoRN cargoRN) {
        this.cargoRN = cargoRN;

    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(Double salario_base) {
        this.salario_base = salario_base;
    }

}
