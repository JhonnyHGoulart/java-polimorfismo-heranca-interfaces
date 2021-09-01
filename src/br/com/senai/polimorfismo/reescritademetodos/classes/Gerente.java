package br.com.senai.polimorfismo.reescritademetodos.classes;

public class Gerente extends Funcionario {
    private int senha;

    public int getSenha() {
        return senha;
    }

    public boolean autenticaSenha(int senha) {
        if (senha == this.senha) {
            return true;
        }
        return false;
    }


    public double getBonificacao() {
        return super.salario * 0.2;
    }

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }
}
