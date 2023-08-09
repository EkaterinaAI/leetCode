package src.Lesson45;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");
        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Tom")};

        //чтобы сериализовать эти объекты надо создать объект класса FileOutputStream (преобразует в последовательность байтов)
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            //расширение может быть любым, но для бинарных данных - лучше bin
            //чтобы записать объекты надо создать еще один объект класса ObjectOutputStream
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //запись объектов в файл
           /* oos.writeObject(person1);
            oos.writeObject(person2);*/

            //запись массива из объектов в файл
            //записываем в файл число - длину массива
            oos.writeInt(people.length);
            //записываем объекты
            for (Person person : people) {
                oos.writeObject(person);
            }

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
