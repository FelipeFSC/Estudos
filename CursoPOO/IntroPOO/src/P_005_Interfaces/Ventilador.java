package P_005_Interfaces;

public class Ventilador implements IEletronico{

    private boolean ligado = false;

    @Override
    public void ligar() {
        if(!this.ligado){
            this.ligado = true;
            System.out.println("Aparelho ligado!");
        }
    }

    @Override
    public void desligar() {
        if(this.ligado){
            this.ligado = false;
            System.out.println("Aparelho desligado!");
        }
    }


    /*
        Mas lembrando que, se eu quiser implementar outros metodos
        fora os da interface eu posso SIM
        tenho que ter os métodos obrigatórios da interface porem
        se quiser pode ter outros metodos dentro da classe.
    */
    public void mensagem(){
        System.out.println(" ...    vento    ... ");
    }
    
}
