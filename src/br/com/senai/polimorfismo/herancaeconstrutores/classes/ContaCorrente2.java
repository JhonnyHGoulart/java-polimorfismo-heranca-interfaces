package br.com.senai.polimorfismo.herancaeconstrutores.classes;

public class ContaCorrente2 extends Conta2 {

    @Override
    public boolean sacar(double valor) {
        double valorASacar = valor + 0.2;
        return super.sacar(valorASacar);
    }
}
