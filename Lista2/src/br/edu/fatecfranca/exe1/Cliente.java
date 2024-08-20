package br.edu.fatecfranca.exe1;
public class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo;

    public Cliente() {
    }

    public Cliente(String nroConta, String nroAgencia, String nome, float saldo) {
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public String getNroConta() {
        return nroConta;
    }

    public void setNroConta(String nroConta) {
        if (nroConta.length() == 8) {
            if (nroConta.charAt(6) == '-') {
                this.nroConta = nroConta;
            } else {
                throw new IllegalArgumentException("Problema com dígito verificador");
            }
        }
        else {
            throw new IllegalArgumentException("Problema com tamanho");
        }
    }

    public String getNroAgencia() {
        return nroAgencia;
    }

    public void setNroAgencia(String nroAgencia) {
        if (nroAgencia.length() == 6) {
            if (nroAgencia.charAt(4) == '-') {
                this.nroAgencia = nroAgencia;
            } else {
                throw new IllegalArgumentException("Problema com dígito verificador");
            }
        }
        else {
            throw new IllegalArgumentException("Problema com tamanho");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else {
            throw new IllegalArgumentException("Problema com tamanho, não pode passar de 30");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else {
            System.out.println("Saldo não pode ser negativo");
        }
    }

    public void depositar(float x){
        this.setSaldo(this.saldo + x);
    }
    public void sacar(float x) {
        this.setSaldo(this.saldo - x);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nroConta='" + nroConta + '\'' +
                ", nroAgencia='" + nroAgencia + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
