public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        Dado dado = new Dado();
        
        
        
        Jogo jogo  = new Jogo(jogador1, jogador2, dado);
        
        jogo.iniciarJogo();
    }
}
