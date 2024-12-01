package ex02;//Defina uma classe ex02.Celular com atributos como marca, modelo, e
// capacidadeBateria. Adicione métodos para ligar e desligar o celular.


public class Celular {
    String marca;
    String modelo;
    Float capacidadeBateria;


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




}
