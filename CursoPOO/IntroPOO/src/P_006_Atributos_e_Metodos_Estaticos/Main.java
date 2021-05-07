package P_006_Atributos_e_Metodos_Estaticos;

public class Main {
    
    // ATRIBUTOS ESTÁTICOS

    /*
        Atributos estáticos são atributos, onde valores são compartilhados
        entre as instâncias da classe.
    */
    public static void aulaAtributos(){
        Conta c1 = new Conta("Felipe");
        System.out.println( c1.getNumero() );
        System.out.println( c1.getCliente() );
    
        Conta c2 = new Conta("Juanos");
        System.out.println( c2.getNumero() );
        System.out.println( c2.getCliente() );
    
        Conta c3 = new Conta("OLOKINHO MEU");
        System.out.println( c3.getNumero() );
        System.out.println( c3.getCliente() );

        /*
            Para utilizar um atributo estático, colocamos o nome da classe
            junto ao atributo.

            ex:
            NomeDaClasse.atributo;
        */
        System.out.println("\n"+c1.contador );
        System.out.println( c2.contador );
        System.out.println( c3.contador );
        System.out.println( Conta.contador );

        Conta.contador = 47;
        System.out.println( Conta.contador );

        Conta c4 = new Conta("El bombito AK");
        System.out.println("\n"+c4.getNumero() );
        System.out.println( c4.getCliente() );
    }


    // Métodos estáticos
    /*
        Um método estático, não depene de uma instância da classe
        para ser utilizado.

        Pose-se utilizar conforme:

        NomeDaClasse.metodo();
    */
    public static void aulaMetodos(){
        Conta c1 = new Conta("Abgail");
        System.out.println(c1.getNumero() +" - "+c1.getCliente());

        System.out.println("A proxima conta será: "+Conta.proximaConta());
    }
    public static void main(String[] args) {
        //aulaAtributos();
        aulaMetodos();
    }
}
