package basic_Java;

import java.util.Scanner;

public class BitWise {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int mask = 0b00100000;
        System.out.println("Digite um numero: ");
        int n = scr.nextInt();

        if ((n & mask)!=0){
            System.out.println("6th bit is true");
        }else{
            System.out.println("6th bit is false");
        }


        scr.close();
    }
}
