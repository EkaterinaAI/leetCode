package src.Practice.Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/Practice/Day14/test");

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();

            String[] numbersString = line.split(" ");

            if (numbersString.length != 10) {
                throw new IllegalArgumentException();
            }

            int sum = 0;
            for (String number : numbersString) {
                sum += Integer.parseInt(number);
            }

            System.out.println(sum);
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
