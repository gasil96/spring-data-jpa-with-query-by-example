package br.com.spring.data.jpa.service;

import br.com.spring.data.jpa.entity.Funcionario;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IFuncionarioService {

    void salvar(Funcionario funcionario);

    void alterar(Funcionario funcionario) throws Exception;

    Optional<Funcionario> buscarPorId(Long id);

    void deletarPorId(Long id);

    List<Funcionario> buscarTodos();

    List<Funcionario> buscarPorIdenFiscalAutomatica(String idFiscal);

    List<Funcionario> buscarPorIdenFiscalManual(String idFiscal);

    List<Funcionario> buscarPorIdenFiscalNativa(String idFiscal);

    List<Funcionario> buscarPorLikeNomeCompleto(String nomeCompleto);

    List<Funcionario> buscarPorPeriodo(LocalDate dataInicioStart, LocalDate dataInicoEnd);

    List<Funcionario> buscarFuncionarioPorFiltro(Funcionario example);

    Optional<Funcionario> buscarFuncionarioPorFiltroIgnore(Funcionario exampleMatcher);

}
