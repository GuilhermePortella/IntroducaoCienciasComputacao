package Exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class UmClass {

    int[] cars = new int[15];
    Random rdon = new Random();
    Scanner scr = new Scanner(System.in);

    public void procedimeto1() {

        for (int i = 0; i < cars.length; i++) {

            

            System.out.println(cars[i]);
        }
    }

    public void manipularArray() {
        int ind;
        int aux;
        System.out.println("Digite um indice para ser alterado");
        ind = scr.nextInt();
        System.out.println("Digite o registro que vc ira registar");
        aux = scr.nextInt();

        cars[ind] = aux;

        System.out.println("Digite o indice alterado");
        int so = scr.nextInt();

        System.out.println(cars[so]);

    }

}
