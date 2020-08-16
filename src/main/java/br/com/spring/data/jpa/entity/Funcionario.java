package br.com.spring.data.jpa.entity;

import org.apache.tomcat.jni.Local;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FUNCIONARIO")
    private Long id;

    @NotNull
    @Column(name = "ID_FISCAL")
    private String identificacaoFiscal;

    @NotNull
    @Column(name = "MATRICULA")
    private String matricula;

    @NotNull
    @Column(name = "NOME_COMPLETO")
    private String nomeCompleto;

    @NotNull
    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNascimento;

    @NotNull
    @Column(name = "DATA_INICIO")
    private LocalDate dataInicio;

    @Column(name = "DATA_FIM")
    private LocalDate dataFim;

    @NotNull
    @Column(name = "SALARIO_BASE", precision = 12, scale = 2)
    private BigDecimal salarioBase;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_cargo_fk", referencedColumnName = "id_cargo")
    private Cargo cargo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentificacaoFiscal() {
        return identificacaoFiscal;
    }

    public void setIdentificacaoFiscal(String identificacaoFiscal) {
        this.identificacaoFiscal = identificacaoFiscal;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
