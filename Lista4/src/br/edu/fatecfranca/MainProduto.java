package br.edu.fatecfranca;

import br.edu.fatecfranca.exe4.Produto;
import br.edu.fatecfranca.exe4.Radio;
import br.edu.fatecfranca.exe4.Tv;

public class MainProduto {
    public static void main(String[] args) {
        Produto prod;
        prod = new Radio(111, 222, 96.5f, "FM");
        prod.testaUnidade();
        System.out.println(prod); // chama toString() da classe Radio

        prod = new Tv(888, 999, 539);
        prod.testaUnidade();
        System.out.println(prod); // chama toString() da classe Tv
    }
}
