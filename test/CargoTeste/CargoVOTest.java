package CargoTeste;

import RN.CargoRN;
import VO.CargoVO;
import junit.framework.TestCase;

/**
 * @author Jean
 * @author Ericson
 * @author Andressa
 */

public class CargoVOTest extends TestCase {

    public CargoVOTest(String testName) {
        super(testName);
    }

    public void testGetCargoRN() {
        System.out.println("getCargoRN");
        CargoVO instance = new CargoVO();
        CargoRN expResult = null;
        CargoRN result = instance.getCargoRN();
        assertEquals(expResult, result);
    }

    public void testSetCargoRN() {
        System.out.println("setCargoRN");
        CargoRN cargoRN = new CargoRN();
        CargoVO instance = new CargoVO();
        instance.setCargoRN(cargoRN);
        assertEquals(instance.getCargoRN(), cargoRN);
    }

    public void testGetCod() {
        System.out.println("getCod");
        CargoVO instance = new CargoVO();
        int expResult = -1;
        int result = instance.getCod();
        assertEquals(expResult, result);
    }

    public void testSetCod() {
        System.out.println("setCod");
        int cod = 0;
        CargoVO instance = new CargoVO();
        instance.setCod(cod);
        assertEquals(cod, instance.getCod());
    }

    public void testGetNome() {
        System.out.println("getNome");
        CargoVO instance = new CargoVO();
        instance.setNome("A");
        String expResult = "";
        String result = instance.getNome();
        assertEquals("A", result);
    }

    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        CargoVO instance = new CargoVO();
        instance.setNome(nome);
        assertEquals(instance.getNome(), nome);
    }

    public void testGetSalario_base() {
        System.out.println("getSalario_base");
        CargoVO instance = new CargoVO();
        Double expResult = 1.0;
        instance.setSalario_base(expResult);
        Double result = instance.getSalario_base();
        assertEquals(expResult, result);
    }

    public void testSetSalario_base() {
        System.out.println("setSalario_base");
        Double salario_base = 1.0;
        CargoVO instance = new CargoVO();
        instance.setSalario_base(salario_base);
        assertEquals(1.0, instance.getSalario_base());
    }

}
