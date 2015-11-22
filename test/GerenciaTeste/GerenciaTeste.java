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

    public void gerenciaTeste() {
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        
        assertFalse(gerenciaPERS.excluir());
        assertFalse(gerenciaPERS.salvar());
    }

    @Test
    public void gerenciaTeste1(){
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        
         gerenciaVO.setSalario(-2.0);
        assertFalse(gerenciaPERS.excluir());
        assertFalse(gerenciaPERS.salvar());
    }
    
    @Test
    public void gerenciaTeste2(){
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        
         gerenciaVO.setSalario(-2.0);
        assertFalse(gerenciaPERS.excluir());
        assertFalse(gerenciaPERS.salvar());
    }
    
    @Test
    public void gerenciaTeste3(){
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        
        gerenciaVO.setSalario(0.0);
        assertFalse(gerenciaPERS.excluir());
        assertFalse(gerenciaPERS.salvar());
    }
    
    @Test
    public void gerenciaTeste4(){
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        
        gerenciaVO.setNome(null);
        assertFalse(gerenciaPERS.excluir());
        assertFalse(gerenciaPERS.salvar());
    }
    
    @Test
    public void gerenciaTeste5(){
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        
        gerenciaVO.setNome("");
        assertFalse(gerenciaPERS.excluir());
        assertFalse(gerenciaPERS.salvar());
    }
    
    @Test
    public void gerenciaTeste6(){
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        
        gerenciaVO.setNome("       ");
        assertFalse(gerenciaPERS.excluir());
        assertFalse(gerenciaPERS.salvar());
    }
    
    @Test
    public void gerenciaTeste7(){
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);
        
        gerenciaVO.setNome("NOME");
        assertFalse(gerenciaPERS.excluir());
        assertFalse(gerenciaPERS.salvar());
    }

}