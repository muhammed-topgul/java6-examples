package _04_generics;

/*
 * created by Muhammed Topgul
 * on 28/10/2020
 * at 17:22
 */

import java.util.ArrayList;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();

        dogList.add(new Dog());
        dogList.add(new Dog());
        dogList.add(new Dog());

        // listRules(animalList);
        listRules1(dogList);
        // listRules(catList);

        //
        listRules2(dogList);
    }

    public static void listRules1(List<? extends Animal> animalList) {
        // animalList.add(new Dog());
        // yeni bir eleman eklemeye izin vermez
        // sadece gonderdigim liste ile ilgili ekleme dısında islem yapabilirim islem yapabilirim
        System.out.println(animalList.size());
    }

    public static void listRules2(List<? extends Live> liveList) {

    }
}

// GENERICS
// compile time da guclu bir type check saglar
// type casting' e gerek kalmaz

class Animal {

}

interface Live {

}

class Dog extends Animal implements Live {

}

class Kangal extends Dog {

}

class Cat extends Animal {

}
