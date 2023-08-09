package src.Practice.Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();

        File file = new File("src/Practice/Day16/numbers.txt");
        PrintWriter pw = new PrintWriter(file);


        for (int i = 0; i < 1000; i++)
            pw.println(random.nextInt(101));

        pw.close();

        Scanner scanner = new Scanner(file);
        File fileResult = new File("src/Practice/Day16/numbersResult.txt");
        PrintWriter pwResult = new PrintWriter(fileResult);
        int sum = 0;
        int counter = 1;

        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            counter++;

            if (counter == 20) {
                pwResult.println(sum / 20.0);
                sum = 0;
                counter = 0;
            }
        }

        pwResult.close();

        Scanner scannerResult = new Scanner(fileResult);
        double sumResult = 0;

        while (scannerResult.hasNextLine()){
            sumResult += Double.parseDouble(scannerResult.nextLine());
        }
        System.out.println((int)sumResult);

        scanner.close();
    }
}
