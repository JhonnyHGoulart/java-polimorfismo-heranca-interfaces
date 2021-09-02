package br.com.senai.polimorfismo.classesabstratas.classes;

public class Gerente extends Funcionario {
    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do gerente");
        return 200;
    }
}
