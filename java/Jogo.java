import java.util.Scanner;

public class Jogo {

    private Jogador jogador1;
    private Jogador jogador2;
    private Dado dado;
    private Scanner input = new Scanner(System.in);

    public Jogo(Jogador jogador1, Jogador jogador2, Dado dado) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.dado = dado;
    }

    public void iniciarJogo() {
        apresentarJogadores(jogador1, jogador2);

        jogadorPronto(jogador1);
        System.out.println(" jogador 1 " + jogador1.getNome() + " vai jogar o dado...");
        int resultadoj1 = jogador1.jogarDado(dado);
        System.out.println(" jogador 1 " + jogador1.getNome() + " obteve " + resultadoj1);

        jogadorPronto(jogador2);
        System.out.println(" jogador 2 " + jogador2.getNome() + " vai jogar o dado...");
        int resultadoj2 = jogador2.jogarDado(dado);
        System.out.println(" jogador 2 " + jogador2.getNome() + " obteve " + resultadoj2);

        verificarVencedor(resultadoj1, resultadoj2);
    }

    private void verificarVencedor(int resultadoj1, int resultadoj2) {
        if (resultadoj1 > resultadoj2) {
            System.out.println("jogador 1 ganhou ");
        } else if (resultadoj1 == resultadoj2) {
            System.out.println("empate");
        } else {
            System.out.println("jogador 2 ganhou");
        }
    }

    private int jogada(Jogador jogador) {
        int resultado = jogador.jogarDado(dado);
        System.out.println(" jogador " + jogador.getNome() + " obteve " + resultado);
        return resultado;
    }

    private void jogadorPronto(Jogador jogador) {
        System.out.println(" jogador " + jogador.getNome() + " pronto para jogar dado? (S para sim)");
        String opc = input.next();

        while (!opc.equalsIgnoreCase("S")) {
            System.out.println(" jogador " + jogador.getNome() + " digite S para continuar.");
            opc = input.next();
        }
    }

    private void apresentarJogadores(Jogador jogador1, Jogador jogador2) {
        System.out.println("Informe nome do jogador 1:");
        String nomeTemp = input.next();
        jogador1.setnome(nomeTemp);

        System.out.println("Informe nome do jogador 2:");
        nomeTemp = input.next();
        jogador2.setnome(nomeTemp);
    }
}