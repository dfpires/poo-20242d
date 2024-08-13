package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.Cliente;

import javax.swing.*;

public class MainCliente {
    public static void main(String args[]){
        Cliente obj1 = new Cliente(123, 456, "José", 0);

        String dep = JOptionPane.showInputDialog("Informe valor do depósito");
        // converte String em float
        obj1.depositar(Float.parseFloat(dep));
        String saq = JOptionPane.showInputDialog("Informe valor do saque");
        // converte String em float
        obj1.sacar(Float.parseFloat(saq));

        JOptionPane.showMessageDialog(null, obj1.toString());
    }
}
