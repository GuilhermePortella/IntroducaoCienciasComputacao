package basic_Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6EsSequencial {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        float A, B, C;
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Digite o valor A");
        A = scr.nextFloat();
        System.out.println("Digite o valor B");
        B = scr.nextFloat();
        System.out.println("Digite o valor C");
        C = scr.nextFloat();
        
        float areaTrianguloRetangulo = (A*C)/2;
        System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
        
        float areaCirculo = 3.14159f * C*C;
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        
        float areaTrapezio = (C*(A+B))/2;
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        
        float areaQuadrado = B * B;
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        
        float areaRetangulo = A * B;
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    }
}
