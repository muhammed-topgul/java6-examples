package _02_reference_casting;

/*
 * created by Muhammed Topgul
 * on 15/10/2020
 * at 11:25
 */

public class Main {

    // upcasting
    // downcasting

    public static void main(String[] args) {

        Animal animalDog = new Dog();
        // degisken tipi Animal
        // objenin tipi Dog

        // DOWNCASTING
        // super -> sub
        Dog dog = (Dog) animalDog;

        // UPCASTING
        // sub -> super
        Animal animal = new Dog();
        Dog dog1 = (Dog) animal;

        // class cast exception
        // Cat cat = (Cat) animalDog;
        // cat.meow();
    }
}

class Animal {

    public void eat() {
        System.out.println("Animal eat...");
    }
}

class Dog extends Animal {

    public void eat() {
        System.out.println("Dog eat...");
    }

    public void bark() {
        System.out.println("Dog bark...");
    }
}

class Kangal extends Dog {

}

class Cat extends Animal {

    public void eat() {
        System.out.println("Cat eat...");
    }

    public void meow() {
        System.out.println("Cat meow...");
    }
}
