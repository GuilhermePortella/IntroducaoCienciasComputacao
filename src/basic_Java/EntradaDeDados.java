/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_Java;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class EntradaDeDados {

    public static void main(String[] args) {
        String a;

        Scanner scr = new Scanner(System.in);
        
        
        System.out.println("Digite o nome: ");
        a = scr.next();
        System.out.println("nome que vc digitou: " + a);

        System.out.println("=========================");
        
        int b;
        
        System.out.println("Digite um numero: ");
        b = scr.nextInt();
        System.out.println("numero que vc digitou: " + b);
        
        System.out.println("=========================");
        
        String c;
        int d;
        double e;
        
        System.out.println("Digite um nomer, uma idade e um valor");
        c = scr.next();
        d = scr.nextInt();
        e = scr.nextDouble();
        System.out.println("Os valores são: ");
        c = "Bruna";
        System.out.println("o nome vai ser esse e ponto final: ");
        System.out.println("String: " + c);
        System.out.println("Int: " + d);
        System.out.println("Double: " + e);
                
        scr.close();
    }

}
