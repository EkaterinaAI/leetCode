import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CreateFiles {
    public static void main(String[] args) {
        String folderPath = "C:/Катя/git project/hello-world/testStackRybinsk/Задание/Чеки";

        String fileNameAll = "C:/Катя/git project/hello-world/testStackRybinsk/Задание/чеки.txt"; // Путь к файлу

        try {
            List<String> lines = Files.readAllLines(Paths.get(fileNameAll));
            for (String fileName : lines) {
                File file = new File(folderPath, fileName);

                try {
                    if (file.createNewFile()) {
                        System.out.println("Файл '" + fileName + "' успешно создан.");
                    } else {
                        System.out.println("Файл '" + fileName + "' уже существует.");
                    }
                } catch (IOException e) {
                    System.out.println("!!!!!!!!!!!!!!!!!!!!Ошибка при создании файла '" + fileName + "': " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
        // Создание новых файлов в одной папке
        /*String[] fileNames = {"газоснабжение_август.pdf", "газоснабжение_апрель.pdf", "газоснабжение_декабрь.pdf", "газоснабжение_июль.pdf",
                              "газоснабжение_июнь.pdf", "газоснабжение_март.pdf", "газоснабжение_октябрь.pdf", "газоснабжение_сентябрь.pdf",
                              "газоснабжение_февраль.pdf", "газоснабжение_январь.pdf", "ГВС_август.pdf", "ГВС_июнь.pdf", "ГВС_май.pdf",
                              "ГВС_март.pdf", "ГВС_октябрь.pdf", "ГВС_сентябрь.pdf", "ГВС_февраль.pdf", "ГВС_январь.pdf", "домофон_август.pdf",
                              "домофон_апрель.pdf", "домофон_декабрь.pdf", "домофон_июль.pdf","домофон_май.pdf", "домофон_март.pdf",
                              "домофон_ноябрь.pdf", "домофон_октябрь.pdf", "домофон_сентябрь.pdf", "домофон_февраль.pdf", "домофон_январь.pdf",
                              "капремонт_август.pdf", "капремонт_апрель.pdf", "капремонт_декабрь.pdf", "капремонт_июль.pdf", "капремонт_июнь.pdf",
                              "капремонт_март.pdf", "капремонт_ноябрь.pdf", "капремонт_октябрь.pdf", "капремонт_февраль.pdf", "квартплата_август.pdf",
                              "квартплата_апрель.pdf", "квартплата_декабрь.pdf", "квартплата_июль.pdf", "квартплата_июнь.pdf", "квартплата_май.pdf",
                              "квартплата_март.pdf", "квартплата_ноябрь.pdf", "квартплата_октябрь.pdf", "квартплата_сентябрь.pdf", "квартплата_февраль.pdf",
                              "квартплата_январь.pdf", "ТБО_август.pdf", "ТБО_апрель.pdf", "ТБО_декабрь.pdf", "ТБО_июль.pdf", "ТБО_май.pdf", "ТБО_март.pdf",
                              "ТБО_ноябрь.pdf", "ТБО_октябрь.pdf", "ТБО_февраль.pdf", "ТБО_январь.pdf", "теплоснабжение_август.pdf", "теплоснабжение_апрель.pdf",
                              "теплоснабжение_июль.pdf", "теплоснабжение_июнь.pdf", "теплоснабжение_май.pdf", "теплоснабжение_март.pdf",
                              "теплоснабжение_сентябрь.pdf", "теплоснабжение_январь.pdf", "ХВС_август.pdf", "ХВС_декабрь.pdf", "ХВС_июнь.pdf", "ХВС_май.pdf",
                              "ХВС_март.pdf", "ХВС_февраль.pdf", "ХВС_январь.pdf", "электроснабжение_август.pdf", "электроснабжение_апрель.pdf",
                              "электроснабжение_декабрель.pdf", "электроснабжение_июль.pdf", "электроснабжение_июнь.pdf", "электроснабжение_май.pdf",
                              "электроснабжение_март.pdf", "электроснабжение_ноябрь.pdf", "электроснабжение_октябрь.pdf", "электроснабжение_сентябрь.pdf",
                              "электроснабжение_февраль.pdf"};*/

    }
}