package _04_patterns_and_matcher;

/*
 * created by Muhammed Topgul
 * on 25/10/2020
 * at 20:10
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3 {
    public static void main(String[] args) {

        example1();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        example2();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        example3();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        example4();
    }

    public static void example1() {
        System.out.println("Ornek 2");

        String input = "muhammed1 muha2mmed2 muhammed3k";

        Pattern pattern = Pattern.compile("[\\d]"); // rakam arar [0-9]
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }

    public static void example2() {
        System.out.println("Ornek 2");

        String input = "muhammed1 muha2mmed2 muhammed3k";

        Pattern pattern = Pattern.compile("\\dm"); // rakam arar [0-9]
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }

    public static void example3() {
        System.out.println("Ornek 3");

        String input = "muhammed1 muha2mmed2 muhammed3k";

        Pattern pattern = Pattern.compile("\\s"); // bosluk
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }

    public static void example4() {
        System.out.println("Ornek 3");

        String input = "muhammed1 muha2mmed2 muhammed3k";

        Pattern pattern = Pattern.compile("m.h");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}

// meta characters
// \d digit
// \s white space
// \w harf, rakam
// \D non-digit
// \S non-white space
// \W non word
// .
