//4 - Crie uma classe ContaBancaria com atributos como numeroConta e saldo. Adicione
// métodos para depositar e sacar dinheiro.

package ex04;

public class ContaBancaria {
    String numeroConta;
    double saldo;

    // Construtor
    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado com sucesso! Novo saldo: " + saldo);
    }

    // Método para sacar dinheiro
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    // Método para transferir dinheiro entre contas
    public boolean transferir(ContaBancaria destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
            return true;
        } else {
            System.out.println("Falha na transferência.");
            return false;
        }
    }

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }
}
