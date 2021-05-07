package P_006_Atributos_e_Metodos_Estaticos;

public class Conta {

    private int numero;
    private String cliente;
    
    public static int contador = 1;

    public Conta(String cliente){
        this.numero = contador;
        this.cliente = cliente;

        // Por que Conta ao inves de THIS
        /*
            Por ele ser um atributo estatico, temos que acesar ele de forma
            estatica
        */
        Conta.contador = Conta.contador + 1;
    }
    



    public static int proximaConta(){
        return Conta.contador;
    }




    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
