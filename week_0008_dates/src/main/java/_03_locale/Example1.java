package _03_locale;

/*
 * created by Muhammed Topgul
 * on 25/10/2020
 * at 19:33
 */

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Example1 {
    public static void main(String[] args) {

        Date date = new Date();

        Locale localeTR = new Locale("tr", "TR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeTR);

        System.out.println(dateFormat.format(date));
    }
}
