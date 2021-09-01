package br.com.senai.polimorfismo.reescritademetodos.test;

import br.com.senai.polimorfismo.reescritademetodos.classes.Funcionario;
import br.com.senai.polimorfismo.reescritademetodos.classes.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Jhonnt", "789456-1", 3000, 2222);
        Funcionario funcioanrio = new Funcionario("João", "123456-7", 2500);

        System.out.println(gerente.autenticaSenha(5555));
        System.out.println(gerente.getBonificacao());
        System.out.println(funcioanrio.getBonificacao());
    }
}
