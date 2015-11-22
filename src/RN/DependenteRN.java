/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import VO.DependenteVO;

/**
 *
 * @author Eric
 */
public class DependenteRN {
    private DependenteVO dependenteVO;
    
    public DependenteRN(){
        
    }
    public DependenteRN(DependenteVO dependenteVO){
        this.setDependenteVO(dependenteVO);
    }
    
    public DependenteVO getDependenteVO(){
        return dependenteVO;
    }
    
    public void setDependenteVO(DependenteVO dependenteVO){
        this.dependenteVO = dependenteVO;
    }
    
    
}
