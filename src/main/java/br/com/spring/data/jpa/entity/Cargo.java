package br.com.spring.data.jpa.entity;

import java.util.List;

public class Cargo {

    private Long id;

    private String nome;

    private String setor;

    private String salarioInicial;

    private List<Funcionario> funcionario;

}   
