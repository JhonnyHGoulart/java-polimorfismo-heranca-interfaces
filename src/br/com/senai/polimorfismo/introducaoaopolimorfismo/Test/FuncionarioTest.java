package br.com.senai.polimorfismo.introducaoaopolimorfismo.Test;

import br.com.senai.polimorfismo.introducaoaopolimorfismo.classes.ControleDeBonificacao;
import br.com.senai.polimorfismo.introducaoaopolimorfismo.classes.EditorDeVideo;
import br.com.senai.polimorfismo.introducaoaopolimorfismo.classes.Funcionario;
import br.com.senai.polimorfismo.introducaoaopolimorfismo.classes.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
        EditorDeVideo editor = new EditorDeVideo();
        ControleDeBonificacao controle = new ControleDeBonificacao();

        funcionario.setSalario(2000);
        gerente.setSalario(5000);
        editor.setSalario(2500);

        controle.registraBonificacao(gerente);
        controle.registraBonificacao(funcionario);
        controle.registraBonificacao(editor);

        System.out.println(controle.getSoma());
    }
}
