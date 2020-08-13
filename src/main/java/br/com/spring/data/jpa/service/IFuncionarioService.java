package br.com.spring.data.jpa.service;

import br.com.spring.data.jpa.entity.Funcionario;

import java.util.List;
import java.util.Optional;

public interface IFuncionarioService {

    void salvar(Funcionario funcionario);

    void alterar(Funcionario funcionario) throws Exception;

    Optional<Funcionario> buscarPorId(Long id);

    void deletarPorId(Long id);

    List<Funcionario> buscarTodos();

    // OUTROS MÉTODOS FORAM OMITIDOS
}
