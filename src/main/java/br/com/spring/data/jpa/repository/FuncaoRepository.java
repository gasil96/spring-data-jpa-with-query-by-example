package br.com.spring.data.jpa.repository;

import br.com.spring.data.jpa.entity.Funcao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncaoRepository extends JpaRepository<Funcao, Long> {
}
