package ex19;

public class LivroDigital {
    private String titulo;
    private String autor;
    private int tamanhoArquivo; // Em MB

    public LivroDigital(String titulo, String autor, int tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void abrir() {
        System.out.println("O livro digital '" + titulo + "' foi aberto.");
    }

    public void fechar() {
        System.out.println("O livro digital '" + titulo + "' foi fechado.");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(int tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
}
