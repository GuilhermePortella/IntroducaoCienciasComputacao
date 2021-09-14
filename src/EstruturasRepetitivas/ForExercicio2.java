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
public class ForExercicio2 {

    public static void main(String[] args) {

        int n;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite um valor");
        n = scr.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int x = scr.nextInt();
            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
