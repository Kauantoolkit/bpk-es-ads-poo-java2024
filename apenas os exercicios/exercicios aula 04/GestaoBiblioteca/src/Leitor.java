import java.time.LocalDate;

public class Leitor {
    private String nome;
    private String matricula;
    private LocalDate dataNascimento;

    public Leitor(String nome, String matricula, LocalDate dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public LocalDate getDataNascimento() { return dataNascimento; }
}
