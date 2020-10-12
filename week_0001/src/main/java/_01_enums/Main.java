package _01_enums;

/*
 * created by Muhammed Topgul
 * on 12/10/2020
 * at 09:43
 */

public class Main {
    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.TALL;

        System.out.println(coffeeSize);
        System.out.println(coffeeSize.ordinal());
        System.out.println(coffeeSize.getSize());
        //
        System.out.println(CoffeeSize.values().length);
        //
        for (CoffeeSize cs : CoffeeSize.values()) {
            System.out.println(cs + ", " + cs.getSize());
        }
    }
}
