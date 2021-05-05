package P_003_Heranca_e_Polimorfismo.Heranca;

public class Main {
    // Herança
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Felipe", 2000, "fefe@mail.com");
        System.out.println(p1.getNome());

        Aluno n1 = new Aluno("Anne", 2000, "nene@mail.com", "134679");
        System.out.println(n1.getNome());

        Professor prof1 = new Professor("Gilbertin", 1980, "raulgil@mail.com", "888999");
        System.out.println(prof1.getNome());
        
    }
}
