/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import VO.CargoVO;

/**
 *
 * @author Eric
 */
public class CargoRN {
    
    private CargoVO cargoVO;
    
    public CargoRN(){
        
    }
    
    public CargoRN(CargoVO cargoVO){
        this.setCargoVO(cargoVO);
    }
    
    public CargoVO getCargoVO(){
        return cargoVO;
    }
    
    public void setCargoVO(CargoVO cargoVO){
        this.cargoVO = cargoVO;
    }
    
}
