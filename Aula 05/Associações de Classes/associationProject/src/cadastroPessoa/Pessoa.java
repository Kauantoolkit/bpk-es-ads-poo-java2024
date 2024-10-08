package cadastroPessoa;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Pessoa pai;
    private Pessoa mae;
    private Endereco enderecoAtual;
    private List<Endereco> enderecos;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Endereco getEnderecoAtual() {
        return enderecoAtual;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public void setEnderecoAtual(Endereco enderecoAtual) {
        this.enderecoAtual = enderecoAtual;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", pai=" + getPai() +
                ", mae=" + getMae() +
                ", enderecoAtual=" + getEnderecoAtual() +
                ", enderecos=" + getEnderecos() +
                '}';
    }
}
