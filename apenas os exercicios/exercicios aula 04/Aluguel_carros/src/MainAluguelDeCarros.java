import java.time.LocalDate;

public class MainAluguelDeCarros {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Aluguel de Carros ===");
        Carro carro = new Carro("Toyota", "Corolla", 2020, 150.0);
        Cliente cliente = new Cliente("João Silva", "123.456.789-00", "AB1234567");
        Locacao locacao = new Locacao(LocalDate.now(), LocalDate.now().plusDays(5), cliente, carro);

        System.out.println("Carro disponível antes da locação? " + carro.isDisponivel());
        System.out.println("Valor total da locação: R$ " + locacao.calcularValorTotal());
        locacao.encerrarLocacao();
        System.out.println("Carro disponível após a locação? " + carro.isDisponivel());
    }
}
