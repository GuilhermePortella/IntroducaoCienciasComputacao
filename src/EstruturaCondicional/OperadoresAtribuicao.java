/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class OperadoresAtribuicao {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Digite o numero de minutos: ");
        int minutos = scr.nextInt();
        
        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }
        
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        
        scr.close();
    }
    
}
