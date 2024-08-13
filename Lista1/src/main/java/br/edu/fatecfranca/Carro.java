package br.edu.fatecfranca;

public class Carro {
    // declaração das varáiveis
    public String marca, modelo, cor;
    public int ano;
    public float velAtual;
    // criando o método construtor e declarando os parâmetros do método
    public Carro(){
        this.marca = "não definida"; this.modelo = "não definido";
        this.velAtual = 0;
    }
    public Carro(String marca, String modelo, String cor, int ano, float velAtual){
        // atribuindo os valores passados no parâmetro para o objeto que chama o construtor
        // this representa o objeto que chama o construtor
        this.marca = marca; this.modelo = modelo;
        this.cor = cor; this.ano = ano;
        this.velAtual = velAtual;
    }
    // método vai acelerar
    public void acelerar(float x){
        this.velAtual = this.velAtual + x;
        System.out.println("Objeto acelerando ..." +
                this.marca + " " + this.modelo + " " + this.velAtual);
    }
    public void frear(float x){
        if (this.velAtual >= x) {
            this.velAtual = this.velAtual - x;
            System.out.println("Objeto freando ..." +
                    this.marca + " " + this.modelo + " " + this.velAtual);
        }
        else{
            System.out.println("objeto não pode ter velocidade negativa");
        }
    }
    // converte objeto para String
    public String toString(){
        return "Marca: " + this.marca + " Modelo: " + this.modelo +
                "Cor: " + this.cor + " Ano: " + this.ano + " Vel atual: " + this.velAtual;
    }
}
