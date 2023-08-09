package src.Practice.Day6;

public class Airplane {
    private String maker;
    private int year;
    private double length;
    private double weight;
    private double volumeFuel;

    public Airplane(String maker, int year, double length, double weight) {
        this.maker = maker;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.volumeFuel = 0;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void info() {
        System.out.println("Изготовитель: " + maker + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + volumeFuel);
    }

    public void fillUp (double volumeFuelNew) {
        volumeFuel += volumeFuelNew;
    }

    public static void whatLonger(Airplane air1, Airplane air2) {
        if (air1.length > air2.length) {
            System.out.println("Первый самолет длиннее, производитель " + air1.maker + ", год " + air1.year);
        } else if (air1.length < air2.length) {
            System.out.println("Второй самолет длиннее, производитель " + air2.maker + ", год " + air2.year);
        } else {
            System.out.println("У самолетов одинаковая длина");
        }
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "maker='" + maker + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", weight=" + weight +
                ", volumeFuel=" + volumeFuel +
                '}';
    }
}
