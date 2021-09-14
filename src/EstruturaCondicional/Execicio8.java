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
public class Execicio8 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double valorSalario, imposto;

        Scanner scr = new Scanner(System.in);
        System.out.println("Digite o salario:");
        valorSalario = scr.nextDouble();

        if (valorSalario <= 2000.0) {
            System.out.println("Isento");
            imposto = 0.0;
            
        } else if (valorSalario <= 3000.0) {
            System.out.println("8 %");
            imposto = (valorSalario - 2000.0) * 0.08;

        } else if (valorSalario <= 4500.0) {
            System.out.println("18 %");
            imposto = (valorSalario - 3000.0) * 0.18 + 1000.0 * 0.08;

        } else {
            System.out.println("28 %");
            imposto = (valorSalario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        
        if (imposto == 0.0) {
            
        }else 
            System.out.printf("R$ %.2f%n", imposto);
        
        scr.close();
    }
}
