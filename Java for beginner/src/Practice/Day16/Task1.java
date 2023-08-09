package src.Practice.Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Practice/Day16/numbers.txt");
        Scanner scanner = new Scanner(file);
        String[] numbers = scanner.nextLine().split(" ");

        double sum = 0;

        for (String number : numbers)
            sum += Integer.parseInt(number);

        /*System.out.println(sum/numbers.length);
        System.out.println(Math.round(sum/numbers.length * 1000.0) / 1000.0);*/
        System.out.printf(sum/numbers.length + " ---> %.3f", sum/numbers.length);
    }
}
