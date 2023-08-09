package src.Practice.Day14;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseLineToStringList());
    }

    public static List<String> parseLineToStringList () {
        File file = new File("src/Practice/Day14/people");

        try {
            Scanner scanner = new Scanner(file);
            List<String> people = new ArrayList<>();

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                people.add(line);
            }

            return people;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
