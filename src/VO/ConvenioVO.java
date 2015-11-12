/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import RN.ConvenioRN;

/**
 *
 * @author Eric
 */
public class ConvenioVO {

    private ConvenioRN convenioRN;
    private int cod;
    private String nome;
    private Double valor;

    ConvenioVO() {

    }

    public ConvenioRN getConvenioRN() {
        return convenioRN;
    }

    public void setConvenioRN(ConvenioRN convenioRN) {
        this.convenioRN = convenioRN;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
