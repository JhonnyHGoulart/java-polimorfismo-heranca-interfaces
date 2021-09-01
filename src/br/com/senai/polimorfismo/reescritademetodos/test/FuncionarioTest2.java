package br.com.senai.polimorfismo.reescritademetodos.test;

import br.com.senai.polimorfismo.reescritademetodos.classes.Funcionario2;
import br.com.senai.polimorfismo.reescritademetodos.classes.Gerente2;

public class FuncionarioTest2 {
    public static void main(String[] args) {
        Funcionario2 funcioanrio = new Funcionario2();
        Gerente2 gerente = new Gerente2();

        gerente.setSalario(3000);
        funcioanrio.setSalario(2500);

        System.out.println(gerente.bonificacao());
        System.out.println(funcioanrio.bonificacao());
    }
}
