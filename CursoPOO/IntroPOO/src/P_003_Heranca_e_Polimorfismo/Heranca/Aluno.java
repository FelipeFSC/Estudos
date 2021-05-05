package P_003_Heranca_e_Polimorfismo.Heranca;
/*
    A Herança evita a repetição de código e
    facilita a manutenção

    Classe especifica:
    Sub-classe
    Classe filha
*/

/*
    Quando uma classe herda de outra classe ela ganha
     Todos os atributos e métodos da classe herdada
*/
// Aqui usamos o (extends) pois aluno ira (Herdar)
// os atributos de Pessoa.
public class Aluno extends Pessoa{ // Aluno é uma pessoa
    private String ra;

    public Aluno( String nome, int ano_nascimento, String email, String ra ){
        super(nome, ano_nascimento, email); // Pessoa(nome, ano_nascimento)
        this.ra = ra;
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
