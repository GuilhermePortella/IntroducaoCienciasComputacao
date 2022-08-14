package basic_Java;

import java.util.Scanner;
public class Ex_1 {
    
    //Pagina 254
    

    public static void main(String[] args) {
        int op, n;
        float num, soma, prod;
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Maquina esperta ");
        System.out.println("1 - Soma varios numeros");
        System.out.println("2 - Multiplica varios numeros");
        System.out.println("3 - Sai do algoritmo");
        System.out.println("OPCAO");
        
        op = scr.nextInt();
        
        if(op == 1){
            soma = 0;
            System.out.println("Digite um numero ou -0.0001 para finalizar ");
            num = scr.nextFloat();

        }
    }

}
