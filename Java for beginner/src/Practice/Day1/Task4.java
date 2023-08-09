package src.Practice.Day1;

public class Task4 {
    public static void main(String[] args) {
        int age = 23;

        /*while (age <= 100) {
            age += 5;
        }*/

        for(int i = age; i <= 100; i += 5) {
            System.out.println("Мой возраст: " + i);
        }
    }
}
