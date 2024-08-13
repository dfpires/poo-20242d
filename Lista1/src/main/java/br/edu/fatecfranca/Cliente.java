package br.edu.fatecfranca;
public class Cliente {
    public int nroConta, nroAgencia;
    public String nome;
    public float saldo;
    public Cliente(){}
    public Cliente(int nroConta, int nroAgencia, String nome, float saldo){
        this.nroConta = nroConta; this.nroAgencia = nroAgencia;
        this.nome = nome; this.saldo = saldo;
    }
    public void depositar(float x){
        this.saldo += x;
        System.out.println("Depósito realizado com sucesso");
    }
    public void sacar(float x){
        if (this.saldo - x >= 0) {
            this.saldo -= x;
            System.out.println("Saque realizado com sucesso");
        }
        else {
            System.out.println("Saque não realizado, saldo insuficiente");
        }
    }
    public String toString(){
        return "Nro conta: " + this.nroConta + " Nome: " + this.nome +
                " Saldo: " + this.saldo;
    }
}
