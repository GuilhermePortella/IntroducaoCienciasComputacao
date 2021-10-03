package Arrays_Listas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Exemplo_2 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scr = new Scanner(System.in);
        
        int n = scr.nextInt();
        Exemplo_2_class[] vect = new Exemplo_2_class[n];
        
        for (int i = 0; i < vect.length; i++) {
            scr.nextLine();
            String name = scr.next();
            double price = scr.nextDouble();
            
            vect[i] = new Exemplo_2_class(name, price);
        }
        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();
        }
        double media = soma/n;
        
        System.out.printf("Result media %.2f%n", media);
    }
    
}
