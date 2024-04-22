import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> pdfFileNames = new ArrayList<>();

        // Путь к директории с файлами PDF
        String directoryPath = "C:\\Катя\\git project\\hello-world\\testStackRybinsk\\Задание\\bills";
        String motherPath = "C:\\Катя\\git project\\hello-world\\testStackRybinsk\\Задание\\bills_for_month\\";

        // Получаем список файлов в указанной директории
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        // Добавляем имена файлов PDF в список.
        if (files != null) {
            for (File file : files) {
                if (file.getName().toLowerCase().endsWith(".pdf")) {
                    pdfFileNames.add(file.getName());
                }
            }
        }
        //1. "разложить" файлы по папкам месяцев в формате /месяц/названиефайла

        for (String fileName : pdfFileNames) {
            String temp = fileName.substring(fileName.indexOf('_') + 1, fileName.indexOf('.'));

            String tmpPath = motherPath + temp;
            String tmpPathFile = motherPath + temp + File.separator + fileName;

            try {
                if (Files.exists(Path.of(tmpPath)) && Files.isDirectory(Path.of(tmpPath))) {
                    System.out.println("Директория существует.");
                } else {
                    Files.createDirectory(Path.of(tmpPath));
                    System.out.println("Директория успешно создана.");
                }
                String first = directoryPath + File.separator + fileName;
                Files.copy(Path.of(first), Path.of(tmpPathFile));
                System.out.println("Файл успешно скопирован в " + tmpPath);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}

