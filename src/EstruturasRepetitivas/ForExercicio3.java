/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class ForExercicio3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int n = scr.nextInt();

        for (int i = 0; i < n; i++) {
            double a, b, c, media;

            System.out.println("a");
            a = scr.nextDouble();
            System.out.println("b");
            b = scr.nextDouble();
            System.out.println("c");
            c = scr.nextDouble();

            media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;

            System.out.printf("%.1f%n", media);
        }
        scr.close();
    }
}
