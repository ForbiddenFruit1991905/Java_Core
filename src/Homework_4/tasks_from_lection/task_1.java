package Homework_4.tasks_from_lection;

public class task_1 {
    /*
      Напишите два наследника класса Exception: ошибка преобразования строки и
      ошибка преобразования столбца
     */
    public static void main(String[] args) {
        try {
            throw new StringConversionRuntimeException(5, 7, "Ошибка преобразования строки");
        } catch (StringConversionRuntimeException e) {
            System.out.println("Поймана ошибка преобразования строк: не соответствие кол-ва строк \n" + e.getMessage());
        }

        try {
            throw new ColumnConversionRuntimeException(5, 7, "Ошибка преобразования столбца");
        } catch (ColumnConversionRuntimeException e) {
            System.out.println("Поймана ошибка преобразования столбца: не соответствие кол-ва столбцов \n" + e.getMessage());
        }
    }

    public static class StringConversionRuntimeException extends RuntimeException {
        public StringConversionRuntimeException(int exp, int curr,String message) {
            super(String.format("Кол-во ожидаемого числа строк: %d, число фактическое: %d",exp, curr, message));
        }
    }
    /*
    Разработайте исключения-наследники так, чтобы они информировали
    пользователя в формате ожидание/реальность
     */
    public static class ColumnConversionRuntimeException extends RuntimeException {
        public ColumnConversionRuntimeException(int exp_col, int curr_col, String message) {
            super(String.format("Кол-во ожидаемого числа колонок: %d, число фактическое: %d",exp_col, curr_col, message));
        }
    }

    /*
    для проверки напишите программу, преобразующую квадратный массив целых чисел 5х5 в сумму
    чисел в этом массиве, при этом, программа должна выбросить исключение, если строк или столбцов в
    исходном массиве окажется не 5.
     */


}
