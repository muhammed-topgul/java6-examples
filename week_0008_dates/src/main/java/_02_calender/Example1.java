package _02_calender;

/*
 * created by Muhammed Topgul
 * on 25/10/2020
 * at 19:17
 */

import java.util.Calendar;

public class Example1 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(Calendar.DAY_OF_WEEK);
    }
}

// java.util.Calender bir abstaract siniftir
