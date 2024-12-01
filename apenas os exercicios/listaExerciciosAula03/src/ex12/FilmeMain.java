package ex12;

public class FilmeMain {
    public static void main(String[] args) {
        Filme filme = new Filme("A Origem", "Christopher Nolan", 148);
        filme.iniciar();
        filme.parar();
    }
}
