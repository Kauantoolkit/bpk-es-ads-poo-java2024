import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner picles = new Scanner(System.in); //nomeei como picles o scanner para faciliar a vizualização de
                                                    //aonde exatamente a variavel scanner é chamada

        System.out.print("Digite seu nome: ");
        String nome = picles.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = picles.nextInt();

        System.out.println("Nome: " + nome + ", Idade: " + idade);

        picles.close();
    }
}

