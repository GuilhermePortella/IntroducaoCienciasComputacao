package basic_Java;

/**
 *
 * @author Guilherme
 */
public class Casting {

    public static void main(String[] args) {

        int x;
        double y;

        x = 5;

        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        System.out.println("====================");

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B)/2.0 * h;
        
        System.out.println(area);

        System.out.println("====================");
        
        int a, b2;
        double resultado;
        
        a = 5;
        b2 = 2;
        
        resultado = (double) a/b2;
        
        System.out.println(resultado);
        
        System.out.println("====================");
        
        double a2;
        int b3;
        
        a2 = 5.0;
        b3 = (int) a2;
        
        System.out.println(b3);
    }

}
