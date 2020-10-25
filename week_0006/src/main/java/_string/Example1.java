package _string;

/*
 * created by Muhammed Topgul
 * on 20/10/2020
 * at 22:12
 */

public class Example1 {
    public static void main(String[] args) {

        String x = "Java";
        String y = x.concat(" SE");

        System.out.println(x); // Java
        System.out.println(x.toUpperCase()); // JAVA
        System.out.println(y); // Java SE
    }
}

// String' in her karakteri 16 bit unicode bir karakterdir
// bu yuzden her karakteri destekler

// String objeleri IMMUTABLE ozellige sahiptir
// IMMUTABLE -> degismez anlamına gelmektedir
// yani concat yapıldıgunda objenin bellekteki ki yeri degismez bunun yerine yeni bir obje olusur