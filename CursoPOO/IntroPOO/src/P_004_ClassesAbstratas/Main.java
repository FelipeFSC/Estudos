package P_004_ClassesAbstratas;

/*
    Classe abstrata é um recurso que proporciona um bloqueio na criação de objetos;

    - Não conseguimos instanciar um objeto de uma classe abstrata;
*/
public class Main {
    
    public static void main(String[] args) {
        Aluno pessoa = new Aluno("Josefino Amil", 1987, "amilfino@gmail.com", "RA-45645465");
        System.out.println(pessoa);
    }

}
