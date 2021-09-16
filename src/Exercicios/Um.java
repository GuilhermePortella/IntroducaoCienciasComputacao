/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Um {

    public static void main(String[] args) {
        UmClass oiu = new UmClass();
        Scanner scr = new Scanner(System.in);

        System.out.println("Digite uma opção para testar a Array: ");
        int cases = scr.nextInt();

        switch (cases) {
            case 1:
                oiu.procedimeto1();
                break;
            case 2:
                break;

        }

    }
}
