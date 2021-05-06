package br.senac.tads.dsw.exemplosspring;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/*
    Essa anotação ja fez para mim os
    Getters,
    Setters,
    Construtores,
    etc...
*/
@Data
public class Dados {
    
    private Integer id;

    private String nome;

    private String email;

    private String telefone;

    private String senha;

    private String repetirSenha;

    private String descricao;

    private int numero;

    private BigDecimal peso;

    private BigDecimal altura;
    
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) // ISO-8601  // Forma padrão para representar uma data atravez de uma Spring
    private LocalDate dataNascimento;

    private int genero;

    private List<String> interesses;
}
