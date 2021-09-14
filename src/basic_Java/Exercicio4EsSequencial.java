/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_Java;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Exercicio4EsSequencial {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double numFun, hrsTrab, vlRece;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite seu numero de funcionario: ");
        numFun = scr.nextDouble();
        System.out.println("Digite quantas horas voce trabalhou: ");
        hrsTrab = scr.nextDouble();
        System.out.println("Digite o valor que voce ganha por hora: ");
        vlRece = scr.nextDouble();

        System.out.println("NUMBER = " + numFun);
        System.out.println("SALARY = U$ " + (hrsTrab * vlRece));
        scr.close();
    }

}
