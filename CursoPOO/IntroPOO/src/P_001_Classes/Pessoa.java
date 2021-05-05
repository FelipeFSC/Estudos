
// Classe
public class Pessoa {
    // Atributos
    String nome;
    String email;
    int ano_nascimento;

    // Construtor vazio
    public Pessoa(){
        //- Por padrão a JVM cria em tempo de execução, um construtor vazio
        // quando não criado nenhum;
        /*
            - Um construtor vazio sempre segue a mesma forma:
            public NomeDaClasse(){

            }
        */
    }

    // Construtor com parametros
    public Pessoa( String nome, String email, int ano ){
        // this. Significa Este Objeto
        // Sempre que chamado o this ele chama a variavel do Objeto
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano;
    }

    // Metodos
    void imprimeInfo(){
        System.out.println( this.nome );
        System.out.println( this.email );
        System.out.println( this.ano_nascimento );
    }
}
