package br.edu.fatecfranca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // instancia 2 objetos
       Carro obj1 = new Carro("GM", "Onix", "branca", 2022);
       Carro obj2 = new Carro("Fiat", "Palio", "preta", 2012);

       // os métodos são chamados pelos objetos
        obj1.acelerar();
        obj2.frear();
    }
}