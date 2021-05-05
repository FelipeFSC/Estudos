package P_003_Heranca_e_Polimorfismo.Polimorfismo;

public class Professor extends Pessoa {
    private String matricula;

    public Professor( String nome, int ano_nascimento, String email, String matricula ){
        super(nome, ano_nascimento, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Metodo da Object
    public String toString(){
        return super.toString()+"\nMatricula: "+this.matricula;
    }
}
