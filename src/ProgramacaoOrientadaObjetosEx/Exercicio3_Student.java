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
