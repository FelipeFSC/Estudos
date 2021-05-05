package P_002_ModificadoresDeAcesso.Public;

import P_002_ModificadoresDeAcesso.encapsulamento.Cliente;

public class index {
    /*
        Public é um modificador de acesso que torna publico um
        determinado Objeto
        As Classes são sempre public
         tambem contrutores e metodos
        ja os atributos podem ser tanto public
         quanto private ou protected

         Public
          e quando todo o nosso projeto pode acessar aquele
          metodo, classe enfim..
    */

    // ( public ) pode ser usado em todo o projeto
    public static void main(String[] args) {
        // chamando uma classe publica de outro pacote
        Cliente p1 = new Cliente( "Felipe", "Rua da paz, 55" );
        // e claro, o nome só conseguiu ser acessado pois tambem era publico
        System.out.println("Dado vindo de um objeto de uma classe de outro pacote: "+p1.nome );


        /* Ja o endereço não é possivel usar pois não é publico
        System.out.println("Dado vindo de um objeto de uma classe de outro pacote: "+p1.endereco );
        */
    }
}
