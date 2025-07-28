/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula03.newpackage;

/**
 *
 * @author Felipe Soares Silva
 */
public class exercicio_aula {
    public static void main(String[]args){
    /**
    Desenvolver um programa em Java que armazena os dados de uma empresa e apresenta em seguida. O
    programa deve armazenar: o nome da empresa, o endereço, a metragem do imóvel, a quantidade de
    funcionários e o valor anual de faturamento.
    */
    
    String nome_emp = "Claro";
    String endereco = "bairro do Brooklin Novo , em São Paulo";
    double metragem = 400.55;
    int funcionarios = 12000;
    double faturamento = 50000;
    
    System.out.println("nome da empresa: " + nome_emp);
    System.out.println("Endereco:" + endereco);
    System.out.println(String.format("Metragem da empresa: %.2f metros cúbicos", metragem)); // format perimte formatar o numero de casas decimais da saida de dados
    System.out.println("quantidade de funcionarios: " + funcionarios);
    System.out.println("faturamento anual: " + faturamento);
    
    }
    
}
