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
public class Exercicio1EsSequencial {

    public static void main(String[] args) {
        double valorA, valorB, soma;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        valorA = scr.nextDouble();
        System.out.println("Digite o segundo valor: ");
        valorB = scr.nextDouble();

        soma = valorA + valorB;

        System.out.println("O resultado da soma é: " + soma);

    }

}
