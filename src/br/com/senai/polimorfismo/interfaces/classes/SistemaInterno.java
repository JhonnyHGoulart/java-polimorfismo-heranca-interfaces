package br.com.senai.polimorfismo.interfaces.classes;

public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Autenticavel funcionario) {
        boolean autenticou = funcionario.autenticaSenha(this.senha);
        if (autenticou) {
            System.out.println("Login Válido!");
        } else {
            System.out.println("Login Inválido!");
        }
    }
}
