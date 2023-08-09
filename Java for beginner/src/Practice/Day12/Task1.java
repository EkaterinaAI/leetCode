package src.Practice.Day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("VW");
        cars.add("Toyota");
        cars.add("BMV");
        cars.add("Tesla");

        System.out.println(cars);

        cars.add((cars.size()-1)/2, "Nissan");
//        cars.get(0);
//        cars.get(cars.size()-1);

        System.out.println(cars);

        cars.remove(0);

        System.out.println(cars);
    }
}
