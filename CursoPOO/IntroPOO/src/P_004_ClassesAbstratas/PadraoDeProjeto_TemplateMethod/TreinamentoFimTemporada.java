package P_004_ClassesAbstratas.PadraoDeProjeto_TemplateMethod;

public class TreinamentoFimTemporada extends Treinamento{
    @Override
    public void preparoFisico() {
        System.out.println("Preparo fisico do FIM da temporada");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino do FIM da temporada");
    }
    
}
