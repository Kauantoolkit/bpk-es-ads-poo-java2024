package ex10;

public class VeiculoMain {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Carro", "ABC-1234", "Vermelho");
        veiculo.abastecer();
        veiculo.lavar();
    }
}
