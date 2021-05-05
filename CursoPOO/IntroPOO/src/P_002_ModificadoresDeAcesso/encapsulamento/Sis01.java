package P_002_ModificadoresDeAcesso.encapsulamento;

// Emcapsulamento
public class Sis01 {
    public static void main(String[] args) {
        Cliente p1 = new Cliente( "Felipe", "Rua da paz, 55" );
        Cliente p2 = new Cliente( "Predo", "Rua do ódio, 66" );

        Conta cont1 = new Conta(1, 100f, 200f, p1);
        Conta cont2 = new Conta(2, 200f, 500f, p2);

        System.out.println("Saldo do Felipe: "+ cont1.getSaldo() );
        System.out.println("Saldo do Predo: "+ cont2.getSaldo() );

        cont1.sacar(3000);
        System.out.println("\nSaldo do Felipe: "+ cont1.getSaldo() );

        System.out.println("Verificando o saldo do Felipe: "+cont1.getSaldo());



        /*
            Depois de adicionado Private na classe Conta
            não conseguimos acessar a variavel diretamente
            como antes, ela tem que passar pelo
            "sacar()" antes.


            cont1.saldo =  -9000; Simulando um erro sem private
            System.out.println("Saldo do Felipe: "+ cont1.getSaldo() );
        */


    }
}
