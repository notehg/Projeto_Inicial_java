/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04.testes;

/**
 *
 * @author Felipe Soares Silva
 */
public class aula04_produto_teste {
    public static void main(String[]args){
    
   int codigo = 01;
   String descricao = "livro de distopia";
   double preco = 34.50;
   int quantidade = 1;
   
   System.out.println("O codigo do pedido e: " +codigo);
   System.out.println("O tipo do produto e: " + descricao);
   System.out.println(String.format("O valor do produto com o frete e: %.2f reais ", preco));
   System.out.println("A quantidade e: " +quantidade);
    
    }
    
}
