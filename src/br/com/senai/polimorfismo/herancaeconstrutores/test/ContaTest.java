package br.com.senai.polimorfismo.herancaeconstrutores.test;

import br.com.senai.polimorfismo.herancaeconstrutores.classes.Conta;
import br.com.senai.polimorfismo.herancaeconstrutores.classes.ContaCorrente;
import br.com.senai.polimorfismo.herancaeconstrutores.classes.ContaPoupanca;

public class ContaTest {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 23334);
        ContaCorrente contaCorrente = new ContaCorrente(111, 111);
        ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);

        contaCorrente.deposita(200);
        contaPoupanca.deposita(200);
        System.out.println(contaCorrente.getSaldo());
        System.out.println(contaPoupanca.getSaldo());
        System.out.println("o total de contas é : " + Conta.getTotal());
    }
}
