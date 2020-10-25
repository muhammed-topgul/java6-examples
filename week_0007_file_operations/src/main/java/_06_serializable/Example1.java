package _06_serializable;

/*
 * created by Muhammed Topgul
 * on 25/10/2020
 * at 19:00
 */

import java.io.*;

public class Example1 {

    private static final String FILE_NAME = "laptop.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Laptop laptop = new Laptop();
        laptop.setPrice(100);
        laptop.setBrand("apple");

        // write
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
        objectOutputStream.writeObject(laptop);

        // read
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME));

        Laptop foundLaptop = (Laptop) objectInputStream.readObject();
        System.out.println(foundLaptop.getBrand());
        System.out.println(foundLaptop.getPrice());
    }
}

// Serializable genelde objenin state'ini bir dosyaya basmak icin kullanılır
class Laptop implements Serializable {

    private int price;
    // transient propertyler pass gecilir
    private transient String brand;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
