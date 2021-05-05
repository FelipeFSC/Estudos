package P_004_ClassesAbstratas.PadraoDeProjeto_TemplateMethod;

/*
    Final é um modificador de acesso que faz com que 
    o elemento que esteja utilizando, não possa ser
    extendido/reescrito.
*/

// Template Method
public abstract class Treinamento {
    
    // Modificador de acesso Final
    public final void treinoDiario(){
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public abstract void preparoFisico();

    public abstract void jogoTreino();

    public final void treinoTatico(){
        System.out.println("Treino tatico...");
    }
}
