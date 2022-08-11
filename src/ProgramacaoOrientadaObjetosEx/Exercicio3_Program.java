package ProgramacaoOrientadaObjetosEx;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Exercicio3_Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scr = new Scanner(System.in);
        
        Exercicio3_Student student = new Exercicio3_Student();
        
        student.name = scr.nextLine();
        student.grade1 = scr.nextDouble();
        student.grade2 = scr.nextDouble();
        student.grade3 = scr.nextDouble();
        
        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }else
            System.out.println("PASS");
        scr.close();
    }
}
