package br.edu.fatecfranca.exe0;
public class Aluno {
    private String nome;
    private long ra;
    private float media;
    public Aluno() {
    }
    public Aluno(String nome, long ra, float media) {
        this.setNome(nome);
        this.setRa(ra);
        this.setMedia(media);
    }
    // setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRa(long ra){
        // converte long para String
        String auxiliar = String.valueOf(ra);
        if (ra > 0 && auxiliar.length() == 8){
            this.ra = ra;
        }
        else {
            throw new IllegalArgumentException("Ra deve ter 8 dígitos e ser positivo");
        }
    }
    public void setMedia(float media){
        if (media >= 0 && media <= 10){
            this.media = media;
        }
        else {
            throw new IllegalArgumentException("Média deve estar entre 0 e 10");
        }
    }
    // getters
    public long getRa(){
        return this.ra;
    }
    public String getNome(){
        return this.nome;
    }
    public float getMedia(){
        return this.media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra=" + ra +
                ", media=" + media +
                '}';
    }
}
