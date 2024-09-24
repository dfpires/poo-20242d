package br.edu.fatecfranca.exe4;
public class Produto {
    protected int serial, volume;
    protected String teste;
    public Produto() {
        this.serial = 0; this.volume = 0;
        this.teste = "não testado";
    }
    public Produto(int serial, int volume) {
        this.serial = serial;
        this.volume = volume;
        this.teste = "não testado";
    }
    public void testaUnidade(){
        if (this.teste.equals("não testado")){
            int random = (int) (Math.random() * 10); // gera número de 0 a 9
            if (random == 0){ // 10%
                this.teste = "reprovado";
            }
            else { // 90%
                this.teste = "aprovado";
            }
        }
        else {
            System.out.println("Unidade já testada");
        }
    }
    public int getSerial() {
        return serial;
    }
    public void setSerial(int serial) {
        this.serial = serial;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "Produto{" +
                "serial=" + serial +
                ", volume=" + volume +
                ", teste='" + teste + '\'' +
                '}';
    }
}
