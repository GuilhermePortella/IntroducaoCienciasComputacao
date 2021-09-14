/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacaoOrientadaObjetosEx;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Exercicio2_Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scr = new Scanner(System.in);
        
        Exercicio2_Employee emp = new Exercicio2_Employee();
        
        System.out.print("Name: ");
        emp.name = scr.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = scr.nextDouble();
        System.out.print("tax: ");
        emp.tax = scr.nextDouble();
        
        System.out.println();
        System.out.println("Employee: "+ emp);
        System.out.println();
        System.out.print("Which percentage to increase salary ? ");
        double percetege = scr.nextDouble();
        emp.increaseSalary(percetege);
        
        System.out.println();
        System.out.println("Update data: " + emp);
        scr.close();
    }
}
