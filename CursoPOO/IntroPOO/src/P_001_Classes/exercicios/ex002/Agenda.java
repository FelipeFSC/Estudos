package exercicios.ex002;

public class Agenda {
    
    private Pessoa pessoas[];
    private int limite;

    public Agenda(){
        this.limite = 0;
        this.pessoas = new Pessoa[10];
    }

    public void armazenaPessoa( Pessoa dado ){
        if( this.limite < 10 ){
            /*
            for( int i=0; i < this.limite; i++ ){
                if( dado.getNome().equals( this.pessoas[i].getNome() )){
                    System.out.println("Nome ja cadastrado");
                    return;
                
                }
            }
            */
            this.pessoas[limite] = dado;
            this.limite++;
            
        } else {
            System.out.println("Limite atingido!!!");
        }
    }

    public void ajustaDados(){
        for( int i=0; i < this.limite; i++){
            if( this.pessoas[i].isNull() ){
                while( !this.pessoas[i++].isNull() ){
                    this.pessoas[i].setNome( this.pessoas[i].getNome() );
                }
            }
        }
    }
    public void removePessoa( String nome ){
        for( int i=0; i < this.limite; i++ ){
            if( i == 9 ){
                this.limite--;
                System.out.println( this.pessoas[i]+" - Removido -" );
                return;

            } else if( nome.equals( this.pessoas[i].getNome() )){
                this.pessoas[i].setNome("");
                ajustaDados();
                this.limite--;
                System.out.println( this.pessoas[i].getNome()+" - Removido -" );
            }
        }
    }

    public void mostrarAgenda(){
        for( int i = 0; i < this.limite; i++ ){
            System.out.println( i +" - "+ this.pessoas[i].getNome() );
        }
    }

}
