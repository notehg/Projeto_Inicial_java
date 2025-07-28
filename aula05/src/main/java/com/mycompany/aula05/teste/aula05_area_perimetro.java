/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05.teste;
import javax.crypto.*;
import java.util.Scanner;

/**
 *
 * @author Felipe Soares Silva
 */
public class aula05_area_perimetro {
    public static void main(String[] args){
        double base,altura,area,perimetro;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a base do retangulo: ");
        base = entrada.nextDouble();
        
        System.out.println("Digite a altura do retangulo: ");
        altura = entrada.nextDouble();
        
        area = base * altura;
        perimetro = 2 *(base + altura);
        
        System.out.println("Os resultados sao: ");
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        
        entrada.close();

    
    }
    
}
