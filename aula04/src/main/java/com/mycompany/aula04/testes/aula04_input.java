/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04.testes;
import javax.swing.JOptionPane;  //importação da biblioteca especifica
import javax.swing.*; //importa todos os codigos de bibliotecas usados no projetoS


/**
 *
 * @author Felipe Soares Silva
 */
public class aula04_input {
    public static void main(String[]srgs){
       //criação de variaveis 
       int codigo;
        String descricao;
        double preco,precototal;
        int quantidade;

        // Entrada de dados
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
        descricao = JOptionPane.showInputDialog("Digite uma descrição para o produto:");
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite um preço para o produto:"));
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto:"));

        precototal = preco * quantidade;
        // Saída formatada com os dados
        JOptionPane.showMessageDialog(null, 
            "Informações do produto:\n" +
            "Código: " + codigo + "\n" +
            "Descrição: " + descricao + "\n" +
            "Preço: R$ " + preco + "\n" +
            "Quantidade: " + quantidade + "\n" +
            "Preco total: " + precototal
        );
    }
        
        
    }
    

