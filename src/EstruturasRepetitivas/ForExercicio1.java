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
public class ForExercicio1 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite um valor");

        int x = scr.nextInt();

        for (int i = 0; i < x; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scr.close();
    }
}
