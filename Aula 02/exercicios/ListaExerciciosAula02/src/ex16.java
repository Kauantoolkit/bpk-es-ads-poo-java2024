import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversao de temperatura:");
        System.out.println("1: Celsius para Fahrenheit");
        System.out.println("2: Fahrenheit para Celsius");
        int opcao = scanner.nextInt();

        System.out.print("Digite a temperatura a ser convertida: ");
        double temperatura = scanner.nextDouble();

        double resultado;
        if (opcao == 1) {
            resultado = celsiusParaFahrenheit(temperatura);
            System.out.println(temperatura + "°C = " + resultado + "°F");
        } else if (opcao == 2) {
            resultado = fahrenheitParaCelsius(temperatura);
            System.out.println(temperatura + "°F = " + resultado + "°C");
        } else {
            System.out.println("Opcao invalida.");
        }

        scanner.close();
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
