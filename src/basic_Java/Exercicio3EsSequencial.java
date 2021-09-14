/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_Java;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Exercicio3EsSequencial {

    public static void main(String[] args) {

        int A, B, C, D;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite quatro valores: ");
        A = scr.nextInt();
        B = scr.nextInt();
        C = scr.nextInt();
        D = scr.nextInt();

        System.out.println("DIFERENCA" + (A * B - C * D));
    }
}
