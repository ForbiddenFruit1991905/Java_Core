package Homework_5.task_from_lection.Homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class task_2 {
    /*
    Предположить, что числа в исходном массиве из 9 элементов имеют диапазон [0,
    3], и представляют собой, например, состояния ячеек поля для игры в крестики-нолики,
    где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3
    – резервное значение. Такое предположение позволит хранить в одном числе типа
    int всё поле 3х3. Записать в файл 9 значений так, чтобы они заняли три байта.
     */
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("field.bin")) {
            Random random = new Random();

            byte[] field = new byte[9];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    field[i * 3 + j] = (byte) random.nextInt(4); // Генерация случайного числа от 0 до 3 и запись в байт
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(field[i * 3 + j] + " ");
                }
                System.out.println();
            }

            fos.write(field); // Запись всех значений в файл
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
