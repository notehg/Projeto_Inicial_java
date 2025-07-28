/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04.testes;

import javax.swing.JOptionPane;

/**
 *
 * @author Felipe Soares Silva
 */
public class aula04_exercicio_aritimetica {
    public static void main(String[]args){
    int n1,n2,soma,subtra;
    
    
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para somar e subtrair: "));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
    
    soma = n1+n2;
   
    subtra = n1-n2;
    
        JOptionPane.showMessageDialog(null,
                "Soma: " + n1 + "+" + n2 + "="+ soma + "\n" +
                "Subtracao: " + n1 + "-" + n2 + "=" + subtra);
    }
    
}
