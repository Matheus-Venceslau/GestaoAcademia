package models;

public class Cliente extends Pessoa{
    private String planoCliente;

    public Cliente(String nome, int idade, String planoCliente) {
        super(nome, idade);
        this.planoCliente = planoCliente;
    }

    public String getPlanoCliente() {
        return planoCliente;
    }

    @Override
    public String getDescricao() {
        return "Cliente{" +
                "planoCliente='" + planoCliente + '\'' +
                ", nomePessoa='" + nomePessoa + '\'' +
                ", idadePessoa=" + idadePessoa +
                '}';
    }
}
