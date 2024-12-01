import java.util.Random;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100) + 1;  // (0 a 99) + 1
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Adivinhe o numero (entre 1 e 100):");

        while (palpite != numeroSecreto) {
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabens! Voce acertou em " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
}

//esse role de nextint nextstring pra depois no scan ser nextline me quebra mt