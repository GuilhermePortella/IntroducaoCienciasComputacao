package EstruturaCondicional;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Execicio4 {
    
    public static void main(String[] args) {
        
        double hrInicio, hrFinal, auxiliar;
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Digite a hora que o jogo começou: ");
        hrInicio = scr.nextDouble();
        System.out.println("Digite a hora que o jogo terminou: ");
        hrFinal = scr.nextDouble();
        
        if (hrInicio < hrFinal) {
            
            auxiliar = hrFinal - hrInicio;
            
        }else
            auxiliar = 24 - hrInicio + hrFinal;
        
        System.out.println("Jogo teve " + auxiliar + " Horas");
    }
    
}
