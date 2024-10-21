package Homework_5.task_from_lection.Homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class task_1 {
    public static void main(String[] args) throws IOException {
        /*
         Написать функцию, создающую резервную копию всех файлов в директории (без
        поддиректорий) во вновь созданную папку ./backup
         */
        createBackup("./Homework_5");
    }

    public static void createBackup(String directoryPath) throws IOException {
        Path backupDir = Paths.get(directoryPath, "backup");
        Files.createDirectories(backupDir);

        for (Path file : Files.list(Paths.get(directoryPath)).toList()) {    // Получает список всех элементов (в данном случае файлов) в указанной директории, представленных в виде объектов типа `Path`. Этот список возвращается в формат List.
            if (Files.isRegularFile(file)) {
                try {
                    Files.copy(file, backupDir.resolve(file.getFileName()));
                    System.out.printf("Создана резервная копия файла: %s%n", file.getFileName());
                } catch (IOException e) {
                    throw new IOException(e);
                }
            }
        }
        System.out.println("Резервные копии файлов успешно созданы в папке 'backup'.");
    }

}
