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
public class WhileExercicio2 {

    public static void main(String[] args) {

        int x, y;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite o X");
        x = scr.nextInt();
        System.out.println("Digite o Y");
        y = scr.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }

            System.out.println("Digite o X");
            x = scr.nextInt();
            System.out.println("Digite o Y");
            y = scr.nextInt();
        }
        scr.close();
    }

}
