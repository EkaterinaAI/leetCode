package src.Algorithms.Fibonachi;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];

        //заполнить массив одинаковыми значениями
        Arrays.fill(mem, -1);

        System.out.println(fibEffective(42));
        System.out.println(fibMemo(42, mem));
        System.out.println(fibNaiv(42));
    }
    //через рекурсию, долго, тк есть дублирование в ходе выполнения
    private static long fibNaiv(int n) {
        if (n <= 1) return n;
        return fibNaiv(n - 1) + fibNaiv(n - 2);
    }

    //через цикл, быстро, без дублирования
    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= n; i++)
            arr[i] = arr[i-1] + arr[i-2];

        return arr[n];
    }

    //через рекурсию с использованием мемоизации (сохранением результатов), быстро
    private static long fibMemo(int n,long[] mem) {
        if (mem[n] != -1)
            return mem[n];

        if (n <= 1)
            return n;

        long result = fibMemo(n-1, mem) + fibMemo(n -2, mem);
        mem[n] = result;

        return result;
    }
}
