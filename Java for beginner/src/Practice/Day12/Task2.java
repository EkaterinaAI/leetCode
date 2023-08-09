package src.Practice.Day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 2; i <= 30; i += 2) {
            numbers.add(i);
        }

        System.out.println(numbers);

        for (int i = 300; i <= 350; i += 2) {
            numbers.add(i);
        }

        System.out.println(numbers);
    }
}
