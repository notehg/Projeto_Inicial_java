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
public class aula05_area_perimetro_jo {
    public static void main(String[]args){
        
    double altura,base,area,perimetro;
    
    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
    base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base"));
    
    area = base * altura;
    perimetro = 2*(base+altura);
    
    JOptionPane.showMessageDialog(null,
    "Os resultados sao: "+ "\n"+
    "Area: " + area+ "\n"+
    "Perimetro: " +perimetro
    );
    
    
    
    }
    
}
