package br.com.spring.data.jpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import br.com.spring.data.jpa.Application;
import br.com.spring.data.jpa.entity.Funcionario;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest(classes = Application.class)
public class FuncionarioServiceTest {

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


}
