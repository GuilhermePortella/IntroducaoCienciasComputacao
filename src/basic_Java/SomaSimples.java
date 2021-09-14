/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_Java;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class SomaSimples {

    public static void main(String[] args) {

        String numeroA, numeroB;
        int numero1, numero2, soma;

        numeroA = JOptionPane.showInputDialog("Entre com um numero inteiro ");
        numeroB = JOptionPane.showInputDialog("Entre com um numero inteiro ");
        
        //converte os numeros de String para inteiro
        numero1 = Integer.parseInt(numeroA);
        numero2 = Integer.parseInt(numeroB);
        
        //outra forma de conversão seria utilizar o metodo valueOf
        numero1 = Integer.valueOf(numeroB);
        numero2 = Integer.valueOf(numeroB);
        
        soma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "A soma dos numeros é: " + soma, "Resultado", JOptionPane.PLAIN_MESSAGE);
        
    }
}
