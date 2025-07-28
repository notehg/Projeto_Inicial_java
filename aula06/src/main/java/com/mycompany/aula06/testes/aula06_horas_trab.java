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
public class aula06_horas_trab {
    public static void main(String[]args){
        int horas;
        double salario,salhora;
        
        
        horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas :"));
        salhora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor recebido por hora trabalhada :"));
        salario = salhora* horas;
        
        JOptionPane.showMessageDialog(null,
                "Salario a receber por horas trabalhadas : " + salario);
    }
    
}
