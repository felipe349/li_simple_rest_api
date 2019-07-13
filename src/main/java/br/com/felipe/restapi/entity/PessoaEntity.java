package br.com.felipe.restapi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pessoa")
public class PessoaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String nome;
    private Integer idade;
    private String sexo;
}
