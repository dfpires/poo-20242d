package br.edu.fatecfranca.exe0;
public class Gerente extends Funcionario{
    private float bonus;
    public Gerente(){
        super(); // chama construtor sem parâmetros da superclasse
        this.bonus = 0;
    }
    public Gerente(String nome, String endereco, String cpf, float salario, float bonus) {
        super(nome, endereco, cpf, salario); // chama construtor com parâmetros da superclasse
        this.bonus = bonus;
    }
    public float getBonus() {
        return bonus;
    }
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    @Override // anulação de método herdado
    public String toString() {
        return "Gerente{" +
                "bonus=" + bonus +
                super.toString() +
                '}';
    }
    @Override // anulação de método herdado
    public float calculaSalario() {
        return salario + bonus;
    }
}
