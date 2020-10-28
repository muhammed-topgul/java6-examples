package _02_comparator;

/*
 * created by Muhammed Topgul
 * on 28/10/2020
 * at 15:13
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "3Series", 2018, 50000L);
        Car car2 = new Car("Mercedes", "Random", 2015, 15000L);
        Car car3 = new Car("Audi", "Cool", 2019, 10000L);
        Car car4 = new Car("Ford", "Focus", 2013, 3000L);

        List<Car> carList = Arrays.asList(car1, car2, car3, car4);

        // Collections.sort(carList, new CarSortByYear());
        carList.sort(new CarSortByYear());

        for (Car car : carList) {
            System.out.println(car);
        }
    }
}


class CarSortByYear implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}

class CarSortByPrice implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return Long.compare(o1.getPrice(), o2.getPrice());
    }
}