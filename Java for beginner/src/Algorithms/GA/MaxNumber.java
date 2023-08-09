package src.Algorithms.GA;

import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = {3,1,7,9,9,5};
        int[] newArr = new int[6];

        System.out.println(maxNumberFromDigits(arr));

        for (int i = 0; i < newArr.length; i++) {
            int max = -1;
            int maxInd = 0;

            for (int k = 0; k < arr.length; k++) {
                if (arr[k] > max) {
                    max = arr[k];
                    maxInd = k;
                }
            }

            newArr[i] = max;
            arr[maxInd] = 0;
        }

        for(int x :newArr)
            System.out.print(x);
    }

    public static String maxNumberFromDigits(int[] arr) {
        Arrays.sort(arr);

        String result = "";

        for( int i = arr.length - 1; i >= 0; i--)
            result += arr[i];

        return result;
    }
}
