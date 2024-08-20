package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe1.Cliente;

public class MainCliente {
    public static void main(String[] args){
        // opção 1
        Cliente obj1 = new Cliente();
        try {
            obj1.setNome("Carlos");
        }
        catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
        }
        try {
            obj1.setNroAgencia("123435");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            obj1.setNroConta("12345697");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            obj1.setSaldo(0);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
            obj1.depositar(1000);
            obj1.sacar(300);
            System.out.println(obj1);

            // opção 2
            Cliente obj2 =
                    new Cliente("123456-7", "1234-5", "Carlos", 0);

            obj2.depositar(1000);
            obj2.sacar(1200);
            System.out.println(obj2);

            if (obj1.equals(obj2)) {
                System.out.println("são iguais");
            } else {
                System.out.println("São diferentes");
            }
        }


}
