package ex01;//1 - Crie uma classe chamada Livro com atributos como titulo, autor,
// e numeroDePaginas. Adicione métodos para abrir o ex01.livro e ler uma página.


public class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;        //eu amo int ser minusculo e string maiusculo...

        public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    void abrir(){
        System.out.println("Livro " + titulo + " aberto!");
    }

    void lerPagina(int numeroPagina){
        System.out.println("Lendo uma página do ex01.livro "+titulo);
    }
}

