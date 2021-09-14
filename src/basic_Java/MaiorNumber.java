package basic_Java;

import java.util.Scanner;

public class MaiorNumber {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();

        int higher = max(a,b,c);

        showResult(higher);

        scr.close();
    }

    public static int max (int a, int b, int c){
        int aux;

        if (a > b && a > c){
            aux = a;
        }else if (b > c){
            aux = b;
        }else
            aux = c;
        return aux;
    }
    public static void showResult(int value){
        System.out.println("Higher = " + value);

    }

}
