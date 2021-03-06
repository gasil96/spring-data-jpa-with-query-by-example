package br.com.spring.data.jpa.service;

import br.com.spring.data.jpa.Application;
import br.com.spring.data.jpa.entity.Funcionario;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Application.class)
@EnableJpaRepositories
public class FuncionarioServiceTest {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Autowired
    FuncionarioService funcionarioService;

    @Test
    public void testbuscarPorIdenFiscalAutomatica() {
        String nomeQueDeveSerRetornado = "Gabriel da Silva da Silva";
        assertEquals(nomeQueDeveSerRetornado, funcionarioService.buscarPorIdenFiscalAutomatica("83464308090")
                .get(0).getNomeCompleto());
    }

    @Test
    public void testbuscarPorIdenFiscalManual() {
        String nomeQueDeveSerRetornado = "Gabriel da Silva da Silva";
        assertEquals(nomeQueDeveSerRetornado, funcionarioService.buscarPorIdenFiscalManual("83464308090")
                .get(0).getNomeCompleto());
    }

    @Test
    public void testbuscarPorIdenFiscalNativa() {
        String nomeQueDeveSerRetornado = "Gabriel da Silva da Silva";
        assertEquals(nomeQueDeveSerRetornado, funcionarioService.buscarPorIdenFiscalNativa("83464308090")
                .get(0).getNomeCompleto());
    }

    @Test
    public void testbuscarPorLikeNomeCompleto() {
        String likeValue = "souza";
        assertEquals(2, funcionarioService.buscarPorLikeNomeCompleto(likeValue).size());
    }

    @Test
    public void testbuscarPorPeriodoManual(){
        LocalDate dataInicioStart = LocalDate.parse("2015-01-01",formatter);
        LocalDate dataInicioEnd = LocalDate.parse("2015-12-31",formatter);
        assertEquals(3, funcionarioService.buscarPorPeriodoManual(dataInicioStart, dataInicioEnd).size());
    }

    @Test
    public void testbuscarPorPeriodoAutomatico(){
        LocalDate dataInicioStart = LocalDate.parse("2015-01-01",formatter);
        LocalDate dataInicioEnd = LocalDate.parse("2015-12-31",formatter);
        assertEquals(3, funcionarioService.buscarPorPeriodoAutomatico(dataInicioStart, dataInicioEnd).size());
    }

    @Test
    public void testbuscarFuncionarioPorFiltro(){
        Funcionario filtro = new Funcionario();
        filtro.setIpOperador("10.1.6.199");
        filtro.setDataNascimento(LocalDate.parse("1996-11-11", formatter));
        assertEquals(2, funcionarioService.buscarFuncionarioPorFiltro(filtro).size());
    }

    @Test
    public void testbuscarFuncionarioPorFiltroIgnore(){
        String nomeQueDeveRetornar = "Gabriel da Silva da Silva";
        Funcionario filtro = new Funcionario();
        filtro.setNomeCompleto("GABRIEL da SILVA da Silva");
        assertEquals(nomeQueDeveRetornar, funcionarioService.buscarFuncionarioPorFiltroIgnore(filtro)
                .get().getNomeCompleto());
    }

}
