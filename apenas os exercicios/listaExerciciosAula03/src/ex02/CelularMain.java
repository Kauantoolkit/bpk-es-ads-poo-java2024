package ex02;

public class CelularMain {
    public static void main(String[] args) {



        Celular celular = new Celular("Ximuiliu","t54",20.1f);
        celular.ligar();
        celular.printarbateria();
        celular.desligar();


        Celular celular2 = new Celular("Hisoku", "Cu23", 45f);
        celular2.ligar();
        celular.printarbateria();
        celular2.desligar();

    }
}
