package P_004_ClassesAbstratas.PadraoDeProjeto_TemplateMethod;

/*
    O padrão Template Method define o esqueleto de uma algoritmo
    dentro de um método, transferindo alguns de seus passos para 
    as subclasses.
    O Template Method permite que as subclasses redefinam certos
    passos de um algoritmo sem alterar a estrutura do próprio
    algoritmo.

    Algoritmos são "receitas" passo-a-passo para resolver algum problema.

    ex:

    Algoritmo
        receber numero:;
        retornar numero + numero;
    .

    Template Method
        Metodo principal(){
            passo1();
            passo2();
            passo3();
        }
    .



*/
public class Main {
    public static void main(String[] args) {
        TreinamentoInicioTemporada tit = new TreinamentoInicioTemporada();
        TreinamentoFimTemporada tft = new TreinamentoFimTemporada();

        tit.preparoFisico();
        tit.jogoTreino();

        System.out.println("");

        tft.preparoFisico();
        tft.jogoTreino();
    }
}
