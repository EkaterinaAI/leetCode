package src.Lesson34;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        test(listOfAnimals);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfDogs); // если не использовать wildcards, то работать не будет, тк метод ждет тип Animal, а передаем Dog (из-за List полиморфизм не работает)
                          //private static void test(List<Animal> list) {

    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            //System.out.println(animal); //по умолчанию выполнится медот toString, поэтому его надо переопределить в классе Animal
            animal.eat();
        }

        /*list.forEach(animal -> {
            System.out.println(animal);
        });*/
    }
}
