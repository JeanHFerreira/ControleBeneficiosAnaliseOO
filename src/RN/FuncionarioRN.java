package RN;

import VO.FuncionarioVO;

/**
 *
 * @author Jean_H_xD, EricPinheiro, Andressa
 */
public class FuncionarioRN {
    
    private FuncionarioVO funcionarioVO;

    public FuncionarioRN(FuncionarioVO funcionarioVO) {
        this.funcionarioVO = funcionarioVO;
    }
    
    public FuncionarioVO getFuncionarioVO(){
        return funcionarioVO;
    }
    
    public void setFuncionarioVO(FuncionarioVO funcionarioVO){
        this.funcionarioVO=funcionarioVO;
    }

    public boolean validarCpf(String cpf) {
       return false;
    }
}