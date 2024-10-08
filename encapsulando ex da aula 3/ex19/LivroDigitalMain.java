package ex19;

public class LivroDigitalMain {
    public static void main(String[] args) {
        LivroDigital livroDigital = new LivroDigital("Aprendizado de Java", "Maria Silva", 5);
        livroDigital.abrir();
        livroDigital.fechar();
    }
}
