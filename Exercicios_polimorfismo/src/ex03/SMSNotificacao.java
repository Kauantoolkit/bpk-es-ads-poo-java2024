package ex03;

public class SMSNotificacao implements Notificacao{
    @Override
    public void enviar() {
        System.out.println("Enviando SMS...");
    }
}
