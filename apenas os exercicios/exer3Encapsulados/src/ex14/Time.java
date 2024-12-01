
package ex14;
public class Time {
    private String nome;
    private String tecnico;
    private int numeroDeJogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public void adicionarJogador() {
        numeroDeJogadores++;
        System.out.println("Jogador adicionado ao time. Número de jogadores: " + numeroDeJogadores);
    }

    public void removerJogador() {
        if (numeroDeJogadores > 0) {
            numeroDeJogadores--;
            System.out.println("Jogador removido do time. Número de jogadores: " + numeroDeJogadores);
        } else {
            System.out.println("Não há jogadores para remover.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public int getNumeroDeJogadores() {
        return numeroDeJogadores;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public void setNumeroDeJogadores(int numeroDeJogadores) {
        this.numeroDeJogadores = numeroDeJogadores;
    }
}
