package br.com.spring.data.jpa.repository;

import br.com.spring.data.jpa.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
