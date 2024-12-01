package ex16;

public class LojaMain {
    public static void main(String[] args) {
        Loja loja = new Loja("Livraria Central", "Rua das Flores, 123", "1234-5678");
        loja.abrir();
        loja.fechar();
    }
}
