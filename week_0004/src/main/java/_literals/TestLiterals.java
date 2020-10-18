package _literals;

/*
 * created by Muhammed Topgul
 * on 18/10/2020
 * at 21:56
 */

public class TestLiterals {
    public static void main(String[] args) {

        int numberOctal1 = 011;
        System.out.println(numberOctal1);
        // int numberOctal2 = 08; octal [0-7] aralıgında bu yuzden 8 derleme hatası verir

        //--------------------------------------
        int numberHexadecimal = 0xAB;
        System.out.println(numberHexadecimal);

        //--------------------------------------
        int numberBinary = 0b111;
        System.out.println(numberBinary);
    }
}
