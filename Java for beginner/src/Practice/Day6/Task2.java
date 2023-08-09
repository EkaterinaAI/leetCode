package src.Practice.Day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("USA", 1990, 30, 12525.4);

        airplane1.setYear(1995);
        airplane1.setLength(36.2);

        airplane1.fillUp(45);
        airplane1.fillUp(23);

        Airplane airplane2 = new Airplane("Russia", 2010, 40, 14578.4);

        airplane1.info();

        Airplane.whatLonger(airplane1, airplane2);

        System.out.println(airplane1);
    }
}
