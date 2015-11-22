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
    private int cod_gerencia;
    private Double salario_base;

    CargoVO() {

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

    public int getCod_gerencia() {
        return cod_gerencia;
    }

    public void setCod_gerencia(int cod_gerencia) {
        this.cod_gerencia = cod_gerencia;
    }

    public Double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(Double salario_base) {
        this.salario_base = salario_base;
    }

}
