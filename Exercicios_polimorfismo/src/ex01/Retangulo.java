package ex01;

public class Retangulo extends Forma {
    private double largura;
    private double altura;

    // Construtor para inicializar largura e altura
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura; // Fórmula da área do retângulo
    }
}
