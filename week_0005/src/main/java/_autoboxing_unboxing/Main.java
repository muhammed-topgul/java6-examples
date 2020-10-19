package _autoboxing_unboxing;

/*
 * created by Muhammed Topgul
 * on 19/10/2020
 * at 09:08
 */

public class Main {
    public static void main(String[] args) {

        // Boxing
        // primitive -> reference
        Integer integer1 = new Integer(100);
        Integer integer2 = Integer.valueOf(100);

        // AutoBoxing
        Integer integer3 = 100;
        int primitive = 100;
        Integer autoBoxing = primitive;

        // Unboxing
        // reference -> primitive
        int unboxing1 = integer1.intValue();

        // AutoUnboxing
        int unboxing2 = integer1;
    }
}

// AutoBoxing / Boxing
// primitive type -> reference type


// AutoUnboxing / Unboxing
// reference type -> primitive type

// -autoboxing ve autounboxing bizim icin yeterli
// - genel olarak primitive tipler tercih edilmeli
// - null deger olma durumunda (web servis veya database islemleri) o zaman wrapper
// - collections ve generic ifadelerde wrapper tercih edilmeli
