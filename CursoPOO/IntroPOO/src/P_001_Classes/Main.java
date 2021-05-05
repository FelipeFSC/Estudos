
// Aula Objetos

public class Main {
    // Objeto são produtos/instacias da Classe.
    public static void main(String[] args) {
        
        // Declaração e instaciação/iniciação do Objeto
        Produto p1 = new Produto(); // Construtor
        System.out.println( p1 );
        // Inserindo dados aos atributos
        p1.nome = "Caneta";
        p1.preco = 0.90f;
        p1.desconto = 15.0f;

        System.out.println(" === Produto === ");
        System.out.println( p1.nome );
        System.out.println( p1.preco );
        System.out.println( p1.desconto );

        
        System.out.println("");
        System.out.println(" === Pessoa === ");

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Felipe";
        pessoa.email = "fefe@gmail.com";
        pessoa.ano_nascimento = 2000;

        System.out.println( pessoa.nome );
        System.out.println( pessoa.email );
        System.out.println( pessoa.ano_nascimento );

        // Apenas declaração do Objeto
    //  Produto pteste;
    //  System.out.println( pteste ); //Não funciona
        // Para que o pteste funcione precisamos iniciar/instanciar ele:
    //  pteste = new Produto();
    //  System.out.println( pteste );
        

        // Essas variaveis podem ser chamadas de instacia/objeto.
        
    }
}
