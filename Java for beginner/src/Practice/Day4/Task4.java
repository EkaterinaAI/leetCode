package src.Practice.Day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        System.out.println(Arrays.toString(array));

        int maxSum = 0;
        int index = 0;
        /*int maxSum1 = 0;
        int index1 = 0;*/

        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            /*int sum1 = 0;*/
            sum = array[i] + array[i + 1] + array[i + 2];
            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
            /*for (int j = i; j < i + 3; j++) {
                sum1 += array[j];
            }
            if (sum1 > maxSum1) {
                maxSum1 = sum;
                index1 = i;
            }*/
        }

        System.out.println(maxSum);
        System.out.println(index);
        /*System.out.println(maxSum1);
        System.out.println(index1);*/
    }
}
