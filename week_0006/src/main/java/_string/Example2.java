package _string;

/*
 * created by Muhammed Topgul
 * on 20/10/2020
 * at 22:21
 */

public class Example2 {
    public static void main(String[] args) {

        // String' ler String Pool denilen bir alanda yasarlar

        // burada 1 tane obje olusur
        // compiler 2. objeyi olusturmaz
        String a = "Java";
        String b = "Java";
        System.out.println(a == b); // true

        ///////////////////////////////////////////////////
        String x = new String("X");
        String y = new String("X");
        System.out.println(x == y); // false
    }
}
