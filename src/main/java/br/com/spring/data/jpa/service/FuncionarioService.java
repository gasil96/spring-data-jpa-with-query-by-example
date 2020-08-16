package br.com.spring.data.jpa.service;

import br.com.spring.data.jpa.entity.Funcionario;
import br.com.spring.data.jpa.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService implements IFuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

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
        throw new Exception("Não foi possível localizar nenhtum funcionário de ID: " +
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

    //----------------------------BUSCAR POR ID FISCAL IMPL------------------------------------------------
    @Override
    public List<Funcionario> buscarPorIdenFiscalAutomatica(String idFiscal) {
        return funcionarioRepository.findByidentificacaoFiscal(idFiscal);
    }

    @Override
    public List<Funcionario> buscarTodos() {
        return funcionarioRepository.findAll();
    }

    @Override
    public List<Funcionario> buscarPorIdenFiscalManual(String idFiscal) {
        return funcionarioRepository.buscarPorIdFiscalFormaManual(idFiscal);
    }

    @Override
    public List<Funcionario> buscarPorIdenFiscalNativa(String idFiscal) {
        return funcionarioRepository.buscarPorIdFiscalFormaNativa(idFiscal);
    }

    //----------------------------BUSCAR NOME COMPLETO CONTAINING------------------------------------------------
    @Override
    public List<Funcionario> buscarPorLikeNomeCompleto(String nomeCompleto) {
        return funcionarioRepository.findByNomeCompletoIgnoreCaseContaining(nomeCompleto);
    }

    //----------------------------BUSCAR PERÍODO DE INICIO ------------------------------------------------------
    @Override
    public List<Funcionario> buscarPorPeriodo(LocalDate dataInicioStart, LocalDate dataInicoEnd) {
        return funcionarioRepository.findByDataInicioBetween(dataInicioStart, dataInicioStart);
    }

    //----------------------------BUSCAR POR FILTRO ------------------------------------------------------
    @Override
    public List<Funcionario> buscarFuncionarioPorFiltro(Funcionario filtro) {
        Example<Funcionario> funcionarioExample = Example.of(filtro);
        return funcionarioRepository.findAll(funcionarioExample);
    }

    @Override
    public Optional<Funcionario> buscarFuncionarioPorFiltroIgnore(Funcionario filtro) {
        ExampleMatcher caseInsensitiveExampleMatcher = ExampleMatcher.matchingAll().withIgnoreCase();
        Example<Funcionario> funcionarioExampleWitchMatcher = Example.of(filtro, caseInsensitiveExampleMatcher);
        return funcionarioRepository.findOne(funcionarioExampleWitchMatcher);
    }

}
