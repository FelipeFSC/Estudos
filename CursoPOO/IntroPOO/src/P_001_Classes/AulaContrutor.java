public class AulaContrutor {

/*
    - O construtor de uma Classe SEMPRE tem o mesmo nome da classe;
    - Podemos ter mais de um construtor na classe.
*/

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); // Construtor Vazio.
        pessoa.nome = "Felipe";
        pessoa.email = "fefe@gmail.com";
        pessoa.ano_nascimento = 2000;
        pessoa.imprimeInfo();

        Pessoa pessoa2 = new Pessoa( "Outro Felipe", "outroEmailfefe@gmail.com", 2001); // Contrutor com parametros.
        pessoa2.imprimeInfo();
    }
}
