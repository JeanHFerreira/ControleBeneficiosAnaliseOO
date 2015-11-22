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
    private CargoVO cargoVO;
    private GerenciaVO gerenciaVO;
    private String rg;
    private String dataNasc;
    private String sexo;
    private String login;
    private String senha;
    private String endereço;
    private int nivel ;
    
    public FuncionarioVO(int cod, String nome, String cpf) {
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
    }

    public FuncionarioVO(int cod, String nome, String cpf,CargoVO cargoVO, GerenciaVO gerenciaVO) {
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
        this.cargoVO = cargoVO;
        this.gerenciaVO = gerenciaVO;
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

    public CargoVO getCargoVO() {
        return cargoVO;
    }

    public void setCargoVO(CargoVO cargoVO) {
        this.cargoVO = cargoVO;
    }

    public GerenciaVO getGerenciaVO() {
        return this.gerenciaVO;
    }

    public void setGerenciaVO(GerenciaVO gerenciaVO) {
        this.gerenciaVO = gerenciaVO;
    }

    public FuncionarioRN getFuncionarioRN() {
        return funcionarioRN;
    }

    public void setFuncionarioRN(FuncionarioRN funcionarioRN) {
        this.funcionarioRN = funcionarioRN;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
