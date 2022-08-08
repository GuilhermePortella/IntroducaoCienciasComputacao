package EstruturaCondicional;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Execicio5 {

    public static void main(String[] args) {

        int opcao, quantidade;
        double total;

        Scanner scr = new Scanner(System.in);
        
        System.out.println("Cardapio: ");
        System.out.println("1 - Cachorro quente");
        System.out.println("2 - X-Salada");
        System.out.println("3 - X-Bacon");
        System.out.println("4 - Torrada Simples");
        System.out.println("5 - Refrigerante");

        System.out.println("Digite a opção desejada: ");
        opcao = scr.nextInt();
        System.out.println("Digite a quantidade: ");
        quantidade = scr.nextInt();

        if (opcao == 1) {
            total = quantidade * 4.0;
            System.out.println("Voce ira comprar " + quantidade + " Cachorro quente's" + " Por R$ " + total);

        } else if (opcao == 2) {
            total = quantidade * 4.5;
            System.out.println("Voce ira comprar " + quantidade + " X-Salada" + " Por R$ " + total);

        } else if (opcao == 3) {
            total = quantidade * 5.0;
            System.out.println("Voce ira comprar " + quantidade + " X-Bacon" + " Por R$ " + total);

        } else if (opcao == 4) {
            total = quantidade * 2.0;
            System.out.println("Voce ira comprar " + quantidade + " Torrada Simples" + " Por R$ " + total);

        } else {
            total = quantidade * 1.5;
            System.out.println("Voce ira comprar " + quantidade + " Refrigerante" + " Por R$ " + total);
        }
    }
}
