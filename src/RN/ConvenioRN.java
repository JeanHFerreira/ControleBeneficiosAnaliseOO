/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import VO.ConvenioVO;

/**
 *
 * @author Eric
 */
public class ConvenioRN {

    private ConvenioVO convenioVO;

    public ConvenioRN() {
    }

    public ConvenioRN(ConvenioVO convenioVO) {
        this.setConvenioVO(convenioVO);
    }

    public ConvenioVO getConvenioVO() {
        return convenioVO;
    }

    public void setConvenioVO(ConvenioVO convenioVO) {
        this.convenioVO = convenioVO;
    }
}
