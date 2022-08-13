package EstruturaCondicional;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Execicio6 {

    public static void main(String[] args) {

        double valorEntrada;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valorEntrada = scr.nextDouble();

        if (valorEntrada < 0.0 || valorEntrada > 100) {
            System.out.println("Fora de intervalo");
        } else if (valorEntrada <= 25) {
            System.out.println("Intervalo (0,25)");

        } else if (valorEntrada <= 50) {
            System.out.println("Intervalo (25,50)");

        } else if (valorEntrada <= 75) {
            System.out.println("Intervalo (50,75)");

        } else if (valorEntrada <= 100) {
            System.out.println("Intervalo (75,100)");

        }
    }
}
