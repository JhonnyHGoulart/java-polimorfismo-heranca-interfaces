package br.com.senai.polimorfismo.interfaces.classes;

public class Gerente extends Funcionario implements Autenticavel {
    private AltenticacaoUltil autenticador;

    public Gerente(){
        this.autenticador = new AltenticacaoUltil();
    }

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do gerente");
        return 200;
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
