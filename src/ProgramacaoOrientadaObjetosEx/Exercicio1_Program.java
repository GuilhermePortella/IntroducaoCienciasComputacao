package ProgramacaoOrientadaObjetosEx;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scr = new Scanner(System.in);
        
        Exercicio1_Rectangle rec = new Exercicio1_Rectangle();
        
        System.out.println("Enter rectangle width and heigth: ");
        rec.width = scr.nextDouble();
        rec.height = scr.nextDouble();
        
        System.out.printf("AREA = %.2f%n",rec.area());
        System.out.printf("PERIMETER = %.2f%n", rec.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rec.diagonal());
        scr.close();
    }
}
