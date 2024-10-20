package Homework_5.task_from_lection.seminar_tasks;

import java.io.*;

public class task_3 {

    public static void main(String[] args) throws IOException {
        /*
        Написать программу заменяющую указанный символ в
        текстовом файле на пробел, сохраняющую получившийся текст в
        новый файл.
         */
//        System.out.println(makeString("src/Homework_5/task_from_lection/seminar_tasks/test3.txt"));
        writeFile("src/Homework_5/task_from_lection/seminar_tasks/test3.txt", 'a');
    }

    public static String makeString (String path) throws IOException {
        String string;
        try (BufferedInputStream stream = new BufferedInputStream(new FileInputStream(path))) {
            return new String(stream.readAllBytes());
        }
        }

    public static void writeFile (String path, char exchangeChar) throws IOException {
        String string = makeString(path);
        string = string.replaceAll(String.valueOf(exchangeChar), " ");
        try (FileWriter writer = new FileWriter(path)){
            writer.write(string);
        }
    }
}