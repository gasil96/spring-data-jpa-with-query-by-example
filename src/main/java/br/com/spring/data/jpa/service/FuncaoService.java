package br.com.spring.data.jpa.service;

import br.com.spring.data.jpa.entity.Funcao;
import br.com.spring.data.jpa.repository.FuncaoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.logging.Logger;

public class FuncaoService implements IFuncaoService {

    @Autowired
    private FuncaoRepository funcaoRepository;

    @Override
    public void salvar(Funcao funcao) {
        funcaoRepository.save(funcao);
    }

    @Override
    public void alterar(Funcao funcao) throws Exception {
        if (funcaoRepository.existsById(funcao.getId())) {
            funcaoRepository.save(funcao);
            return;
        }
        throw new Exception("Não foi possivel localizar nenhuma função de id: " +
                funcao.getId() + " para ser atualizada");
    }

    @Override
    public Optional<Funcao> buscarPorId(Long id) {
        return funcaoRepository.findById(id);
    }

    @Override
    public void deletarPorId(Long id) {
        funcaoRepository.deleteById(id);
    }
}
