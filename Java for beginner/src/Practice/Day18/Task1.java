package src.Practice.Day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};

        int[] numbers2 = {1, 10, 1241};
        System.out.println(sum(numbers2, 0));
    }
    public static int sum(int[] numbers, int i) {
        if (i == numbers.length)
            return 0;

        return  numbers[i] + sum(numbers, i +1);
    }
}