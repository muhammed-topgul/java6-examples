package _03_encapsulation;

/*
 * created by Muhammed Topgul
 * on 12/10/2020
 * at 16:44
 */

public class Person {

    // 1- public degiskenleri private/protected tanimla
    // 2- instance degiskenlere erisim public getter/setter methodları ile olsun
    // 3- getter/setter methodları isimlendirme standartlarına uysun

    // bu 3 kurala uyan sınıflar encapsulaton'a uygun hale gelir

    private int age;
    private String surname;

    //
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
