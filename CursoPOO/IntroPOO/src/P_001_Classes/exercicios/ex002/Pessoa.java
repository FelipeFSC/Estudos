package exercicios.ex002;

public class Pessoa {
    
    private String nome;


    public boolean isNull(){
        return this.nome.equals("");
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
