/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_Java;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Exercicio2EsSequencial {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double raio;
        double pi = 3.14159;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        raio = scr.nextDouble();

        double resultado = pi * Math.pow(raio, 2);

        System.out.printf("A = %.4f%n", resultado);
        scr.close();
    }
}