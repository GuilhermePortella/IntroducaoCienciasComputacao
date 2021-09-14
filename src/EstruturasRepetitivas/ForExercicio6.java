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
public class ForExercicio6 {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        int n = scr.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        scr.close();
    }
}
