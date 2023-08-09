package src.Lesson43;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        //использование статич влож класса
        Electrocar.Battery battery = new Electrocar.Battery();
    }
}
