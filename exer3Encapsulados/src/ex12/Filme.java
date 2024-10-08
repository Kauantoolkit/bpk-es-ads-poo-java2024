package ex12;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracao; // Em minutos

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void iniciar() {
        System.out.println("O filme '" + titulo + "' dirigido por " + diretor + " começou.");
    }

    public void parar() {
        System.out.println("O filme '" + titulo + "' foi pausado.");
    }


    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}


