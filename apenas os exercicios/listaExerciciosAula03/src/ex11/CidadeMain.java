package ex11;

public class CidadeMain {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("São Paulo", 12000000, "SP");
        cidade.aumentarPopulacao(1000);
        cidade.diminuirPopulacao(500);
    }
}

