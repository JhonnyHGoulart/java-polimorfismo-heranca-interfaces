package br.com.senai.polimorfismo.herancaeconstrutores.classes;

public class Cliente2 {
    private String nome;
    private String cpf;
    private Conta2 conta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta2 getConta() {
        return conta;
    }

    public void setConta(Conta2 conta) {
        this.conta = conta;
    }
}
