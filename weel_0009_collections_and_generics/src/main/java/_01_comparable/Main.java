package _01_comparable;

/*
 * created by Muhammed Topgul
 * on 28/10/2020
 * at 15:13
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "3Series", 2018, 50000L);
        Car car2 = new Car("Mercedes", "Random", 2015, 15000L);
        Car car3 = new Car("Audi", "Cool", 2019, 10000L);
        Car car4 = new Car("Ford", "Focus", 2013, 3000L);

        sortingExample1(car1, car2, car3, car4);
        System.out.println(">>>>>><<<<<<");
        sortingExample2(car1, car2, car3, car4);

    }

    public static void sortingExample1(Car car1, Car car2, Car car3, Car car4) {
        List<Car> carList = Arrays.asList(car1, car2, car3, car4);

        Collections.sort(carList);

        for (Car car : carList) {
            System.out.println(car);
        }
    }

    public static void sortingExample2(Car car1, Car car2, Car car3, Car car4) {
        List<Car> carList = new ArrayList<>(List.of(car1, car2, car3, car4));

        Collections.sort(carList);

        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
