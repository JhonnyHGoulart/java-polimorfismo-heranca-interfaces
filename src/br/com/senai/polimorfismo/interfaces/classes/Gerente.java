package br.com.senai.polimorfismo.interfaces.classes;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do gerente");
        return 200;
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
