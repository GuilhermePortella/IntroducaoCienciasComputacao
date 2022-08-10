package EstruturasRepetitivas;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guilherme
 */
public class DoWhile {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scr = new Scanner(System.in);

        char resp;
        
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double C = scr.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.println("Deseja repetir (s/n) ?");
            resp = scr.next().charAt(0);
        } while (resp != 'n');
        scr.close();
    }
}
