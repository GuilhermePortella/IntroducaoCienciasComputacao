/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class WhileExercicio1 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        int senha = scr.nextInt();

        while (senha != 2002) {
            System.out.println("Senha invalida");
            System.out.println("Digite a senha: ");
            senha = scr.nextInt();
        }
        System.out.println("Acesso permitido");
        scr.close();
    }

}
