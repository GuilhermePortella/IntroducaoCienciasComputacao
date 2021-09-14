/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_Java;

import java.util.Locale;

/**
 *
 * @author Guilherme
 */
public class FormatacaoNumerosExercicio {

    /*
        Regra geral para printf:
        
        "Texo %f Texto2 %f Texto3", veriavel1, variavel2
        
        %f = ponto flutuante
        %d = inteiro
        %s = texto
        %n = quebra de linha
     */
    public static void main(String[] args) {

        String product1 = "Computer", product2 = "Office desk";
        int age = 30, code = 5290;
        char gander = 'F';
        double price1 = 2100.0, price2 = 650.50, measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which is %.2f%n", product1,price1);
        System.out.printf("%s, which is %.2f%n", product2,price2);
        System.out.println("");
        System.out.printf("Record: %d years old, code %d and gender %s%n",age,code,gander);
        System.out.println("");
        System.out.printf("Measue with eight decimal places: %f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f %n", measure);
    }
}
