package DependenteTeste;

import PERS.DependentePERS;
import RN.DependenteRN;
import VO.DependenteVO;
import VO.FuncionarioVO;
import junit.framework.*;
/**
 * @author Eric
 * @author Andressa
 * @author Jean_Henrique
 */
public class DependenteTeste extends TestCase{

    @Test
    public void dependenteTeste1() {
        DependenteVO dependenteVO= new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        
        assertFalse(dependentePERS.salvar());
        assertFalse(dependentePERS.excluir());
    }

    @Test
    public void dependenteTeste2() {
        DependenteVO dependenteVO= new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        dependenteVO.setCod(1);
        dependenteVO.setNome("A");
        dependenteVO.setSexo("M");
        dependenteVO.setCpf("700.774.223.84");
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        funcionarioVO.setCod(1);
        dependenteVO.setFuncionarioVO(funcionarioVO);
        assertTrue(dependentePERS.salvar());
        assertTrue(dependentePERS.excluir());
    }

    @Test
    public void dependenteTeste3() {
        DependenteVO dependenteVO= new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        dependenteVO.setCod(-1);
        dependenteVO.setNome("A");
        dependenteVO.setSexo("M");
        dependenteVO.setCpf("700.774.223.84");
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        funcionarioVO.setCod(1);
        dependenteVO.setFuncionarioVO(funcionarioVO);
        assertFalse(dependentePERS.salvar());
        assertFalse(dependentePERS.excluir());
    }

    @Test
    public void dependenteTeste4() {
        DependenteVO dependenteVO= new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        dependenteVO.setCod(1);
        dependenteVO.setNome("");
        dependenteVO.setSexo("M");
        dependenteVO.setCpf("700.774.223.84");
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        funcionarioVO.setCod(1);
        dependenteVO.setFuncionarioVO(funcionarioVO);
        assertFalse(dependentePERS.salvar());
        assertFalse(dependentePERS.excluir());
    }

    @Test
    public void dependenteTeste5() {
        DependenteVO dependenteVO= new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        dependenteVO.setCod(1);
        dependenteVO.setNome(null);
        dependenteVO.setSexo("M");
        dependenteVO.setCpf("700.774.223.84");
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        funcionarioVO.setCod(1);
        dependenteVO.setFuncionarioVO(funcionarioVO);
        assertFalse(dependentePERS.salvar());
        assertFalse(dependentePERS.excluir());
    }

    @Test
    public void dependenteTeste6() {
        DependenteVO dependenteVO= new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        dependenteVO.setCod(1);
        dependenteVO.setNome("A");
        dependenteVO.setSexo("");
        dependenteVO.setCpf("700.774.223.84");
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        funcionarioVO.setCod(1);
        dependenteVO.setFuncionarioVO(funcionarioVO);
        assertFalse(dependentePERS.salvar());
        assertFalse(dependentePERS.excluir());
    }

    @Test
    public void dependenteTeste7() {
        DependenteVO dependenteVO= new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        dependenteVO.setCod(1);
        dependenteVO.setNome("A");
        dependenteVO.setSexo(null);
        dependenteVO.setCpf("700.774.223.84");
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        funcionarioVO.setCod(1);
        dependenteVO.setFuncionarioVO(funcionarioVO);
        assertFalse(dependentePERS.salvar());
        assertFalse(dependentePERS.excluir());
    }

    @Test
    public void dependenteTeste8() {
        DependenteVO dependenteVO= new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        dependenteVO.setCod(1);
        dependenteVO.setNome("A");
        dependenteVO.setSexo("K");
        dependenteVO.setCpf("700.774.223.84");
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        funcionarioVO.setCod(1);
        dependenteVO.setFuncionarioVO(funcionarioVO);
        assertFalse(dependentePERS.salvar());
        assertFalse(dependentePERS.excluir());
    }

    @Test
    public void dependenteTeste9() {
        DependenteVO dependenteVO= new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        dependenteVO.setCod(1);
        dependenteVO.setNome("A");
        dependenteVO.setSexo("M");
        dependenteVO.setCpf("700.774.223.85");
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        funcionarioVO.setCod(1);
        dependenteVO.setFuncionarioVO(funcionarioVO);
        assertFalse(dependentePERS.salvar());
        assertFalse(dependentePERS.excluir());
    }
    
    @Test
    public void dependenteTeste10() {
        DependenteVO dependenteVO= new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        dependenteVO.setCod(1);
        dependenteVO.setNome("A");
        dependenteVO.setSexo("M");
        dependenteVO.setCpf(null);
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        funcionarioVO.setCod(1);
        dependenteVO.setFuncionarioVO(funcionarioVO);
        assertFalse(dependentePERS.salvar());
        assertFalse(dependentePERS.excluir());
    }
    
    @Test
    public void dependenteTeste11() {
        DependenteVO dependenteVO= new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        dependenteVO.setCod(1);
        dependenteVO.setNome("A");
        dependenteVO.setSexo("M");
        dependenteVO.setCpf("700.774.223.85");
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        funcionarioVO.setCod(1);
        dependenteVO.setFuncionarioVO(null);
        assertFalse(dependentePERS.salvar());
        assertFalse(dependentePERS.excluir());
    }
    
    @Test
    public void dependenteTeste12() {
        DependenteVO dependenteVO= new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        dependenteVO.setCod(1);
        dependenteVO.setNome("A");
        dependenteVO.setSexo("M");
        dependenteVO.setCpf("700.774.223.85");
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        funcionarioVO.setCod(-1);
        dependenteVO.setFuncionarioVO(funcionarioVO);
        assertFalse(dependentePERS.salvar());
        assertFalse(dependentePERS.excluir());
    }
    
    @Test
    public void dependenteTeste13() {
        DependenteVO dependenteVO= new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        dependenteVO.setCod(1);
        dependenteVO.setNome("A");
        dependenteVO.setSexo("M");
        dependenteVO.setCpf("700.774.223.85");
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        
        dependenteVO.setFuncionarioVO(funcionarioVO);
        assertFalse(dependentePERS.salvar());
        assertFalse(dependentePERS.excluir());
    }

}
