package br.senac.tads.dsw.exemplosspring;

import java.time.LocalDate;

public class ExemploService {
    
    public Exemplo obterDados( String nome, LocalDate dataNascimento, int numero){
        Exemplo dado = new Exemplo();
        dado.setNome(nome+" Processado");
        dado.setDataNascimento(dataNascimento);
        dado.setNumero(numero + 10);
        return dado;
    }

}
