package ex04;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("1234567890", 100.0);
        ContaBancaria conta2 = new ContaBancaria("9876543210", 200.0);

        conta1.depositar(1000.0);
        conta2.depositar(500.0);

        System.out.println("Saldo da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());

        conta1.transferir(conta2, 200.0);

        System.out.println("Saldo da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());
    }
}
