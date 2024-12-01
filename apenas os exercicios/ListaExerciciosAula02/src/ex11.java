import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (isPalindromo(palavra)) {
            System.out.println("A palavra " + palavra + " é um palindromo.");
        } else {
            System.out.println("A palavra " + palavra + " não é um palindromo.");
        }

        scanner.close();
    }

    public static boolean isPalindromo(String palavra) {

        palavra = palavra.toLowerCase();

        int n = palavra.length(); //lembra mt python

        for (int i = 0; i < n / 2; i++) {

            if (palavra.charAt(i) != palavra.charAt(n - i - 1)) {       //como o primeiro indice é 0 precisa desse -1
                return false;
            }
        }

        return true;  // Se passar pelo loop, é um palíndromo
    }
}
