package GerenciaTeste;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import junit.framework.TestCase;

/**
 *
 * @author Eric
 */
public class GerenciaVOTest extends TestCase {
    
    public GerenciaVOTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetCod() {
        System.out.println("getCod");
        GerenciaVO instance = new GerenciaVO();
        int expResult = 0;
        int result = instance.getCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testSetCod() {
        System.out.println("setCod");
        int cod = 0;
        GerenciaVO instance = new GerenciaVO();
        instance.setCod(cod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testGetNome() {
        System.out.println("getNome");
        GerenciaVO instance = new GerenciaVO();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        GerenciaVO instance = new GerenciaVO();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testGetSalario() {
        System.out.println("getSalario");
        GerenciaVO instance = new GerenciaVO();
        double expResult = 0.0;
        double result = instance.getSalario();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testSetSalario() {
        System.out.println("setSalario");
        double salario = 0.0;
        GerenciaVO instance = new GerenciaVO();
        instance.setSalario(salario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
