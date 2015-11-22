/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import RN.DependenteRN;

/**
 *
 * @author Eric
 */
public class DependenteVO {
    private DependenteRN dependenteRN;
    private int cod;
    private String nome;
    private String sexo;
    private String cpf;
    private int funcionario_codigo;
    
    DependenteVO() {

    }

    public DependenteVO(int cod, String nome, String sexo, String cpf) {
        this.cod = cod;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        
    }


    public DependenteRN getDependenteRN() {
        return dependenteRN;
    }

    public void setDependenteRN(DependenteRN dependenteRN) {
        this.dependenteRN = dependenteRN;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getFuncionario_codigo() {
        return funcionario_codigo;
    }

    public void setFuncionario_codigo(int funcionario_codigo) {
        this.funcionario_codigo = funcionario_codigo;
    }

}
