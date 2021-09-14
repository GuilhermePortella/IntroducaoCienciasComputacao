package basic_Java;

import java.util.Locale;

public class StringFuncoes {

    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase(Locale.ROOT);//Muda tudo para minusculo
        System.out.println(s01);

        String s02 = original.toUpperCase(Locale.ROOT);//Muda tudo para maiusculo
        System.out.println(s02);

        String s03 = original.trim();//elimina espaços no final
        System.out.println("-"+original+"-");
        System.out.println("-"+s03+"-");

        String s04 = original.substring(2);//apartir do numero informado ele gera uma nova string
        System.out.println(s04);

        String s05 = original.substring(2,9);//apartir do numero informado ate o outro numero ele gera uma nova string
        System.out.println(s05);

        String s06 = original.replace('a','x');// no exemplo sempre que acha um 'a' ele troca por um 'x'
        System.out.println(s06);

        String s07 = original.replace("abc", "xy");// no exemplo sempre que acha um 'abc' ele troca por um 'xy'
        System.out.println(s07);

        int i = original.indexOf("bc");// qual primeira posição esta essa subString
        System.out.println(i);

        int j = original.lastIndexOf("bc");// qual ultima posição esta essa subString
        System.out.println(j);
    }
}
