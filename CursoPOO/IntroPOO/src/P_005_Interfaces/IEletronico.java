package P_005_Interfaces;

/*
    Uma interface pode conter:
    - Constantes;
    - Métodos abstratos;
*/

// Interface para servir de contrato para produtos eletrônicos.
/* 
    Todo produto eletrônico que implementar esta interface OBRIGATORIAMENTE
    deverão implementar os métodos abstrados.
*/
public interface IEletronico {
    
    public String MARCA = "Udemy"; // Constante,  por padrão constantes são definidas em MAIUSCULO.
    
    public void ligar();

    public void desligar();


    /* Isso não pode ser feito

    public String mensagem(){
        return "Mensagem";
    }

    */
}