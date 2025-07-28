/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05.teste;
import java.util.Scanner;

/**
 *
 * @author Felipe Soares Silva
 */
public class aula05_area_circ_scanner {
    public static void main(String[]args){
    double area,raio;
    double pi = 3.14;
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Digite o valor do raio do cilindro: ");
    raio = entrada.nextDouble();
    
    area = pi *(raio*raio);
    
    System.out.println("O resultado da operacap e:");
    System.out.println("Area: " + area);
    
    }
    
}
