package ex03;

public class PessoaMain {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João", 25, 60);
        Pessoa p2 = new Pessoa("Maria", 30, 90);

        p1.apresentar();
        p2.apresentar();

        p1.printarNome();
        p1.printarAltura();
        p1.printarIdade();

        p2.printarNome();
        p2.printarAltura();
        p2.printarIdade();


    }
}
