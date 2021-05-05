package P_003_Heranca_e_Polimorfismo.Exercicios.Lista02;

public class Computador extends Equipamento {
    private String processador;
    private String memoria;

    public Computador(String nome, double valor,  String processador, String memoria){
        super(nome, valor);
        this.processador = processador;
        this.memoria = memoria;
    }

    public String imprimir(){
        return super.imprimir()+"\n  (Filho)  Computador \nProcessador: "+this.processador+"\nMemoria: "+this.memoria;
    }
}
