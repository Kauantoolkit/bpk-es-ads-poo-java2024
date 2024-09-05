package ex01;

public class livromain {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 2003);
        livro1.abrir();
        livro1.lerPagina(300);

        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        livro2.abrir();
        livro2.lerPagina(186);



    }
}
