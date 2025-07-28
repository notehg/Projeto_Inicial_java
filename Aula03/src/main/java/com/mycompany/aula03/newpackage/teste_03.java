/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula03.newpackage;

/**
 *
 * @author Felipe Soares Silva
 */
public class teste_03 {
    public static void main(String[]args){ //declaração de main ou principal
        //declaração de variaveis
        String nome; //valor de String é uma array e tipo de dado customizado
        int idade;
        double peso;
        float altura;
        char sexo;
        boolean saida;
        
        //inicialização com valores
        nome = "Felipe Silva";
        idade = 19;
        peso = 80.10;
        altura = (float) 1.75; //Conversão para valor float comumente usado para numeros reais
        sexo = 'M'; //uso de aspas simples para variaveis de tipo char
        final double  pi = 3.14;  //final rpresenta uma constante ou seja seu valor não pode ser alterado
        saida = false;
        
        System.out.println("Nome: " + nome); //Println serve para exibir saida de dado e pula para a proxima linha
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " +peso);
        System.out.println("Altura: " +altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("Valor de PI: " + pi);
        System.out.println("Valor de saida e:" + saida);
    
    }
    
}
