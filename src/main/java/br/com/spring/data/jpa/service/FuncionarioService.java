package br.com.spring.data.jpa.service;

import br.com.spring.data.jpa.entity.Funcionario;
import br.com.spring.data.jpa.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class FuncionarioService implements IFuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public void salvar(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

    @Override
    public void alterar(Funcionario funcionario) throws Exception {
        if (funcionarioRepository.existsById(funcionario.getId())) {
            funcionarioRepository.save(funcionario);
            return;
        }
        throw new Exception("Não foi possível localizar nenhum funcionário de ID: " +
                funcionario.getId() + "para ser atualizado");
    }

    @Override
    public Optional<Funcionario> buscarPorId(Long id) {
        return funcionarioRepository.findById(id);
    }

    @Override
    public void deletarPorId(Long id) {
        funcionarioRepository.deleteById(id);
    }

    @Override
    public List<Funcionario> buscarTodos() {
        return funcionarioRepository.findAll();
    }
}
