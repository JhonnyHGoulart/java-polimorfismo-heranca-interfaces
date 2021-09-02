package br.com.senai.polimorfismo.herancaeconstrutores.test;

import br.com.senai.polimorfismo.herancaeconstrutores.classes.Cliente2;
import br.com.senai.polimorfismo.herancaeconstrutores.classes.ContaCorrente2;
import br.com.senai.polimorfismo.herancaeconstrutores.classes.ContaPoupanca2;

public class ContaTest2 {
    public static void main(String[] args) {
        ContaPoupanca2 contaPoupanca = new ContaPoupanca2();
        ContaCorrente2 contaCorrente = new ContaCorrente2();
        Cliente2 cliente = new Cliente2();

        contaPoupanca.depositar(200);
        contaCorrente.depositar(200);
        contaCorrente.tranfere(10, contaPoupanca);

        System.out.println(contaPoupanca.getSaldo());
        System.out.println(contaCorrente.getSaldo());
    }
}
