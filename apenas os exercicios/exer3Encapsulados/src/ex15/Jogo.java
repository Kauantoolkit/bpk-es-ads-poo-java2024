package ex15;

public class Jogo {
    private String nome;
    private String genero;
    private double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciar() {
        System.out.println("O jogo '" + nome + "' foi iniciado.");
    }

    public void pausar() {
        System.out.println("O jogo '" + nome + "' foi pausado.");
    }


    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

