package basic_Java;

import java.util.Locale;
import java.util.Scanner;

public class Equiacao2grau {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scr = new Scanner(System.in);

        double a, b, c;

        System.out.println("Digite os valores dos coeficientes");
        a = scr.nextDouble();
        b = scr.nextDouble();
        c = scr.nextDouble();

        double delta = b * b - 4 * a * c;

        scr.close();
    }
}
