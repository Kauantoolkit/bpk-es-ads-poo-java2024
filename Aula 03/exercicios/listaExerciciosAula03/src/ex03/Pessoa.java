package ex03;

//- Implemente uma classe ex03.Pessoa com atributos nome, idade, e altura.
// Adicione um método que imprime uma apresentação da pessoa.


class Pessoa {
    String nome;
    int idade;
    double altura;


    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    void printarNome(){
        System.out.println("Nome: " + nome);
    }

    void printarAltura(){
        System.out.println("Altura: " + altura + "m");
    }

    void printarIdade(){
        System.out.println("Idade: " + idade + " anos");
    }


    void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + ", tenho " + idade + " anos e " + altura + " metros de altura.");
    }
}