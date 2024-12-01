import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Locacao {
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Cliente cliente;
    private Carro carro;

    public Locacao(LocalDate dataInicio, LocalDate dataFim, Cliente cliente, Carro carro) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.cliente = cliente;
        this.carro = carro;
        carro.setDisponivel(false);
    }

    public double calcularValorTotal() {
        long dias = ChronoUnit.DAYS.between(dataInicio, dataFim);
        return dias * carro.getValorPorDia();
    }

    public void encerrarLocacao() {
        carro.setDisponivel(true);
    }

    public boolean verificarDisponibilidade() {
        return carro.isDisponivel();
    }
}
