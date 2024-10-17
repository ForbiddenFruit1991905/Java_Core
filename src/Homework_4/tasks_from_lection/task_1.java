package Homework_4.tasks_from_lection;

public class task_1 {
    /*
      Напишите два наследника класса Exception: ошибка преобразования строки и
      ошибка преобразования столбца
     */
    public static void main(String[] args) {
        Integer[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Integer[][] matrix2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int expectedSize = 5;
        System.out.println(calcSumMatrix(matrix1, expectedSize));
//        System.out.println(calcSumMatrix(matrix2, expectedSize));

        try {
            calcSumMatrix(matrix2, expectedSize);
        } catch (StringConversionRuntimeException e) {
            System.out.println("Поймана ошибка преобразования строк: не соответствие кол-ва строк \n" + e.getMessage());
        } catch (ColumnConversionRuntimeException e) {
            System.out.println("Поймана ошибка преобразования столбца: не соответствие кол-ва столбцов \n" + e.getMessage());
        }

//        try {
//            throw new StringConversionRuntimeException(expectedSize, 5, "Ошибка преобразования строки");
//        } catch (StringConversionRuntimeException e) {
//            System.out.println("Поймана ошибка преобразования строк: не соответствие кол-ва строк \n" + e.getMessage());
//        } catch (ColumnConversionRuntimeException e) {
//            System.out.println("Поймана ошибка преобразования столбца: не соответствие кол-ва столбцов \n" + e.getMessage());
//        }
    }

    public static class StringConversionRuntimeException extends NumberFormatException {
        public StringConversionRuntimeException(int exp, int curr, String message) {
            if (exp != curr) {
                throw new RuntimeException(String.format("Ошибка преобразования строки: \nКол-во ожидаемых строк должно быть %d, а фактическое количество строк - %d. \n%s", exp, curr, message));
            }
        }
    }

    public static class ColumnConversionRuntimeException extends NumberFormatException {
        public ColumnConversionRuntimeException(int exp_col, int curr_col, String message) {
            if (exp_col != curr_col) {
                throw new RuntimeException(String.format("Ошибка преобразования столбца: Кол-во ожидаемых столбцов должно быть %d, а фактическое количество столбцов - %d. %s", exp_col, curr_col, message));
            }
        }
    }

//    public static class StringConversionRuntimeException extends RuntimeException {
//        public StringConversionRuntimeException(int exp, int curr,String message) {
//            super(String.format("Кол-во ожидаемого числа строк: %d, число фактическое: %d",exp, curr, message));
//        }
//    }
//    /*
//    Разработайте исключения-наследники так, чтобы они информировали
//    пользователя в формате ожидание/реальность
//     */
//    public static class ColumnConversionRuntimeException extends RuntimeException {
//        public ColumnConversionRuntimeException(int exp_col, int curr_col, String message) {
//            super(String.format("Кол-во ожидаемого числа колонок: %d, число фактическое: %d",exp_col, curr_col, message));
//        }
//    }

    /*
    для проверки напишите программу, преобразующую квадратный массив целых чисел 5х5 в сумму
    чисел в этом массиве, при этом, программа должна выбросить исключение, если строк или столбцов в
    исходном массиве окажется не 5.
     */
    
    public static int calcSumMatrix(Integer[][] matrix, int expectedSize) {
        int rowCount = matrix[0].length;
        int colCount = matrix[1].length;
//        int expectedSize = 5;

        if (rowCount != expectedSize || colCount != expectedSize) {
            if (rowCount != expectedSize) {
                throw new StringConversionRuntimeException(expectedSize, rowCount, "Ошибка преобразования строки");
            } else {
                throw new ColumnConversionRuntimeException(expectedSize, colCount, "Ошибка преобразования столбца");
            }
        }

        int result = 0;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                result += matrix[i][j];
            }
        }

        return result;
    }

}
