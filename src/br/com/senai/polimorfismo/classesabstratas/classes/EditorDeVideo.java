package br.com.senai.polimorfismo.classesabstratas.classes;

public class EditorDeVideo extends Funcionario {
    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do editor");
        return 100;
    }
}
