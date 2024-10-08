package ex07;

import java.util.Scanner;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno variavel_aluno = new Aluno("Pedro", 123454321, "engenharia");

        Scanner input_var = new Scanner(System.in);

        System.out.println("Quantas notas deseja inserir?");

        int contagem = input_var.nextInt();
        double[] array = new double[contagem];

        int i = 0;
        while (i < contagem) {
            System.out.printf("Insira a nota %d: ", i + 1);
            array[i] = input_var.nextDouble();
            i++;
        }


        System.out.println("A média das notas é: " + variavel_aluno.calcularMedia(array));
    }
}
