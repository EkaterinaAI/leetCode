package src.Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = scanner.nextInt();
            if(x != 0) {
                throw new ScannerException("Пользователь ввел что-то кроме 0");
                /* можно погуглить про все классы Exception на docs.oracle.com
                   IOException - input/output Exception
                   Alt+Enter - выбор обработки исключений
                 */
            }
        }
    }
}
