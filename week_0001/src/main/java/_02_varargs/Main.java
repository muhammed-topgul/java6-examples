package _02_varargs;

/*
 * created by Muhammed Topgul
 * on 12/10/2020
 * at 09:50
 */

public class Main {

    // var-arg
    // bir method'a geçebilcek parametre sayısı opsiyonel olabilir
    // 0-1-2...n adet eleman parametre olarak geçilebilir
    // böyle durumlarda varargs kullanılır
    // int ... vararg
    // String ... vararg
    // X ... vararg

    public static void main(String[] args) {
        method(1, 2, 3, 4, 5);
    }

    // bir method icinde vararg en sonda olmalıdır
    // bir method icinde bir tane olabilir
    public static void method(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
