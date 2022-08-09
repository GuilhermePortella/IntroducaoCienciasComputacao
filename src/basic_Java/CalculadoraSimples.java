package basic_Java;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class CalculadoraSimples {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int Opcao = 0;
        double Valor1, Valor2, Resultado;

        while (Opcao != 5) {

            switch (Opcao) {

                case 1:
                    System.out.println("Adição");
                    System.out.println("Entre com o primeiro valor: ");
                    Valor1 = scr.nextDouble();
                    System.out.println("Entre com o segundo valor: ");
                    Valor2 = scr.nextDouble();

                    Resultado = Valor1 + Valor2;

                    System.out.println("O resultado é: " + Resultado);
                    break;
                case 2:
                    System.out.println("Subtração");
                    System.out.println("Entre com o primeiro valor: ");
                    Valor1 = scr.nextDouble();
                    System.out.println("Entre com o segundo valor: ");
                    Valor2 = scr.nextDouble();

                    Resultado = Valor1 - Valor2;

                    System.out.println("O resultado é: " + Resultado);
                    break;
                case 3:
                    System.out.println("Multiplicação");
                    System.out.println("Entre com o primeiro valor: ");
                    Valor1 = scr.nextDouble();
                    System.out.println("Entre com o segundo valor: ");
                    Valor2 = scr.nextDouble();

                    Resultado = Valor1 * Valor2;

                    System.out.println("O resultado é: " + Resultado);
                    break;
                case 4:
                    System.out.println("Divisão");
                    System.out.println("Entre com o primeiro valor: ");
                    Valor1 = scr.nextDouble();
                    System.out.println("Entre com o segundo valor: ");
                    Valor2 = scr.nextDouble();

                    Resultado = Valor1 / Valor2;

                    System.out.println("O resultado é: " + Resultado);
                    break;
                case 5:
                    break;
            }
            System.out.println();
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.println();
            System.out.println("Escolha a opção");
            Opcao = scr.nextInt();
        }
    }
}
