package GerenciaTeste;

import PERS.GerenciaPERS;
import RN.GerenciaRN;
import VO.GerenciaVO;

/**
 * @author Eric
 * @authorAndressa
 * @author Jean_Henrique
 */
public class GerenciaTeste {
    
    @Test
    public void gerenciaTeste() {
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        
        assertFalse(gerenciaPERS.salvar());
        assertFalse(gerenciaPERS.excluir());
    }
    
    @Test
    public void gerenciaTeste1() {
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        gerenciaVO.setCod(0);
        gerenciaVO.setNome("A");
        gerenciaVO.setSalario(-2.0);
        assertFalse(gerenciaPERS.salvar());
        assertFalse(gerenciaPERS.excluir());
    }
    
    @Test
    public void gerenciaTeste2() {
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        gerenciaVO.setCod(0);
        gerenciaVO.setNome("A");
        gerenciaVO.setSalario(0.0);
        assertFalse(gerenciaPERS.salvar());
        assertFalse(gerenciaPERS.excluir());
    }
    
    @Test
    public void gerenciaTeste3() {
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        gerenciaVO.setCod(-1);
        gerenciaVO.setNome("A");
        gerenciaVO.setSalario(1.0);
        assertFalse(gerenciaPERS.salvar());
        assertFalse(gerenciaPERS.excluir());
    }
    
    @Test
    public void gerenciaTeste4() {
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        gerenciaVO.setCod(0);
        gerenciaVO.setSalario(1.0);
        gerenciaVO.setNome(null);
        assertFalse(gerenciaPERS.salvar());
        assertFalse(gerenciaPERS.excluir());
    }
    
    @Test
    public void gerenciaTeste5() {
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        gerenciaVO.setCod(0);
        gerenciaVO.setSalario(1.0);
        gerenciaVO.setNome("");
        assertFalse(gerenciaPERS.salvar());
        assertFalse(gerenciaPERS.excluir());
    }
    
    @Test
    public void gerenciaTeste6() {
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        
        gerenciaVO.setNome("       ");
        assertFalse(gerenciaPERS.excluir());
        assertFalse(gerenciaPERS.salvar());
    }
    
    @Test
    public void gerenciaTeste7() {
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        gerenciaVO.setCod(1);
        gerenciaVO.setSalario(1.0);
        gerenciaVO.setNome("A");
        assertTrue(gerenciaPERS.salvar());
        assertTrue(gerenciaPERS.excluir());
    }
    
}
