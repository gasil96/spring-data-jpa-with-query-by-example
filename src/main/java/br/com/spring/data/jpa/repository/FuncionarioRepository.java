package br.com.spring.data.jpa.repository;

import br.com.spring.data.jpa.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    /**
     * Retorna uma lista de funcionários que possuem a mesma 'identificação fiscal'
     *
     * @param identificaoFiscal
     */
    List<Funcionario> findByidentificaoFiscal(String identificaoFiscal); //FORMA AUTOMÁTICA

    @Query("SELECT f FROM Funcionario f WHERE LOWER(f.identificaoFiscal) = LOWER(:identificaoFiscal)")
    List<Funcionario> buscarPorIdFiscalFormaManual(@Param("identificaoFiscal") String identificaoFiscal); //FORMA MANUAL

    @Query(value = "SELECT * FROM FUNCIONARIO f WHERE f.identificaoFiscal = ?1")
    List<Funcionario> buscarPorIdFiscalFormaNativa(String identificaoFiscal); //FORMA NATIVA

    // ---------------------------------------------------------------------

    /**
     * Retorna Uma Lista dinamica baseada no %LIKE% nome do Funcionario
     *
     * @Param nomeCompleto
     */

    List<Funcionario> findByNomeCompletoIgnoreCaseContaining(String nomeCompleto); //FORMA AUTOMÁTICA

    //TODO CONTINUAR

}
