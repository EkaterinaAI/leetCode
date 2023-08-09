package src.Exceptions;

public class ScannerException extends Exception {
    public ScannerException(String description) {
        super(description); //передаем description в класс Exception
    }
}
