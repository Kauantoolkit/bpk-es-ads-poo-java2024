package ex03;

public class EmailNotificacao implements Notificacao {

    @Override
    public void enviar() {
        System.out.println("Enviando email...");
    }
}
