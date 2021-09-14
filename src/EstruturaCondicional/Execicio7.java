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
public class Execicio7 {

    public static void main(String[] args) {

        double x, y;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite o valor X");
        x = scr.nextDouble();
        System.out.println("Digite o valor Y");
        y = scr.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");

        } else if (x > 0 && y > 0) {
            System.out.println("Q1");

        } else if (x > 0 && y < 0) {
            System.out.println("Q4");

        } else if (x < 0 && y > 0) {

            System.out.println("Q2");
        } else if (x < 0 && y < 0) {

            System.out.println("Q3");
        }
    }
}
