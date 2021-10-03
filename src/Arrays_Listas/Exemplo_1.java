package Arrays_Listas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Exemplo_1 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scr = new Scanner(System.in);
        
        int n = scr.nextInt();
        double[] vect = new double[n] ;
        for (int i = 0; i < n; i++) {
            vect[i] = scr.nextDouble();
        }
        
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        double result = soma/n;
        
        System.out.printf("Result %.2f%n", result);
        
        scr.close();
        
    }
}
