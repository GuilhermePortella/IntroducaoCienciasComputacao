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
public class WhileExercicio3 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0;

        System.out.println("Digite o seu consbustivel");
        int tipo = scr.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool = alcool + 1;

            } else if (tipo == 2) {
                gasolina = gasolina + 1;

            } else if (tipo == 3) {
                diesel = diesel + 1;

            }

            tipo = scr.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool " + alcool);
        System.out.println("Gasolina " + gasolina);
        System.out.println("Diesel " + diesel);

        scr.close();
    }

}
