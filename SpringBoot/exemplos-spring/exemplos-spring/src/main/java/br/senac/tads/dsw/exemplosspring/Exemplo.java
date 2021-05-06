package br.senac.tads.dsw.exemplosspring;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Exemplo {
    
    private String nome;
    private LocalDate dataNascimento;
    private int numero;

    // Exemplo de 1 para Muitos
    // Enviar 2 listas por exemplo
    private List<String> telefone;


    public Exemplo(){}
    public Exemplo(String nome, LocalDate dataNascimento, int numero){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
    }

    public boolean isMenorIdade(){
        long idade = ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
        return idade < 18;
    }


    // Exemplo de 1 para Muitos
    // Enviar 2 listas por exemplo
    public List<String> getTelefone() {
        return this.telefone;
    }

    public void setTelefone(List<String> telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

}
