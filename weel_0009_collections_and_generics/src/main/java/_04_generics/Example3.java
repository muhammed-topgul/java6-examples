package _04_generics;

/*
 * created by Muhammed Topgul
 * on 28/10/2020
 * at 18:06
 */

import java.util.ArrayList;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {

        List<Object> objects = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        listRules1(integers);
        // listRules2(integers); // compile error

    }

    // List<?> -> <? extends Object> ile aynı anlama gelir
    public static void listRules1(List<?> list) {
        // yeni bir eleman eklenemez
    }

    // object list bekler
    public static void listRules2(List<Object> list) {
        // yeni eleman eklenebilir
    }
}

