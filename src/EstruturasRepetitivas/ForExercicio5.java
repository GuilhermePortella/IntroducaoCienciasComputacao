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
public class ForExercicio5 {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Digite");
        int N = scr.nextInt();
        
        int fat = 1;
        for (int i = 1; i <= N; i++) {
            fat = fat * i;
        }
        System.out.println(fat);
        scr.close();
    }
}
