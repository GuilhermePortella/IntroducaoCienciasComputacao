/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_Java;

import java.util.Scanner;

public class SomaSimplesConsole {
    
    public static void main(String[] args) {
        int numero1, numero2, soma;
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro numero inteiro: ");
        numero1 = scr.nextInt();
        System.out.println("Entre com o segundo numero inteiro: ");
        numero2 = scr.nextInt();
        
        soma = numero1 + numero2;
        System.out.printf("A soma de %d e %d resulta em %d%n", numero1,numero2,soma);
    }
}
