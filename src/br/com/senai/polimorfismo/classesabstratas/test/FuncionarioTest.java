package br.com.senai.polimorfismo.classesabstratas.test;

import br.com.senai.polimorfismo.classesabstratas.classes.ControleDeBonificacao;
import br.com.senai.polimorfismo.classesabstratas.classes.Designer;
import br.com.senai.polimorfismo.classesabstratas.classes.EditorDeVideo;
import br.com.senai.polimorfismo.classesabstratas.classes.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        EditorDeVideo editorDeVideo = new EditorDeVideo();
        Designer designer = new Designer();
        ControleDeBonificacao controle = new ControleDeBonificacao();

        gerente.setSalario(200);
        editorDeVideo.setSalario(200);
        designer.setSalario(200);

        controle.registraBonificacao(gerente);
        controle.registraBonificacao(editorDeVideo);
        controle.registraBonificacao(designer);
        System.out.println(controle.getSoma());

    }
}
