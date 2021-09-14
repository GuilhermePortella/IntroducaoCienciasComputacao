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
public class Execicio1 {

    public static void main(String[] args) {

        int num;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = scr.nextInt();

        if (num >= 0) {
            System.out.println("Não Negativo");
        } else {
            System.out.println("Negativo");
        }
    }
}
