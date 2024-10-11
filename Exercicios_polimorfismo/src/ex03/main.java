package ex03;

import java.util.Scanner;

public class main {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de notificacao: ");
        System.out.println("1. Email");
        System.out.println("2. SMS");

        int opcao = scanner.nextInt();

        Notificacao notificacao;


        switch (opcao) {
            case 1:
                notificacao = new EmailNotificacao();
                break;
            case 2:
                notificacao = new SMSNotificacao();
                break;
            default:
                System.out.println("Opcao invalida.");
                return;
        }


        notificacao.enviar();
    }
}

