package src.Practice.Day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }
        int arrayMax = 0;
        int arrayMin = 10000;

        for(int x : array) {
             if(x > arrayMax) {
                 arrayMax = x;
             }
        }

        /*int max = Arrays.stream(array).max().orElse(0);*/
        System.out.println(arrayMax);

        for(int x : array) {
            if(x < arrayMin) {
                arrayMin = x;
            }
        }
        System.out.println(arrayMin);

        int count0 = 0;
        int sum0 = 0;

        for(int x : array) {
            if (x % 10 == 0) {
                count0++;
                System.out.print(x + " ");
                sum0 += x;
            }
        }
        System.out.println(count0);
        System.out.println(sum0);
    }
}
