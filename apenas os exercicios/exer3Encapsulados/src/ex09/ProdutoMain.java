package ex09;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.0, 10);
        produto.aumentarEstoque(5);
        produto.diminuirEstoque(3);
    }
}
