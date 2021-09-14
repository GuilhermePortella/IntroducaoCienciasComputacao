/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaCondicional;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Execicio3 {
    
    public static void main(String[] args) {
        
        int a, b;
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        a = scr.nextInt();
        System.out.println("Digite um numero: ");
        b = scr.nextInt();
        
        if (a % b == 0 || b % a == 0) {
            System.out.println("São Multiplos");
        }else 
            System.out.println("Não são multiplos");
    }
}
