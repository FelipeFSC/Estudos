package P_003_Heranca_e_Polimorfismo.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Felipe", 2000, "fefe@email.com");
        Professor prof1 = new Professor("romulo", 1990, "roroSQL@email.com", "147852");
        Aluno a1 = new Aluno("Tuzin", 2000, "tzin@gmail.com", "1346798");

        /* ANTES de modificar o toString
        System.err.println( p1 ); // Mesma coisa de executar o toString
        System.err.println( p1.toString() );
        // Ambos imprimi o endereço de memoria do objeto
        */

        // Depois de modificar o toString
        System.err.println( p1 );
        System.err.println("");
        System.out.println( prof1 );
        System.err.println("");
        System.err.println( a1 );
        System.err.println("");

        System.err.println( a1.getNome() );

    }
}
