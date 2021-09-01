package br.com.senai.polimorfismo.introducaoaopolimorfismo.classes;

public class Gerente extends Funcionario {

    @Override
    public double bonificacao() {
        System.out.println("Chamando o método de bonificacao do gerente");
        return super.bonificacao() + super.getSalario();
    }
}
