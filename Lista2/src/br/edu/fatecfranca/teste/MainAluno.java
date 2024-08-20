package br.edu.fatecfranca.teste;
import br.edu.fatecfranca.exe0.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainAluno {
    public static void main(String[] args) {

        try {
            Aluno obj1 = new Aluno("Pedro", 123, 8.4f);

            Aluno obj2 = new Aluno();
            obj2.setNome("Lucas");
            obj2.setRa(23456752);
            obj2.setMedia(8.9f);

            System.out.println("Ra " + obj2.getRa());

            Aluno obj3 = new Aluno();
            obj3.setRa(12345678);
            obj3.setMedia(2);
            obj3.setNome("Tiago");
            System.out.println(obj3);

            Aluno obj4 = new Aluno("Mateus", 123, -5);
            System.out.println(obj4);

        }
        catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}