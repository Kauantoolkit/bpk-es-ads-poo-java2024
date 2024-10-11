package ex01;

public class Circulo extends Forma {
    private double raio;
    private final double pi = 3.141592653589793;


    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return pi * (raio * raio);
    }
}
