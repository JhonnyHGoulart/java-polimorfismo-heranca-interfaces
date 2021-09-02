package br.com.senai.polimorfismo.classesabstratas.classes;

public class Designer extends Funcionario {
    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do Designer");
        return 200;
    }
}
