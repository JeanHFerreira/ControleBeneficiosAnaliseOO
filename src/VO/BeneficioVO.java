/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import RN.BeneficioRN;

/**
 *
 * @author Eric
 */
public class BeneficioVO {

    private BeneficioRN beneficioRN;
    private int cod;
    private String nome;
    private double percentual;

    BeneficioVO() {

    }

    public BeneficioRN getBeneficioRN() {
        return beneficioRN;
    }

    public void setBeneficioRN(BeneficioRN beneficioRN) {
        this.beneficioRN = beneficioRN;
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

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double salario) {
        this.percentual = salario;
    }

}
