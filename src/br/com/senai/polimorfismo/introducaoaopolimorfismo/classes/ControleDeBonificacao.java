package br.com.senai.polimorfismo.introducaoaopolimorfismo.classes;

public class ControleDeBonificacao {
    private double soma;

    public void registraBonificacao(Funcionario funcionario) {
        double boni = funcionario.bonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return this.soma;
    }
}
