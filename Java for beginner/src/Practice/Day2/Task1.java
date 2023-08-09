package src.Practice.Day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество этажей");
        int countFloor = scanner.nextInt();

        if (countFloor >= 1 && countFloor <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (countFloor >= 5 && countFloor <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (countFloor >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Вы ввели некорректное значение");
        }
    }
}
