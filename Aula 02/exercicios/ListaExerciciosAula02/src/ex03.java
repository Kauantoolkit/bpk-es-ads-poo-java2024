import java.util.Scanner; //chama a classe scanner

public class ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //objeto Scanner, de nome scanner usando o contrutor Scanner


        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();          //entrada como double para permitir decimais nextdouble no scanner


        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();          //entrada como double para permitir decimais nextdouble no scanner


        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;


        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);


        scanner.close(); //necessário fechar o scanner
}}
