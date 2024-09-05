package ex11;

public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade) {
        populacao += quantidade;
        System.out.println("A população da cidade aumentou. População atual: " + populacao);
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade <= populacao) {
            populacao -= quantidade;
            System.out.println("A população da cidade diminuiu. População atual: " + populacao);
        } else {
            System.out.println("A quantidade de pessoas para remover excede a população.");
        }
    }
}
