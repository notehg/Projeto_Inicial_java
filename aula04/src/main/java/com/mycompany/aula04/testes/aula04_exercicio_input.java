/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04.testes;

import javax.swing.*;

/**
 *
 * @author Felipe Soares Silva
 */

public class aula04_exercicio_input {
    public static void main(String[]args){
    //declaração de variaveis
    String clientebanco;
    String cpf;
    int conta;
    double saldo;
    String questao;
    
    //Criação de caixa de dialogo para entrada de dado
    clientebanco = JOptionPane.showInputDialog("Digite o nome do cliente atual");
    cpf = JOptionPane.showInputDialog("Digite seu cpf: ");
    conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "));
    saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta"));
    questao = JOptionPane.showInputDialog("Deseja fazer deposito Y/N");
    
    
    
    //chamada do metodo deposito
    if(questao.equalsIgnoreCase ("Y")){
        saldo =deposito(saldo);
    }else if (questao.equalsIgnoreCase("N")){
        JOptionPane.showMessageDialog(null,
        "Tudo bem, vamos prosseguir com o processo");
    }else{
    JOptionPane.showMessageDialog(null,
            "Digite uma resposta valida");   
    }
    
    
    //saida de dado
    JOptionPane.showMessageDialog(null,
            "Informações do cliente:\n" +
            "Cpf: " + cpf + "\n" +
            "Cliente: " + clientebanco + "\n" +
            "Conta:  " + conta + "\n" +
            "Saldo: R$ " + saldo);
    
    }
    
    //criação do metodo deposito
    static double deposito(double saldo){
    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));
    saldo = saldo + valor;
    return saldo;
            
    }
    

}