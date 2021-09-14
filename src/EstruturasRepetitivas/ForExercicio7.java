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
public class ForExercicio7 {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Digite");
        int n = scr.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }
        scr.close();
    }
}
