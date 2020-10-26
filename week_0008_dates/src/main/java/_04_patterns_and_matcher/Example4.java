package _04_patterns_and_matcher;

/*
 * created by Muhammed Topgul
 * on 25/10/2020
 * at 20:51
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {
    public static void main(String[] args) {

        example1();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    public static void example1() {
        System.out.println("Ornek 1");

        String input = "muhammed1 muha2mmed2 muhammed3k";

        Pattern pattern = Pattern.compile("[\\d]"); // rakam arar [0-9]
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}

// quantifier -> kac defa geciyor bilgisi icin kullanıyoruz

// * -> 0 veya daha fazla {0,}
// + -> 1 veya daha fazla {1,}
// ? -> 0 veya 1 tane {0,1}
// {X} -> X tane kadar
// {X,} -> X tane veya daha fazla
// {X,Y} -> min X, max Y tane olsun
