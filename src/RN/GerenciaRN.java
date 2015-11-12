/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.GerenciaPERS;
import VO.GerenciaVO;

/**
 *
 * @author Eric
 */
public class GerenciaRN {
    private GerenciaVO gerenciaVO;
    
    public GerenciaRN(){
    }

    public GerenciaRN(GerenciaVO gerenciaVO) {
        this.setGerenciaVO(gerenciaVO);
    }

    public GerenciaVO getGerenciaVO() {
        return gerenciaVO;
    }

    public void setGerenciaVO(GerenciaVO gerenciaVO) {
        this.gerenciaVO = gerenciaVO;
    }
    
}
