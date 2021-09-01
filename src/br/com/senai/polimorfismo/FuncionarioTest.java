package br.com.senai.polimorfismo;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", "789456-52", 5000, 192837);
        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getTipo());
        gerente.setSenha(2222);
        System.out.println(gerente.autentica(2222));

    }
}
