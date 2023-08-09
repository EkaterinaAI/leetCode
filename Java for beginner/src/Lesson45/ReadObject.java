package src.Lesson45;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //тут может возникнуть 2 ошибки
            //если не будет класса Person (надо использовать исключение ClassNotFoundException)
            //метод readObject возвращает объект класса Object, поэтому надо сделать downcasting
            /*Person person1 = (Person)ois.readObject();
            Person person2 = (Person)ois.readObject();

            System.out.println(person1);
            System.out.println(person2);*/

            //считываем массив из объектов: сначала считываем длину массива
            int peopleCount = ois.readInt();
            Person[] people = new Person[peopleCount];
            for (int i = 0; i < peopleCount; i++) {
                people[i] = (Person)ois.readObject();
            }

            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
