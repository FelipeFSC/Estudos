package P_003_Heranca_e_Polimorfismo.Heranca;

/*
    Classe Base:
    Classe mãe/pai
    Super Classe
    Classe generica
*/

public class Pessoa {
    private String nome;
    private int ano_nascimento;
    // Digamos que apartir de agora todas as pessoas da nossa escola
    // tem um Email
    private String email;
    // Pronto, não precisamos repetir o código nas seguintes classes
    // pois elas herdam da super classe Pessoa e elas ja terão esse atributo.
    // As unicas coisas que precisamos alterar é a super e o parametro da classe sub classe.

    public Pessoa( String nome, int ano_nascimento, String email ){
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;
    }

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
}
