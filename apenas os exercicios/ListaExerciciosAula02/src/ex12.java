import java.util.Arrays;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];                     //se n colocar new essa bomba n aloca os espaços

        System.out.println("Digite 5 numeros inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);     //lembrar que da pra usar sort graças a classe arrays

        System.out.println("Numeros em ordem crescente:");
        for (int num : numeros) {  // olha o for c in range do python aq kkkkkkk
            System.out.println(num);
        }

        scanner.close();
    }
}


