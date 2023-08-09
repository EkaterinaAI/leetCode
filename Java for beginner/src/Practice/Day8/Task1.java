package src.Practice.Day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        long before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            str.append(i).append(" ");
        }

        long after = System.currentTimeMillis();

        System.out.println(str);
        System.out.println("Выполнение цикла с классом StringBuilder: " + (after - before));

        String str1 = "";

        before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            str1 += i + " ";
        }

        after = System.currentTimeMillis();

        System.out.println(str1);
        System.out.println("Выполнение цикла с классом String: " + (after - before));

    }
}
