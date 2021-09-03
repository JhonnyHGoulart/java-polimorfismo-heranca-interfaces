package br.com.senai.polimorfismo.interfaces.classes;

public class ControleDeBonificacao {
    private double soma;

    public void registraBonificacao(Funcionario funcionario) {
        double boni = funcionario.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return this.soma;
    }
}
