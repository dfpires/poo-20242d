package br.edu.fatecfranca.exe0;

public class AtletaVoleiBasquete implements IJogadorVolei, IJogadorBasquete{

    @Override
    public void arremessar() {
        System.out.println("Atleta de Basquete arremessou");
    }

    @Override
    public void cobrarLanceLivre() {
        System.out.println("Atleta de Basquete cobrou Lance Livre");
    }

    @Override
    public void sacar() {
        System.out.println("Atleta de Volei sacou");
    }

    @Override
    public void levantar() {
        System.out.println("Atleta de Volei levantou");
    }
}
