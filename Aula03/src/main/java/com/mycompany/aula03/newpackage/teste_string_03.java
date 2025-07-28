/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula03.newpackage;

/**
 *
 * @author Felipe Soares Silva
 */
public class teste_string_03 {
    public static void main(String[] args){
        String frase = "Qualifica sp";
        
   System.out.println(frase); 
// Mostra o conteúdo da string "frase" no console.

System.out.println(frase.equals("qualifica sp")); 
// Compara se o conteúdo da string "frase" é exatamente igual a "qualifica sp" (diferencia maiúsculas e minúsculas).

System.out.println(frase.equalsIgnoreCase("qualifica sp")); 
// Compara se o conteúdo da string "frase" é igual a "qualifica sp", ignorando maiúsculas e minúsculas.

System.out.println(frase.indexOf("sp")); 
// Retorna a posição (índice) onde a sequência "sp" começa na string. Se não encontrar, retorna -1.

System.out.println(frase.length()); 
// Mostra o número total de caracteres da string (inclui espaços).

System.out.println(frase.toLowerCase()); 
// Converte todos os caracteres da string para letras minúsculas.

System.out.println(frase.toUpperCase()); 
// Converte todos os caracteres da string para letras maiúsculas.

System.out.println(frase.trim()); 
// Remove os espaços em branco do início e do fim da string.

System.out.println(frase.substring(4, 9)); 
// Retorna uma parte da string, do índice 4 até o 8 (o 9 não é incluído).

    
    
       }
    
}
