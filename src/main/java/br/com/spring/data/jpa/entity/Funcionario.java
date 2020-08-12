package br.com.spring.data.jpa.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

    private Long id;

    private String identificaoFiscal;

    private String matricula;

    private String nomeCompleto;

    private LocalDate dataNascimento;

    private LocalDate dataInicio;

    private LocalDate dataFim;

    private BigDecimal salarioBase;

    //Dados de auditoria...

    private LocalDate dataRegistro;

    private String ipOperador;

    private LocalDate dataModificação;

    private String situacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentificaoFiscal() {
        return identificaoFiscal;
    }

    public void setIdentificaoFiscal(String identificaoFiscal) {
        this.identificaoFiscal = identificaoFiscal;
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

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getIpOperador() {
        return ipOperador;
    }

    public void setIpOperador(String ipOperador) {
        this.ipOperador = ipOperador;
    }

    public LocalDate getDataModificação() {
        return dataModificação;
    }

    public void setDataModificação(LocalDate dataModificação) {
        this.dataModificação = dataModificação;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
