package br.senac.tads.dsw.exemplosspring;

import java.time.LocalDate;
import java.util.Scanner;

public class MainPadrao {
    
    private ExemploService service = new ExemploService();
    
    public void executar(){
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Nascimento: ");
        String data = input.nextLine();
        System.out.print("Número: ");
        int numero = input.nextInt();

        Exemplo dado = service.obterDados(nome, LocalDate.parse(data), numero);

        System.out.print("\nNúmero: "+dado.getNome()+"\nNascimento: "+dado.getDataNascimento()+"\nNúmero "+dado.getNumero());
    }

    public static void main(String[] args) {
        MainPadrao main = new MainPadrao();
        main.executar();
    }
}
