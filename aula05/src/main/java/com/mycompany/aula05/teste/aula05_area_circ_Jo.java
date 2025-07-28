/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05.teste;
import javax.swing.*;
/**
 *
 * @author Felipe Soares Silva
 */
public class aula05_area_circ_Jo {
    public static void main(String[]args){
        double area,raio;
        
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio"));
        
        area = Math.PI * Math.pow(raio,2);  // expressão matematica e constates
        
        JOptionPane.showMessageDialog(null,
                "O resultado do calculo e suas informações são" + "\n"+
                "Raio: " + raio + "\n" +
                "PI: " + pi + "\n" +
                "Area: " + area +"\n"+
                "Operacao: " + pi + "*" + "(" + raio  + "*"+ raio+ ") = " + area );
    }
    
}
