package src.Practice.Day18;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
//        String number1 = s.nextLine();

//        String[] numArray = number1.split("");

        int number = s.nextInt();
        System.out.println(count7(number));
    }

    /*public static int count7(String[] number, int i) {
        if (i == number.length)
            return 0;
        return number[i].equals("7") ? 1 + count7(number, i + 1) : 0 + count7(number, i + 1);
    }
//        if (number.length() == 0) {
//            return 0;
//        }else if (number.charAt(0) == '7') {
//            return 1 + count7(number.substring(1));
//        } else {
//            return count7(number.substring(1));
//        }
    }*/

    public static int count7(int number) {
        if (number == 0)
            return 0;
        if (number % 10 == 7){
            return 1 + count7(number/10);
        } else {
            return count7(number/10);
        }
    }
}