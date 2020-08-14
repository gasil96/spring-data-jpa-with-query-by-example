package br.com.spring.data.jpa.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDate;

@MappedSuperclass
public abstract class Audit {

    @NotNull
    @Column(name = "DATA_REGISTRO")
    @CreatedDate
    private LocalDate dataRegistro;

    @NotNull
    @Column(name = "IP_OPERADOR")
    private String ipOperador;

    @Column(name = "DATA_MODIFICACAO")
    @LastModifiedDate
    private LocalDate dataModificação;

    @PrePersist
    @PreUpdate
    public void prePersistAndUpdate() throws UnknownHostException {
        this.setIpOperador(InetAddress.getLocalHost().getHostAddress());
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

}
