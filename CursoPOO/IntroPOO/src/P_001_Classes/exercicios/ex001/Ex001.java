package exercicios.ex001;

// Classe pessoa
public class Ex001 {
    private String nome;
    private int idade;
    private double altura;

    // Construtores
    public Ex001(){}
    public Ex001( String nome, int idade, double altura ){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Getters e Setters
    public String getNome() {   return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() {    return this.idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public double getAltura() {     return this.altura; }
    public void setAltura(double altura) { this.altura = altura; }

    // Métodos
    public void imprimirDados(){
        System.out.println("===== Exercicio 001 =====");
        System.out.println( "Nome: "+this.nome );
        System.out.println( "Idade: "+this.idade );
        System.out.println( "altura: "+this.altura );
    }
}
