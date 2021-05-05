package P_003_Heranca_e_Polimorfismo.Polimorfismo;

public class Aluno extends Pessoa{
    private String ra;

    public Aluno(String nome, int ano_nascimento, String email, String ra){
        super(nome,ano_nascimento, email);
        this.ra = ra;
    }

    public String getRa(){
		return this.ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}

    /*
        Podemos alterar metodos da super tambem:
    */
    public String getNome(){
        return "Aluno: "+super.getNome();
    }


    public String toString(){
        return super.toString()+"\nR.A: "+this.ra;
    }
}
