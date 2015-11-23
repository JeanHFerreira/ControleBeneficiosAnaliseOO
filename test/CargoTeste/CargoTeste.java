package CargoTeste;

import PERS.CargoPERS;
import RN.CargoRN;
import VO.CargoVO;

/**
 * @author Jean
 * @author Ericson
 * @author Andressa
 */
public class CargoTeste extends TestCase{

    @Test
    public cargoTeste1() {
        CargoVO cargoVO = new CargoVO();
        CargoRN cargoRN = new CargoRN(cargoVO);
        CargoPERS cargoPERS = new CargoPERS(cargoRN);
        
        assertFalse(cargoPERS.salvar());
        assertFalse(cargoPERS.excluir());
    }
    
    @Test
    public cargoTeste2() {
        CargoVO cargoVO = new CargoVO();
        CargoRN cargoRN = new CargoRN(cargoVO);
        CargoPERS cargoPERS = new CargoPERS(cargoRN);
        cargoVO.setSalario_base(-2.0);
        cargoVO.setNome("A");
        cargoVO.setCod(0);
        assertFalse(cargoPERS.salvar());
        assertFalse(cargoPERS.excluir());
    }
    
    @Test
    public cargoTeste3() {
        CargoVO cargoVO = new CargoVO();
        CargoRN cargoRN = new CargoRN(cargoVO);
        CargoPERS cargoPERS = new CargoPERS(cargoRN);
        cargoVO.setSalario_base(0.0);
        cargoVO.setNome("A");
        cargoVO.setCod(0);
        assertFalse(cargoPERS.salvar());
        assertFalse(cargoPERS.excluir());
    }
    
    @Test
    public cargoTeste4() {
        CargoVO cargoVO = new CargoVO();
        CargoRN cargoRN = new CargoRN(cargoVO);
        CargoPERS cargoPERS = new CargoPERS(cargoRN);
        cargoVO.setNome("");
        cargoVO.setSalario_base(2.0);
        cargoVO.setCod(0);
        assertFalse(cargoPERS.salvar());
        assertFalse(cargoPERS.excluir());
    }
    
    @Test
    public cargoTeste5() {
        CargoVO cargoVO = new CargoVO();
        CargoRN cargoRN = new CargoRN(cargoVO);
        CargoPERS cargoPERS = new CargoPERS(cargoRN);
        cargoVO.setNome(null);
        cargoVO.setSalario_base(2.0);
        cargoVO.setCod(0);
        assertFalse(cargoPERS.salvar());
        assertFalse(cargoPERS.excluir());
    }
    
    @Test
    public cargoTeste6() {
        CargoVO cargoVO = new CargoVO();
        CargoRN cargoRN = new CargoRN(cargoVO);
        CargoPERS cargoPERS = new CargoPERS(cargoRN);
        cargoVO.setNome("A");
        cargoVO.setSalario_base(2.0);
        cargoVO.setCod(-1);
        assertFalse(cargoPERS.salvar());
        assertFalse(cargoPERS.excluir());
    }
    
    @Test
    public cargoTeste7() {
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
