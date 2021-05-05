package P_004_ClassesAbstratas;


// Agora como classe abstrata
/*
    Desta forma,  impossibilitamos a criação de objetos desta classe

    normalmente as classes abstratas são classes
    - Base;
    - Genéricas;
    - Super classe;

    Uma classe abstrata pode ter:
    - Atributos;
    - Métodos;
    - Métodos abstratos;
        - São metodos, que não possuem implementação,

        public void setNome(String nome) {
            this.nome = nome; <-- Esse garoto aqui no caso.
        }
        
        possuem apenas declaração, 

        public void setNome( String nome ); <-- Apenas isso
        
        e, obrigatoriamente, as classes que herdarem desta
        classe com métodos abstratos, precisa implementar estes métodos.
*/
public abstract class Pessoa {
    private String nome;
    private int ano_nascimento;
    private String email;

    public Pessoa(){

    }

    public Pessoa( String nome, int ano_nascimento, String email ){
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;
    }

    // Declaração de um método abstrato
    public abstract void mensagem( String texto );



    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno_nascimento() {
        return this.ano_nascimento;
    }
    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Nome: "+this.nome+"\nAno Nascimento: "+this.ano_nascimento+"\nEmail: "+this.email;
    }
}
