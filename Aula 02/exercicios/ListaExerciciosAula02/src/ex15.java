import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Fatorial (iterativo): " + fatorialIterativo(numero));
        System.out.println("Fatorial (recursivo): " + fatorialRecursivo(numero));

        scanner.close();
    }

    public static int fatorialIterativo(int num) {
        int fatorial = 1;
        for (int i = 2; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static int fatorialRecursivo(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * fatorialRecursivo(num - 1);
    }
}

// recursividade que aprendi na aula de c, se tiver que fazer isso na prova eu vou fazer merda