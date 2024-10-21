
package Homework_5.task_from_lection.seminar_tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class task_5 {
    public static void main(String[] args) throws IOException {
        /*
        Написать функцию, добавляющую префикс к каждому из набора
        файлов, названия которых переданы ей в качестве параметров через
        пробел.
        */

        String[] files = {"task2.java", "tester.txt"}; // пример файла в контексте content root
        String contentRoot = "src/Homework_5/task_from_lection/seminar_tasks";

        for (String file : files) {
            Path fileRoot = Paths.get(contentRoot, file);
            if (Files.exists(fileRoot)) {
                try {
                    String prefixedFileName = "pre-" + file;
                    Files.move(fileRoot, Paths.get(contentRoot, prefixedFileName), StandardCopyOption.REPLACE_EXISTING);
                    System.out.printf("Файл '%s' успешно перемещен с добавлением префикса.%n", file);
                } catch (IOException e) {
                    throw new IOException(e);
                }
            } else {
                System.err.printf("Файл '%s' не существует в контексте content root.%n", file);
            }
        }
    }
}

