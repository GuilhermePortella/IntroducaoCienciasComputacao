/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacaoOrientadaObjetosEx;

/**
 *
 * @author Guilherme
 */
public class Exercicio3_Student {
    
    public String name;
    public double grade1,grade2,grade3;
    
    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }
    
    public double missingPoints(){
        if (finalGrade()<60.0) {
            return 60.0 - finalGrade();
        }else
            return 0.0;
    }
}
