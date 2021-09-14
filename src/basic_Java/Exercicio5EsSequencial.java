/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_Java;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Exercicio5EsSequencial {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        int pc1, numPc1, pc2, numPc2;
        double vlPc1, vlPc2;
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Digite o numero da peca: ");
        pc1 = scr.nextInt();
        System.out.println("Digite o numeros de pecas: ");
        numPc1 = scr.nextInt();
        System.out.println("O valor unitario da peca: ");
        vlPc1 = scr.nextDouble();
        
        System.out.println("Digite o numero da peca: ");
        pc2 = scr.nextInt();
        System.out.println("Digite o numeros de pecas: ");
        numPc2 = scr.nextInt();
        System.out.println("O valor unitario da peca: ");
        vlPc2 = scr.nextDouble();
        
        System.out.println("VALOR A PAGAR: " + (numPc1 * vlPc1 + numPc2 * vlPc2));
        scr.close();
    }
}
