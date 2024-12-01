import java.util.Scanner;

public class
ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        int contagemVogais = contarVogais(texto);
        System.out.println("Número de vogais: " + contagemVogais);

        scanner.close();
    }

    public static int contarVogais(String texto) {
        int contador = 0;

        // Com certeza existe alguma forma de fazer isso sem essa aberração
        for (char c : texto.toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contador++;
            }
        }

        return contador;
    }
}
