package br.com.senai.polimorfismo.interfaces.classes;

public class AltenticacaoUltil {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticaSenha(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}
