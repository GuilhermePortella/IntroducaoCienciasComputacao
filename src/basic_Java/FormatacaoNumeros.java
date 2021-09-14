package basic_Java;

import java.util.Locale;

/**
 *
 * @author Guilherme
 */
public class FormatacaoNumeros {
    
    public static void main(String[] args) {
        
        /*
        Regra geral para printf:
        
        "Texo %f Texto2 %f Texto3", veriavel1, variavel2
        
        %f = ponto flutuante
        %d = inteiro
        %s = texto
        %n = quebra de linha
        */
        
        double x = 10.35785;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;        
        
        System.out.println(x);
        System.out.printf("%.2f", x);
        System.out.println(" ");
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);//Locale define o local da aplicação, no exemplo ele esta mudando para os EUA para tem um "." no numero
        System.out.printf("%.4f%n", x);
        System.out.println("RESULTADO = " + x + "METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        System.out.println("============================");
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
