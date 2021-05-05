package P_003_Heranca_e_Polimorfismo.Exercicios.Lista02;

public class Equipamento {
    private String nome;
    private double valor;

    public Equipamento(String nome, double valor){
            this.nome = nome;
            this.valor = valor;
    }

    public String imprimir(){
        return "\n  (Pai)  Equipamento \nNome: "+this.nome+" \nValor: "+this.valor;
    }
}
