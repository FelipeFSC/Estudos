package P_002_ModificadoresDeAcesso.Protected.proj01;

public class Protegido {
    // Vazio == protected
    String nome;
    // Mas não significa que não podemos expecificar o modificador tambem
    protected int idade;

    Protegido(){

    }

    void protegido(){
        System.out.println("Sou um metodo protected");
    }
}
