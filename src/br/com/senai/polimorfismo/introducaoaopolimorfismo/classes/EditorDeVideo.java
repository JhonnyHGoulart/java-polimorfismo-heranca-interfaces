package br.com.senai.polimorfismo.introducaoaopolimorfismo.classes;

public class EditorDeVideo extends Funcionario {
    @Override
    public double bonificacao() {
        System.out.println("Chamando o método de bonificacao do editor");
        return super.bonificacao() + 100;
    }
}
