package ProgramacaoOrientadaObjetos;

import ProgramacaoOrientadaObjetosEx.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class aula1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scr = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle x: ");
        x.a = scr.nextDouble();
        x.b = scr.nextDouble();
        x.c = scr.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        y.a = scr.nextDouble();
        y.b = scr.nextDouble();
        y.c = scr.nextDouble();


        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        }else
            System.out.println("Larger area: Y");
    }
}