package src.Practice.Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("files/shoes.csv");
        Scanner scanner = new Scanner(file);

        File fileEndShoes = new File("files/endShoes");
        PrintWriter pw = new PrintWriter(fileEndShoes);

        while (scanner.hasNextLine()) {
            String[] info = scanner.nextLine().split(";");
            if(Integer.parseInt(info[2]) == 0) {
                pw.println(Arrays.toString(info));
            }
        }

        scanner.close();
        pw.close();
    }
}
