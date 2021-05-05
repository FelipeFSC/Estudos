package P_002_ModificadoresDeAcesso.Private;

public class Main {
    /*
        O private torna seu atributo ou função privada dentro da propria classe
        ou seja, o mesmo só irá sofrer modificações dentro de sua classe.
    */

    public static void main(String[] args) {
        PrivadoTeste teste = new PrivadoTeste();

        teste.souPublico();

        /*
            Desta classe não conseguimos chamar o metodo privado
            teste.souPrivado(); ERRO

            mas podemos a partir de um metodo publico chamar o privado
        */
        teste.chamarPrivado();
    }

}
