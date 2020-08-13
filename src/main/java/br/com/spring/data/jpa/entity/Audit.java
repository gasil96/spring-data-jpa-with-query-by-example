package br.com.spring.data.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
public abstract class Audit {

    private LocalDate dataRegistro;

    private String ipOperador;

    private LocalDate dataModificação;

    private String situacao;

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
