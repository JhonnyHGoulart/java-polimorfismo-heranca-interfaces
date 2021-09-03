package br.com.senai.polimorfismo.interfaces.classes;

public class Administrador extends Funcionario implements Autenticavel {
    private int senha;

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método bonificacao do Administrador");
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticaSenha(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}
