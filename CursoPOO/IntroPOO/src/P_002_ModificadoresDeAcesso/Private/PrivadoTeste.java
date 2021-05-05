package P_002_ModificadoresDeAcesso.Private;

public class PrivadoTeste {
    
    public PrivadoTeste(){}

    public void souPublico(){
        System.out.println("Sou um metodo publico");
    }

    private void souPrivado(){
        System.out.println("Sou um metodo privado");
    }
    public void chamarPrivado(){
        System.out.println("Chamando");
        souPrivado();
    }
}
