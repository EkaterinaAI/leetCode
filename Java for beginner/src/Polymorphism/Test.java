package src.Polymorphism;

public class Test {
    public static void main(String[] args) {
        /*Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.eat();
        dog.eat();
        cat.eat();

        System.out.println("-----------------------------------------");

        Animal animal1 = new Animal();
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();

        animal1.eat();
        dog1.eat();
        cat1.eat();

        System.out.println("-----------------------------------------");*/

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);
    }

    public static void test(Animal an) {
        an.eat();
    }
}
