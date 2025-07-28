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
public class aula06_teste {
    public static void main(String[]args){
        int n1,n2,soma,sub,mult;
        double div;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para efetuar suas operacoes: ")); // parse e tipo de dado
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero para efetuar as operacoes: "));
        
        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = (double) n1/n2;
        
        JOptionPane.showMessageDialog(null,
                "Resultados" + "\n"+
                "Soma: " + soma +"\n"+
                "Subtracao: " + sub +"\n"+
                "Multiplicacao: " + mult +"\n"+
                "Divisao:"+ div+ "\n"); 
        
    }
    
}
