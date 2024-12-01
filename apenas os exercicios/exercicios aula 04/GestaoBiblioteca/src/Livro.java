public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int quantidadeEstoque;

    public Livro(String titulo, String autor, String isbn, int quantidadeEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }

    public boolean isDisponivel() { return quantidadeEstoque > 0; }

    public void emprestar() { if (isDisponivel()) quantidadeEstoque--; }

    public void devolver() { quantidadeEstoque++; }
}
