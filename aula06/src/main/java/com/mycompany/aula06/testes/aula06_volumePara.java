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
public class aula06_volumePara {
    public static void main(String[]args){
        double compr,larg,alt,volume;
        
        compr = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do paralelepipedo: "));
        larg = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do paralelepipedo: "));
        alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do paralelepipedo: "));
        
        volume = compr*larg*alt;
        
        JOptionPane.showMessageDialog(null, "Valores e volume"+
                "Comprimento: " + compr +"\n"+
                "Largura: " + larg+"\n"+
                "Altura: " +alt+"\n"+
                "Volume: " +volume);
        
    }
    
}
