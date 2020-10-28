package _04_generics;

/*
 * created by Muhammed Topgul
 * on 28/10/2020
 * at 18:22
 */

public class Example6 {

    public static void main(String[] args) {
        boundedType(10);
        boundedType(1.4);
        // boundedType("4");  error
        unboundedType("Muhammed");
        unboundedType(2);
    }

    public static <T extends Number> void boundedType(T t) {
        System.out.println(t);
    }

    public static <T> void unboundedType(T t) {
        System.out.println(t);
    }
}
