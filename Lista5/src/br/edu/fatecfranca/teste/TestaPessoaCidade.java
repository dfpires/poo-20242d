package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe1.Cidade;
import br.edu.fatecfranca.exe1.Empregado;
import br.edu.fatecfranca.exe1.Pessoa;

public class TestaPessoaCidade {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Cidade cidade = new Cidade();
        cidade.alimenta(pessoa);
        cidade.cobraDe(pessoa);
        cidade.contrata(pessoa);
        cidade.contrata((Empregado)pessoa);
        cidade.registra(pessoa);

    }
}
