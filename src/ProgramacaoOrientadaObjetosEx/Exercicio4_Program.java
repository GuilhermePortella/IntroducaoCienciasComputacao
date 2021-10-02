package ProgramacaoOrientadaObjetosEx;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Exercicio4_Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scr = new Scanner(System.in);
        Exercicio4_Calculator calc = new Exercicio4_Calculator();
        
        System.out.println("Enter radius: ");
        double radius = scr.nextDouble();
        
        double c = calc.circumference(radius);
        
        double v = calc.volume(radius);
        
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);
    }
    
}
