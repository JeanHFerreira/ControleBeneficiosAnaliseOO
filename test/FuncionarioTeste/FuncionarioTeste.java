package FuncionarioTeste;

import PERS.FuncionarioPERS;
import RN.FuncionarioRN;
import VO.CargoVO;
import VO.FuncionarioVO;
import VO.GerenciaVO;
import junit.framework.*;
/**
 * @author Eric
 * @author Andressa
 * @author Jean_Henrique
 */
public class FuncionarioTeste extends TestCase {

    @Test
    public void funcionarioTeste1() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);

        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste2() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(1);
        assertTrue(funcionarioPERS.salvar());
        assertTrue(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste3() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(-1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste4() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.85");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste5() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf(null);
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste6() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(-1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste7() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(null);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste8() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(-1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste9() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(null);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste10() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg(null);
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste11() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc(null);
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste12() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("R");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste13() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo(null);
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste14() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin(null);
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste15() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha(null);
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

    @Test
    public void funcionarioTeste16() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço(null);
        funcionarioVO.setNivel(1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }
    
    @Test
    public void funcionarioTeste17() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(0);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }
    
    @Test
    public void funcionarioTeste18() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(-1);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }
    
    @Test
    public void funcionarioTeste19() {
        FuncionarioVO funcionarioVO = new FuncionarioVO();
        FuncionarioRN funcionarioRN = new FuncionarioRN(funcionarioVO);
        FuncionarioPERS funcionarioPERS = new FuncionarioPERS(funcionarioRN);
        funcionarioVO.setCod(1);
        funcionarioVO.setCpf("700.774.223.84");
        CargoVO cargoVO = new CargoVO();
        cargoVO.setCod(1);
        funcionarioVO.setCargoVO(cargoVO);
        GerenciaVO gerenciaVO = new GerenciaVO();
        gerenciaVO.setCod(1);
        funcionarioVO.setGerenciaVO(gerenciaVO);
        funcionarioVO.setRg("2150144275");
        funcionarioVO.setDataNasc("10/10/2015");
        funcionarioVO.setSexo("M");
        funcionarioVO.setLogin("Teste");
        funcionarioVO.setSenha("123456");
        funcionarioVO.setEndereço("Rua 123, Nova Russia");
        funcionarioVO.setNivel(5);
        assertFalse(funcionarioPERS.salvar());
        assertFalse(funcionarioPERS.excluir());
    }

}
