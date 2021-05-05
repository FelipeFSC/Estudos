package P_004_ClassesAbstratas.PadraoDeProjeto_TemplateMethod;

public class TreinamentoInicioTemporada extends Treinamento{

    @Override
    public void preparoFisico() {
        System.out.println("Preparo fisico do INICIO da temporada");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino do INICIO da temporada");
    }
    
}
