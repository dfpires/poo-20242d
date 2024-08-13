package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.Aluno;

public class MainAluno {
    public static void main(String args[]){
        Aluno obj1 = new Aluno(234567, 19, "Pedro", 8.5f, 7.5f);
        System.out.println(obj1.toString());

        Aluno obj2 = new Aluno(1111, 20, "João", 5.0f, 4.5f);
        System.out.println(obj2.toString());

    }
}
