package EstruturasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class For {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Digite o numero");
        int N = scr.nextInt();
        
        int soma = 0;
        
        for (int i = 0; i < N; i++) {
            System.out.println("Digite o numero");
            int x = scr.nextInt();
            
            soma =soma+ x;
        }
        System.out.println(soma);
        
        scr.close();
    }
}
