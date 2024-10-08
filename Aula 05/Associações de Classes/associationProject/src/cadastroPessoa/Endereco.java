package cadastroPessoa;

public class Endereco {

    private String rua;
    private String numero;
    private String cidade;
    private String CEP;
    private String bairro;

    public Endereco(String rua, String numero, String cidade, String CEP, String bairro) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.CEP = CEP;
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCEP() {
        return CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + getRua() + '\'' +
                ", numero='" + getNumero() + '\'' +
                ", cidade='" + getCidade() + '\'' +
                ", cEP='" + getCEP() + '\'' +
                ", bairro='" + getBairro() + '\'' +
                '}';
    }
}
