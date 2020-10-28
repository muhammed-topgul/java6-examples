package _04_generics;

/*
 * created by Muhammed Topgul
 * on 28/10/2020
 * at 17:48
 */

import java.util.ArrayList;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();
        List<Kangal> kangalList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();

        // listRules1(dogList); hatali
        listRules2(kangalList);
        listRules2(dogList);
        listRules1(animalList);

    }

    public static void listRules1(List<? super Animal> animalList) {
        // animalList.add(new Dog());
        // yeni bir eleman eklemeye izin vermez
        // sadece gonderdigim liste ile ilgili ekleme dısında islem yapabilirim islem yapabilirim
        System.out.println(animalList.size());
    }

    public static void listRules2(List<? super Kangal> kangalList) {
        kangalList.add(new Kangal());
        System.out.println(kangalList.size());
    }

}
