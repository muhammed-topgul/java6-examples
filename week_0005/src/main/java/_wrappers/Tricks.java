package _wrappers;

/*
 * created by Muhammed Topgul
 * on 19/10/2020
 * at 09:24
 */

public class Tricks {
    public static void main(String[] args) {

        Integer number1 = 10;
        Integer number2 = 10;

        Integer number3 = 100;
        Integer number4 = 100;

        Integer number5 = 1000;
        Integer number6 = 1000;

        // == kontrolu reference type icin bu 2 degisken aynı objeyi mi gosteriyor
        // evet ise true
        // hayır ise false

        System.out.println(number1 == number2);  // true
        System.out.println(number3 == number4);  // true
        System.out.println(number5 == number6);  // false
        // varsayılan olarak [-128, 127] aralıgında autoboxing ile Integer objesi olusturlursa
        // bu sayi obje cache'lenir yeni bir obje burada olusmaz
        // burda wrapper kapalı aralıgın dısına cıktıgı andan itibaren farklı yerleri ref eder
        // hata almamak icin .equals() methodu kullanılmalı, .equals() degerleri karsılastırır
    }
}
