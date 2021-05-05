package P_002_ModificadoresDeAcesso.encapsulamento;

/*  Agora que nossos atributos estão privados temos que usar os
    Getters e Setters

    Getter
    - é um método público, que serve para consultar dados;
     - nomenclatura é    getNomeDoAtributo()

*/
public class Conta {
    int numero;
    // Camada de segurança
    private float saldo;
    private float limite;

    Cliente cliente;

    public Conta( int numero, float saldo, float limite, Cliente cliente ){
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }


    void sacar( float valor ){
        // Regra de negócio
        if( valor <=  (this.saldo+this.limite) ){
            this.saldo = (this.saldo+this.limite) - valor;

        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    void depositar( float valor ){
        this.saldo = this.saldo + valor;
    }


    // Getters e Setters
    public float getSaldo(){
        return this.saldo + this.limite;
    }
}
