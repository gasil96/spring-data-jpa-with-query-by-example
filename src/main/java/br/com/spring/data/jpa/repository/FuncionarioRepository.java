package br.com.spring.data.jpa.repository;

import br.com.spring.data.jpa.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    /**
     * Retorna uma lista de funcionários que possuem a mesma 'identificação fiscal'
     * @param identificacaoFiscal
     */
    List<Funcionario> findByidentificacaoFiscal(String identificacaoFiscal); //FORMA AUTOMÁTICA

    @Query("SELECT f FROM Funcionario f WHERE LOWER(f.identificacaoFiscal) = LOWER(:identificacaoFiscal)")
    List<Funcionario> buscarPorIdFiscalFormaManual(@Param("identificacaoFiscal") String identificacaoFiscal); //FORMA MANUAL

    @Query(value = "SELECT * FROM FUNCIONARIO f WHERE f.ID_FISCAL = ?1", nativeQuery = true)
    List<Funcionario> buscarPorIdFiscalFormaNativa(String identificacaoFiscal); //FORMA NATIVA

    // ---------------------------------------------------------------------

    /**
     * Retorna Uma Lista dinamica baseada no %LIKE% nome do Funcionario
     *
     * @Param nomeCompleto
     */
    List<Funcionario> findByNomeCompletoIgnoreCaseContaining(String nomeCompleto); //FORMA AUTOMÁTICA

    /**
     * Retorna Uma Lista de funcionários contratados dentro do período estipulado
     *
     * @Param dataInicioStart
     * @Param dataInicioEnd
     */
    List<Funcionario> findAllBydataInicioBetween(LocalDate dataInicioStart, LocalDate dataInicioEnd); //FORMA AUTOMÁTICA

}
