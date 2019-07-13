package br.com.felipe.restapi.model;

import lombok.Data;

@Data
public class Pessoa {
    private String cpf;
    private String nome;
    private Integer idade;
    private String sexo;
}
