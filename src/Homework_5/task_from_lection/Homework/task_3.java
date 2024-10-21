package Homework_5.task_from_lection.Homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class task_3 {
    /*
    Прочитать числа из файла, полученного в результате выполнения задания 2.
     */
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("field.bin")) {
            byte[] buffer = new byte[9];
            fis.read(buffer); // Чтение байтов из файла в буфер

            System.out.println("Числа из файла field.bin:");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(buffer[i * 3 + j] + " "); // Вывод чисел в виде матрицы 3x3
                }
                System.out.println();
            }

//            for (byte b : buffer) {                  // Вывод в строку через пробел
//                System.out.print(b + " ");
//            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
