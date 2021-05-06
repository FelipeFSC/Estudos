package P_005_Interfaces;

// Interfaces - O que é e quando utilizar

/*
    Interfaces são conhecidas como "contratos"

    Uma empresa criou um contrato 'com regras' para definir
    a criação de um produto/serviço.

    - Quem implementar este contrato é OBRIGADO a seguir as regras.

    O Fulano, decidiu implementar um produto/serviço baseado neste contrato.
    O Cicrano, também decidiu implementar um produto/serviço baseado no mesmo contrato.
    Como ambos estão usando do mesmo contrato o produto/serviço serão equivalentes.


*/
public class Main {
    
    public static void main(String[] args) {
        Ventilador vent = new Ventilador();

        System.out.println("\nVentilado que ganhei da "+vent.MARCA);

        vent.desligar();
        vent.ligar();
        vent.desligar();
    }
}
