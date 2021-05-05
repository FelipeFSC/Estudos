
// Aula Classes
/* 
- Toda classe deve ser iniciada com Letra Maiuscula
- O nome não deve ter caracteres especiais 
- A classe não contem implementação de função main()
- Toda classe Java possui a seguinte forma:

publib class NomeDaClasse{

}
*/

// Aula Atributos
/*
- São as caracteristicas da classe/medelo de dados.
- Atributos são como variáveis da classe.
- Atributos são nomeados com inicio em letra minuscula.
*/

// Aula Métodos
/*
- Métodos são como ações realizadas por um Objeto da Classe
- Métodos podem ser entendidos como comportamentos do Objeto da nossa Classe.
- Diferença entre Função e Método
 Função:
    Função não depende de um Classe.
 Método:
    Faz parte de uma Classe.
*/

public class Produto {
    String nome;
    float preco;
    float desconto;

    void aumentar_preco(float valor){
        this.preco = this.preco + valor;
    }
}
