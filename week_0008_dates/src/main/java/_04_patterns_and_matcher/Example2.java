package _04_patterns_and_matcher;

/*
 * created by Muhammed Topgul
 * on 25/10/2020
 * at 20:08
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {
    public static void main(String[] args) {

        example1();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    public static void example1() {
        System.out.println("Ornek 1");

        String input = "abababa";

        Pattern pattern = Pattern.compile("aba");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
