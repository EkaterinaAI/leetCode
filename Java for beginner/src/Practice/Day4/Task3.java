package src.Practice.Day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random random = new Random();
        for(int i = 0; i < matrix.length; i++) {//идём по строкам
            for (int j = 0; j < matrix[i].length; j++) {//идём по столбцам
                matrix[i][j] = random.nextInt(50);
                System.out.print(" " + matrix[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
        /*System.out.println(Arrays.deepToString(array));*/
        int max = 0;
        int index = 0;

        for(int i = 0; i < matrix.length; i++) {//идём по строкам
        int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {//идём по столбцам
                sum += matrix[i][j];
            }
            System.out.println(sum);
            if (sum >= max) {
                max = sum;
                index = i;
            }
        }
        System.out.println(index);
    }
}
