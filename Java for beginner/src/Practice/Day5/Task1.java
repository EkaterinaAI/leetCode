package src.Practice.Day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setColor("blue");
        car.setYear(1995);
        car.setModel("VW");

        System.out.println(car.getColor());
        System.out.println(car.getYear());
        System.out.println(car.getModel());
        car.textInfo();
        System.out.println(car.substractYear(2020));

        Moto moto = new Moto(2000, "audi", "black");

        System.out.println(moto.getColor());
        System.out.println(moto.getYear());
        System.out.println(moto.getModel());
        moto.textInfo();
        System.out.println(moto.substractYear(2020));
    }
}
