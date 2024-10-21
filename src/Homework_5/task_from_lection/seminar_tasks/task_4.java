package Homework_5.task_from_lection.seminar_tasks;

import java.io.File;

public class task_4 {
    public static void main(String[] args) {
        /*
        Написать программу, читающую и
        выводящую в содержимое текущей папки.
         */
        // Вар.1
//        String currentDir = System.getProperty("user.dir"); // Получение текущей директории и сохранение пути в переменную currentDir.
//        File directory = new File(currentDir); // Создание объекта directory класса File, представляющего текущую директорию.
        // Вар.2 для Java
//        String currentDir = System.getProperty("user.dir"); // Получение текущей директории и сохранение пути в переменную currentDir.
//        String targetDirPath = currentDir + File.separator + "src" + File.separator + "Homework_5" + File.separator + "task_from_lection" + File.separator + "seminar_tasks";
//        File directory = new File(targetDirPath); // Создание объекта directory класса File, представляющего целевую директорию.
//        File[] fileList = directory.listFiles(); // Получение массива файлов и папок в целевой директории и сохранение их в массив fileList.
//
//        if (fileList != null) {
//            for (File file : fileList) {
//                System.out.println(file.getName());
//            }
        String currentDir = System.getProperty("user.dir"); // Получение текущей директории и сохранение пути в переменную currentDir.
        final File[] fileList = getFiles(currentDir);

        if (fileList != null) {
            for (File file : fileList) {
                System.out.println(file.getName());
            }
        }
    }

    private static File[] getFiles(String currentDir) {
        String targetDirPath = currentDir + File.separator + "src" + File.separator + "Homework_5" + File.separator + "task_from_lection" + File.separator + "seminar_tasks";
        // `File.separator` - это системно-специфичный разделитель для файловых путей, который используется для разделения иерархии каталогов
        File directory = new File(targetDirPath); // Создание объекта directory класса File, представляющего целевую директорию.
        File[] fileList = directory.listFiles(); // Получение массива файлов и папок в текущей директории и сохранение их в массив fileList.
        return fileList;
    }
    
}
