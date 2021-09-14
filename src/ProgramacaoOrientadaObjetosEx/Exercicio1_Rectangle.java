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
public class Exercicio1_Rectangle {
    
    public double width, height;
    
    public double area(){
        return width * height;
    }
    
    public double perimeter(){
        return 2 * (width + height);
    }
    
    public double diagonal(){
        return Math.sqrt(width * width + height * height);
    }
}
