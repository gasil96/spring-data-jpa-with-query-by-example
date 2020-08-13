package br.com.spring.data.jpa.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "CARGO")
public class Cargo extends Audit {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "ID_CARGO")
    private Long id;

    @NotNull
    @Column(name = "NOME")
    private String nome;

    @Column(name = "SETOR")
    private String setor;

    @Column(name = "SALARIO_INICIAL", precision = 24, scale = 2)
    private BigDecimal salarioInicial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public BigDecimal getSalarioInicial() {
        return salarioInicial;
    }

    public void setSalarioInicial(BigDecimal salarioInicial) {
        this.salarioInicial = salarioInicial;
    }
}
