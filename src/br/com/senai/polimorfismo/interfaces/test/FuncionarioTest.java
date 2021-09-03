package br.com.senai.polimorfismo.interfaces.test;

import br.com.senai.polimorfismo.interfaces.classes.*;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        EditorDeVideo editorDeVideo = new EditorDeVideo();
        Designer designer = new Designer();
        Administrador administrador = new Administrador();
        Cliente cliente = new Cliente();

        ControleDeBonificacao controle = new ControleDeBonificacao();
        SistemaInterno sistemaInterno = new SistemaInterno();

        gerente.setSenha(2222);
        gerente.setSalario(5000);
        sistemaInterno.autentica(gerente);

        administrador.setSenha(2222);
        administrador.setSalario(4000);
        sistemaInterno.autentica(administrador);

        controle.registraBonificacao(gerente);
        controle.registraBonificacao(editorDeVideo);
        controle.registraBonificacao(designer);
        System.out.println(controle.getSoma());

    }
}
