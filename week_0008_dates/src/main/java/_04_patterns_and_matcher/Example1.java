package _04_patterns_and_matcher;

/*
 * created by Muhammed Topgul
 * on 25/10/2020
 * at 19:41
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {

        example1();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        example2();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        example3();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        example4();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        example5();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        example6();
    }

    public static void example1() {
        System.out.println("Ornek 1");

        String input = "muhammed topgul";

        Pattern pattern = Pattern.compile("m");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }

    public static void example2() {
        System.out.println("Ornek 2");

        String input = "muhammed topgul";

        Pattern pattern = Pattern.compile("m|e|p|u"); // m veya e veya p veya u bulur
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }

    public static void example3() {
        System.out.println("Ornek 3");

        String input = "muhammed topgul";

        Pattern pattern = Pattern.compile("[mepu]"); // m veya e veya p veya u bulur
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }

    public static void example4() {
        System.out.println("Ornek 4");

        String input = "muhammed topgul";

        Pattern pattern = Pattern.compile("[mu][ha]"); // 1. karakter m veya u 2. karakter h veya a
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }

    public static void example5() {
        System.out.println("Ornek 5");

        String input = "muhammed topgul";

        Pattern pattern = Pattern.compile("[a-e]"); // a dan e ye kadar arar
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }

    public static void example6() {
        System.out.println("Ornek 6");

        String input = "muhammed topgul";

        Pattern pattern = Pattern.compile("[^a-e]"); // a dan e ye kadar olmasın
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
