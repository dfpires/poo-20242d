package br.edu.fatecfranca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // instancia 2 objetos
       Carro obj1 = new Carro("GM", "Onix", "branca", 2022, 0);
       Carro obj2 = new Carro("Fiat", "Palio", "preta", 2012, 0);

       // os métodos são chamados pelos objetos
        obj1.acelerar(50);
        obj1.frear(20);
        obj1.frear(20);
        obj1.frear(20);
        System.out.println(obj1.toString());

        obj2.acelerar(80);
        obj2.frear(30);
        obj2.frear(30);
        obj2.frear(30);
        System.out.println(obj2.toString());

        Carro obj3 = new Carro();
      //  obj3.acelerar();
    }
}