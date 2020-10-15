package _01_override;

/*
 * created by Muhammed Topgul
 * on 15/10/2020
 * at 10:30
 */

public class Main {
    public static void main(String[] args) {

        // Java' da 3 tür degisken vardır
        // local
        // instance
        // static

        // Java' da objeler HEAP alanında yasarlar
        // Local degiskenler STACK alnında yasarlar
        // Instance degiskenler HEAP alanında yasarlar
        // Static degiskenler HEAP alanında yasarlar
        Computer computer = new Computer();
        computer.boot();
        computer.shutDown();
        System.out.println(computer.processor);
        System.out.println(computer.ram);

        Laptop laptop = new Laptop();
        laptop.boot();
        laptop.shutDown();
        System.out.println(laptop.processor);
        System.out.println(laptop.ram);

        Computer laptopComputer = new Laptop();
        laptopComputer.boot();
        // Java' da static methodlar override edilemez
        // Java' da final methodlar override edilemez
        // Override olabilmesi icin public veya default access modifier olabilmsei gerekir
        laptopComputer.shutDown();
        System.out.println(laptopComputer.processor);
        System.out.println(laptopComputer.ram);


        // override methodlar dynamic dispatch denilen mekanizma isler
        // dynamic method dispatch -> Java override methodlar calisma anında karar verilir
    }
}

class Computer {

    int processor = 4;
    static int ram = 8;

    public void boot() {
        System.out.println("Computer booting...");
    }

    public static void shutDown() {
        System.out.println("Computer shut downing...");
    }
}

class Laptop extends Computer {

    int processor = 8;
    static int ram = 16;

    public void boot() {
        System.out.println("Laptop booting...");
    }

    public static void shutDown() {
        System.out.println("Laptop shut downing...");
    }
}

// extends veya implements keyword'ununun kullanılması gerekir
// IS-A iliskisi gerekli