package P_002_ModificadoresDeAcesso.Protected.proj02;

//import P_002_ModificadoresDeAcesso.Protected.proj01.Protegido;

public class Main {
    /*
        Um atributo ou metodo com protecd funciona
        apenas no mesmo pacote onde foi criado,
        
        Quando um metodo ou classe não tem expecificado
        seu acessor ele vem por ( padrão como protect )
    */

    public static void main(String[] args) {
        /*
            Ambos não vão funcionar pois estão
            por padrão como protected
        */

        //Protegido teste = new Protegido();
        // teste.protegido();
    }
    
}