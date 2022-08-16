package basic_Java;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class EntradaDeDados2 {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        int x;
        String s1, s2, s3;
        
        x = scr.nextInt();
        scr.nextLine();
        s1 = scr.nextLine();
        s2 = scr.nextLine();
        s3 = scr.nextLine();
        
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        scr.close();
    }
}
