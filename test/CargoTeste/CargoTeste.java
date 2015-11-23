package CargoTeste;

import PERS.CargoPERS;
import RN.CargoRN;
import VO.CargoVO;
import junit.framework.*;
/**
 * @author Jean
 * @author Ericson
 * @author Andressa
 */
public class CargoTeste extends TestCase {
    
    public CargoTeste(String testName) {
        super(testName);
    
    }
    //@Test
    public void cargoTeste1() {
        CargoVO cargoVO = new CargoVO();
        CargoRN cargoRN = new CargoRN(cargoVO);
        CargoPERS cargoPERS = new CargoPERS(cargoRN);
        
        assertFalse(cargoPERS.salvar());
        assertFalse(cargoPERS.excluir());
    }
    
    //@Test
    public void cargoTeste2() {
        CargoVO cargoVO = new CargoVO();
        CargoRN cargoRN = new CargoRN(cargoVO);
        CargoPERS cargoPERS = new CargoPERS(cargoRN);
        cargoVO.setSalario_base(-2.0);
        cargoVO.setNome("A");
        cargoVO.setCod(0);
        assertFalse(cargoPERS.salvar());
        assertFalse(cargoPERS.excluir());
    }
    
    //@Test
    public void cargoTeste3() {
        CargoVO cargoVO = new CargoVO();
        CargoRN cargoRN = new CargoRN(cargoVO);
        CargoPERS cargoPERS = new CargoPERS(cargoRN);
        cargoVO.setSalario_base(0.0);
        cargoVO.setNome("A");
        cargoVO.setCod(0);
        assertFalse(cargoPERS.salvar());
        assertFalse(cargoPERS.excluir());
    }
    
    //@Test
    public void cargoTeste4() {
        CargoVO cargoVO = new CargoVO();
        CargoRN cargoRN = new CargoRN(cargoVO);
        CargoPERS cargoPERS = new CargoPERS(cargoRN);
        cargoVO.setNome("");
        cargoVO.setSalario_base(2.0);
        cargoVO.setCod(0);
        assertFalse(cargoPERS.salvar());
        assertFalse(cargoPERS.excluir());
    }
    
    //@Test
    public void cargoTeste5() {
        CargoVO cargoVO = new CargoVO();
        CargoRN cargoRN = new CargoRN(cargoVO);
        CargoPERS cargoPERS = new CargoPERS(cargoRN);
        cargoVO.setNome(null);
        cargoVO.setSalario_base(2.0);
        cargoVO.setCod(0);
        assertFalse(cargoPERS.salvar());
        assertFalse(cargoPERS.excluir());
    }
    
    //@Test
    public void cargoTeste6() {
        CargoVO cargoVO = new CargoVO();
        CargoRN cargoRN = new CargoRN(cargoVO);
        CargoPERS cargoPERS = new CargoPERS(cargoRN);
        cargoVO.setNome("A");
        cargoVO.setSalario_base(2.0);
        cargoVO.setCod(-1);
        assertFalse(cargoPERS.salvar());
        assertFalse(cargoPERS.excluir());
    }
    
    //@Test
    public void cargoTeste7() {
        CargoVO cargoVO = new CargoVO();
        CargoRN cargoRN = new CargoRN(cargoVO);
        CargoPERS cargoPERS = new CargoPERS(cargoRN);
        cargoVO.setNome("A");
        cargoVO.setSalario_base(2.0);
        cargoVO.setCod(1);
        assertTrue(cargoPERS.salvar());
        assertTrue(cargoPERS.excluir());
    }
   
    
}
