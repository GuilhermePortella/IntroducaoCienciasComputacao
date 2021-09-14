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
public class ForExercicio4 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();

        for (int i = 0; i < n; i++) {

            int x = scr.nextInt();
            int y = scr.nextInt();

            if (y == 0) {
                System.out.println("dicisao impossivel");

            } else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }

        }
        scr.close();

    }

}
