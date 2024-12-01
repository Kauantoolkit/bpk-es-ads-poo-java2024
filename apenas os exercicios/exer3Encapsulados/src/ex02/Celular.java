package ex02;//Defina uma classe ex02.Celular com atributos como marca, modelo, e
// capacidadeBateria. Adicione métodos para ligar e desligar o celular.


public class Celular {
    private String marca;
    private String modelo;
    private Float capacidadeBateria;


    public Celular(String marca, String modelo, Float capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    void ligar(){
        System.out.println("O celular "+modelo+" está ligado\n");
    }

    void printarbateria(){
        System.out.println("Capacidade da bateria: "+capacidadeBateria+"%");
    }


    void desligar(){
        System.out.println("O celular está desligado\n");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Float getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadeBateria(Float capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }
}
