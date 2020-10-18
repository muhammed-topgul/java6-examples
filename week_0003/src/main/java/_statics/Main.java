package _statics;

/*
 * created by Muhammed Topgul
 * on 18/10/2020
 * at 12:46
 */

public class Main {

    // static degisken
    // obje sayısından bagımsız olarak sadece 1 adet olsutrulur
    // objeye degil class'a aittir
    private static int count = 10;

    // instance degisken
    // instance degiskenler obje ile yasarlar
    // n tane obje icin n tane age property olur
    // her objenin bir tane age property'si olur
    private int age;

    // Java da objler HEAP memory de yasarlar
    // dogal olarak instance degiskenlerde HEAP memory de yasarlar

    // static degiskenler permgen denilen ozel HEAP bolgesinde yasarlar
    // eger bir objeyi gosteriyorsa yine HEAP bolgesinde yasar

    // her method static olmamalı
    // UTILITY classları static olmalı
    // yani bir cok sınıfın ortak kullandıgı classlar static olmalı
    // bu classlar OOP acısından herhangi bir hiyerarsik durum ifade etmez tamamen yardımcı sınıflardır

    // static method da this ifadesini kullanamayız
}


// static -> keyword

// variables
// methods
// nested classes
// initialize blocks
// imports
