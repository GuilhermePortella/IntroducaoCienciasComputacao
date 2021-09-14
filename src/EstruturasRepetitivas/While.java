/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class While {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int x = scr.nextInt();
        
        int soma = 0;
        while(x != 0){
            soma += x;
            x = scr.nextInt();
        }
        
        System.out.println(soma);
        scr.close();
    }
}
