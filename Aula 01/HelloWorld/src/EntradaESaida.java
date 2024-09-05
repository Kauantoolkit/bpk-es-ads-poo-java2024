import java.util.Scanner;

public class EntradaESaida {
    private static Scanner scanner = new Scanner(System.in);

    public static String Input(String msgDisplay) {
        System.out.print(msgDisplay);
        return scanner.nextLine();
    }

    public static void Output(String msgDisplay) {
        System.out.println(msgDisplay);
    }
}
