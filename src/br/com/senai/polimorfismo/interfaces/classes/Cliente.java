package br.com.senai.polimorfismo.interfaces.classes;

public class Cliente implements Autenticavel {
    private AltenticacaoUltil autenticador;

    public Cliente() {
        this.autenticador = new AltenticacaoUltil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autenticaSenha(int senha) {
        return this.autenticador.autenticaSenha(senha);
    }
}
