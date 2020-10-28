package _04_generics;

/*
 * created by Muhammed Topgul
 * on 28/10/2020
 * at 18:13
 */

public class Example4 {

    public static void main(String[] args) {
        GenericClass<Integer> genericClass1 = new GenericClass<>(200);
        GenericClass<String> genericClass2 = new GenericClass<>("Muhammed");

        System.out.println(genericClass1.getRef());
        System.out.println(genericClass2.getRef());

        genericClass2.setRef("Java Developer");
        System.out.println(genericClass2.getRef());
    }
}

class GenericClass<T> {

    private T ref;

    //
    public GenericClass(T ref) {
        this.ref = ref;
    }

    //
    public T getRef() {
        return ref;
    }

    public void setRef(T ref) {
        this.ref = ref;
    }
}
