package br.com.senai.polimorfismo.reescritademetodos.classes;

public class Gerente2 extends Funcionario2 {
    private int senha;

    @Override
    public double bonificacao() {
        return super.bonificacao() + super.getSalario();
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
