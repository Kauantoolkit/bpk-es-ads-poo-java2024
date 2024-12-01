
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //tipo  Nome      (metodo da util Scanner)

        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha uma operacao: ");
        System.out.println("1: Soma");
        System.out.println("2: Subtracao");
        System.out.println("3: Multiplicacao");
        System.out.println("4: Divisao");


        int opcao = scanner.nextInt();                      //opcao recebe input para o switch, uso tanto if q esqueci
                                                            //como isso funciona

        double resultado;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Divisao por zero nao e permitida.");
                }
                break;
            default:
                System.out.println("Opcao invalida.");
                break;
        }

        scanner.close();
    }
}