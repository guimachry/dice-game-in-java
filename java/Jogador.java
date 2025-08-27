public class Jogador {
    private String nome;

    public int jogarDado(Dado dado){
        return dado.girar();
    }

    public void setnome( String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }


}
