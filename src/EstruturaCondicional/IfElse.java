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
public class IfElse {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int x = scr.nextInt();
        String dia;

        if (x == 1) {
            dia = "Domingo";
        } else if (x == 2) {
            dia = "Segunda";
        } else if (x == 3) {
            dia = "Terça";
        } else if (x == 4) {
            dia = "Quarta";
        } else if (x == 5) {
            dia = "Quinta";
        } else if (x == 6) {
            dia = "Sexta";
        } else if (x == 7) {
            dia = "Sebado";
        } else {
            dia = "invalido";
        }

        System.out.println("Dia da semana " + dia);
        scr.close();
    }

}
