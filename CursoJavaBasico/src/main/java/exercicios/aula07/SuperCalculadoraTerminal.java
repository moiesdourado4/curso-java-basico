/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.aula07;

import java.util.Scanner;


public class SuperCalculadoraTerminal {
    public static void main(String[] args) {
        // Criamos o scanner para "escutar" o terminal
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("========== SUPER CALCULADORA ==========");
        System.out.print("Digite um valor inteiro: ");
        
        // Lê o número que o utilizador digitar no terminal
        int num = teclado.nextInt(); 
        
        System.out.println("---------------------------------------");
        System.out.println("Resultados para o valor " + num + ":");
        
        // 1. Resto da Divisão por 2
        int resto = num % 2;
        System.out.println("Resto da Divisão por 2: " + resto);
        
        // 2. Elevado ao Cubo (Usando Math.pow)
        double cubo = Math.pow(num, 3);
        System.out.println("Elevado ao Cubo: " + cubo);
        
        // 3. Raiz Quadrada (Usando Math.sqrt e formatando para 2 casas)
        double raizQuadrada = Math.sqrt(num);
        System.out.printf("Raiz Quadrada: %.2f \n", raizQuadrada); 
        
        // 4. Raiz Cúbica (Usando Math.cbrt e formatando para 2 casas)
        double raizCubica = Math.cbrt(num);
        System.out.printf("Raiz Cúbica: %.2f \n", raizCubica);
        
        // 5. Valor Absoluto (Usando Math.abs)
        int valorAbsoluto = Math.abs(num);
        System.out.println("Valor Absoluto: " + valorAbsoluto);
        
        System.out.println("=======================================");
        
        // Boa prática: Fechar o teclado no fim
        teclado.close(); 
    }
}
