/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import VO.BeneficioVO;

/**
 *
 * @author Eric
 */
public class BeneficioRN {

    private BeneficioVO beneficioVO;

    public BeneficioRN() {
    }

    public BeneficioRN(BeneficioVO beneficioVO) {
        this.setBeneficioVO(beneficioVO);
    }

    public BeneficioVO getBeneficioVO() {
        return beneficioVO;
    }

    public void setBeneficioVO(BeneficioVO beneficioVO) {
        this.beneficioVO = beneficioVO;
    }

}
