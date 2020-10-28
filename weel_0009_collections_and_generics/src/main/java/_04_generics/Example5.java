package _04_generics;

/*
 * created by Muhammed Topgul
 * on 28/10/2020
 * at 18:17
 */

public class Example5 {

    public static void main(String[] args) {
        Integer[] i = {1, 2, 3, 4, 5, 6};
        String[] s = {"Muhammed", "Java"};

        GenericClass2.genericStaticMethod(s);
        GenericClass2.genericStaticMethod(i);
    }
}

class GenericClass2<T> {

    public void genericMethod(T t) {
        System.out.println(t);
    }

    public static <T> void genericStaticMethod(T[] t) {
        for (T t1 : t) {
            System.out.println(t1);
        }
    }
}
