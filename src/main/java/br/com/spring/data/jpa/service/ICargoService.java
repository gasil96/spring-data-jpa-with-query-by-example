package br.com.spring.data.jpa.service;

import br.com.spring.data.jpa.entity.Cargo;

import java.util.Optional;

public interface ICargoService {

    void salvar(Cargo cargo);

    void alterar(Cargo cargo) throws Exception;

    Optional<Cargo> buscarPorId(Long id);

    void deletarPorId(Long id);

}
