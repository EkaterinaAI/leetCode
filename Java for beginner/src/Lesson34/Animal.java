package src.Lesson34;

public class Animal {
    private int id;

    public Animal() {

    }
    public Animal(int id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("I am eating...");
    }
    @Override
    public String toString() {
        return String.valueOf(id); //или так id + "";
    }
}
