package ex15;

public class JogoMain {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("The Last of Us", "Aventura", 199.99);
        jogo.iniciar();
        jogo.pausar();
    }
}
