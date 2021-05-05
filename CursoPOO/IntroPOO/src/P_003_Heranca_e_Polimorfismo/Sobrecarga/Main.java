package P_003_Heranca_e_Polimorfismo.Sobrecarga;

    /*
        - Overloading

        Ocorre quando, sobrescrevemos um método na mesma classe de declaração.

    */
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.mensagem();
        p1.mensagem( "Mensagem Personalizada" );

    }
}
