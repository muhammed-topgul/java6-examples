package _more_overloaded;

/*
 * created by Muhammed Topgul
 * on 19/10/2020
 * at 23:12
 */

public class Main {
    public static void main(String[] args) {

        // long calisir
        // cunku primitive oldugu icin ilk once ona bakar
        // int to long, int to wrapper'a gore daha az maliyetli
        overloaded(100);
    }

    // int -> long (widening)
    public static void overloaded(long l){
        System.out.println("long");
    }

    // int -> Integer (boxing)
    public static void overloaded(Integer i){
        System.out.println("Integer");
    }
}

//
