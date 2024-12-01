package ex06;

public class Computador {
    private String processador;
    private int memodiaRAM;
    private int armazenamento;
    private boolean ligado;

    public Computador(String processador,int memodiaRAM, int armazenamento) {

        this.processador = processador;
        this.memodiaRAM = memodiaRAM;
        this.armazenamento = armazenamento;
        this.ligado = false;
    }

    public void ligar() {
        if(!ligado){
            ligado = true;
            System.out.println("o computador foi ligado");
        }
        else{
            System.out.println("o computador já está ligado");
        }
    }

    public void desligar() {
        if(ligado){
            ligado = false;
            System.out.println("o computador foi desligado");
        }
        else{
            System.out.println("o computador já está desligado");
        }
    }

    public String getProcessador() {
        return processador;
    }

    public int getMemodiaRAM() {
        return memodiaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemodiaRAM(int memodiaRAM) {
        this.memodiaRAM = memodiaRAM;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
