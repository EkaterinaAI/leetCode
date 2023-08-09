package src.Practice.Day14;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjectList());
    }

    public static List<Person> parseFileToObjectList () {
        File file = new File("src/Practice/Day14/people");
        List<Person> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] personArray = line.split(" ");

                if (Integer.parseInt(personArray[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                Person person = new Person(personArray[0], Integer.parseInt(personArray[1]));

                people.add(person);
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
