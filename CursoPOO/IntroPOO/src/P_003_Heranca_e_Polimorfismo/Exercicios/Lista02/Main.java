package P_003_Heranca_e_Polimorfismo.Exercicios.Lista02;

public class Main {
    public static void main(String[] args) {
        Equipamento equip = new Equipamento("Soni", 900.00);
        System.out.println( equip.imprimir() );

        Computador comput = new Computador("Philips", 600.00, "I3 - 2200", "250 GB");
        System.out.println( comput.imprimir() );
    }
}
