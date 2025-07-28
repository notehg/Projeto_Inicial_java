/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06.testes;
import javax.swing.*;

/**
 *
 * @author Felipe Soares Silva
 */
public class aula06_promocao {
    public static void main(String[]args){
        String nome;
        double preco;
        double preco_promo;
        
        nome = JOptionPane.showInputDialog("Digite o nome do produto :");
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto"));
        
       preco_promo = preco - preco*0.05;
       
       JOptionPane.showMessageDialog(null,
    "Nome: " + nome + "\n" +
    String.format("Preço: %.2f\n", preco) +
    String.format("Preço promocional: %.2f", preco_promo));
    }
    
}
