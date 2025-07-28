package com.mycompany.aula05.teste;

import java.util.Scanner;

public class aula05_teste {
    public static void main(String[] args) {
        
        String nome;
        char sexo;
        float altura;
        int idade;
        //criação de objeto scanner para entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um nome: "); //saida pedido digitação
        nome = entrada.nextLine(); // entrada e salvamento do dado digitado na variavel nome
        
        System.out.print("Digite o sexo do usuário (M/F): ");
        sexo = entrada.next().charAt(0);
        
        System.out.print("Digite a altura: ");
        altura = entrada.nextFloat();
        
        System.out.print("Digite a idade do usuário: ");
        idade = entrada.nextInt();
        
        System.out.println("\n===== Dados do Usuário =====");
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.printf("Altura: %.2f\n", altura); // saida dos valores inseridos
        System.out.println("Idade: " + idade);
        
        entrada.close();
    }
}
