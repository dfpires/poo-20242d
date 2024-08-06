package br.edu.fatecfranca;

public class Carro {
    // declaração das varáiveis
    public String marca, modelo, cor;
    public int ano;
    // criando o método construtor e declarando os parâmetros do método
    public Carro(String marca, String modelo, String cor, int ano){
        // atribuindo os valores passados no parâmetro para o objeto que chama o construtor
        this.marca = marca; this.modelo = modelo;
        this.cor = cor; this.ano = ano;
    }
    // método vai acelerar
    public void acelerar(){
        System.out.println("Objeto acelerando ..." + this.marca + " " + this.modelo);
    }
    public void frear(){
        System.out.println("Objeto freando ..." + this.marca + " " + this.modelo);
    }
}
