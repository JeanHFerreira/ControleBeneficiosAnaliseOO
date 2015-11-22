package VO;

import RN.FuncionarioRN;

/**
 * @author Jean
 * @author Andressa
 * @author Eric
 */
public class FuncionarioVO {
    private int cod;
    
    private FuncionarioRN funcionarioRN;
    private String nome;
    private String cpf;

    public FuncionarioVO(int cod, String nome, String cpf) {
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
    }

    public FuncionarioVO() {
        this.cod = -1;
        this.nome = null;
        this.cpf = null;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
