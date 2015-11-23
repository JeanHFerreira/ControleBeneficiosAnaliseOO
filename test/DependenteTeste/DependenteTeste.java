package DependenteTeste;

import PERS.DependentePERS;
import RN.DependenteRN;
import VO.DependenteVO;
import VO.FuncionarioVO;

/**
 * @author Eric
 * @author Andressa
 * @author Jean_Henrique
 */
public class DependenteTeste {

    @Test
    public dependenteTeste1() {
        DependenteVO dependenteVO= new DependenteVO();
        DependenteRN dependenteRN = new DependenteRN(dependenteVO);
        DependentePERS dependentePERS = new DependentePERS(dependenteRN);
        
        assertFalse(dependentePERS.salvar());
        assertFalse(dependentePERS.excluir());
    }

    @Test
    public dependenteTeste2() {
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
    public dependenteTeste3() {
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
    public dependenteTeste4() {
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
    public dependenteTeste5() {
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
    public dependenteTeste6() {
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
    public dependenteTeste7() {
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
    public dependenteTeste8() {
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
    public dependenteTeste9() {
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
    public dependenteTeste10() {
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
    public dependenteTeste11() {
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
    public dependenteTeste12() {
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
    public dependenteTeste13() {
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
