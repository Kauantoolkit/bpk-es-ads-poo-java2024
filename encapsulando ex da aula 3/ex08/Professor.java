package ex08;

public class Professor {

    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario){
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void dar_aula(){
        System.out.println("Dando aula a disciplina " + this.disciplina);
    }

    public void corrigir_prova(){
        System.out.println(nome+" está corrigindo provas");
    }


}
