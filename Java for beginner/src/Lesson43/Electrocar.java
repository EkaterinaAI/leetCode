package src.Lesson43;

public class Electrocar {
    private int id;

    //нестатический вложенный класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting...");
        }
    }

    //статический вложенный класс

    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar (int id) {
        this.id = id;
    }

    public void start() {
        //использование подобъектов нестат влож класса
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        //вложенный класс, который находится в методе
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        //применение объектов класса, созданного в методе
        SomeClass someObject = new SomeClass();
        test(someObject);

        System.out.println("Electrocar " + id + " is starting...");
    }

    private void test(Object object) {

    }
}
