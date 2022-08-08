package EstruturaCondicional;

import java.util.Scanner;
/**
 *
 * @author Guilherme
 */
public class CondicionalTernaria {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
        scr.close();
    }
}
