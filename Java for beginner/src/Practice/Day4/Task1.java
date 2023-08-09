package src.Practice.Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        Random random = new Random();

        int[] array = new int[arrayLength];

        int countMore8 = 0;
        int countLike1 = 0;
        int countEven = 0;
        int countOdd = 0;
        /*double*/ int allSum = 0;

        for (/*double*/ int x:array) {
            /*x = Math.random() * 10;*/

            x = random.nextInt(10);

            System.out.println(x);
            if(x > 8)
                countMore8++;
            if(x == 1)
                countLike1++;
            if(x % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            allSum += x;
        }
        //еще один способ вывести значения массива

        int[] array1 = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array1[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array1));

        System.out.println("Длина массива: " + arrayLength);
        System.out.println("Количество чисел больше 8: " + countMore8);
        System.out.println("Количество чисел равных 1: " + countLike1);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + allSum);
    }
}
