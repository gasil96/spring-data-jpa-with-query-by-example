package br.com.spring.data.jpa.service;

import br.com.spring.data.jpa.entity.Funcao;
import br.com.spring.data.jpa.entity.Funcionario;

import java.util.Optional;

public interface IFuncaoService {

    void salvar(Funcao funcao);

    void alterar(Funcao funcao) throws Exception;

    Optional<Funcao> buscarPorId(Long id);

    void deletarPorId(Long id);
}
