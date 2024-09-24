package br.edu.fatecfranca.exe4;
public class Radio extends Produto{
    private float estacao;
    private String banda;
    public Radio(){
        super();
    }
    public Radio(int serial, int volume, float estacao, String banda){
        super(serial, volume);
        this.estacao = estacao;
        this.banda = banda;
    }
    public float getEstacao() {
        return estacao;
    }
    public void setEstacao(float estacao) {
        this.estacao = estacao;
    }
    public String getBanda() {
        return banda;
    }
    public void setBanda(String banda) {
        this.banda = banda;
    }
    public String toString(){
        return super.toString() + "\nestacao: " + estacao + "\nbanda: " + banda;
    }
}