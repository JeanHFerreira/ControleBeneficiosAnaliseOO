package FuncionarioTeste;

import PERS.FuncionarioPERS;
import RN.FuncionarioRN;
import VO.FuncionarioVO;

/**
 * @author Eric
 * @author Andressa
 * @author Jean_Henrique
 */
public class FuncionarioTeste {
    
    /*
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
    */
    @Test
    public funcionarioTeste1() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }
}
