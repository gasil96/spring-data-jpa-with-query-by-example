package br.com.spring.data.jpa.repository;

import br.com.spring.data.jpa.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
