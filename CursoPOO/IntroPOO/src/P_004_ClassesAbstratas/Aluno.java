package P_004_ClassesAbstratas;

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


    @Override
    public String toString(){
        return super.toString()+"\nRA: "+this.ra;
    }
    // Implementando método abstrato
    @Override
    public void mensagem(String texto) {
        System.out.println(texto);
    }
}