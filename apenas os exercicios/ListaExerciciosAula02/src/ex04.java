import java.util.Scanner; //importa a classe scanner

public class ex04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   //objeto Scanner, de nome scanner usando o contrutor Scanner

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();  //proximo int


        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }


        scanner.close();
    }
}
