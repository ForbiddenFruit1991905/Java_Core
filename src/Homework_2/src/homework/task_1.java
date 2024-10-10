package Homework_2.src.homework;

public class task_1 {
    /*
    Написать метод, возвращающий количество чётных элементов массива.
    countEvens([2, 1, 2, 3, 4]) → 3
    countEvens([2, 2, 0]) → 3
    countEvens([1, 3, 5]) → 0
     */

    public static int countEvens(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array0 = new int[]{2, 1, 2, 3, 4};
        System.out.println("Количество чётных элементов массива: " + countEvens(array0));
        int[] array1 = new int[]{2, 2, 0};
        System.out.println("Количество чётных элементов массива: " + countEvens(array1));
        int[] array2 = new int[]{1, 3, 5};

        System.out.println("Количество чётных элементов массива: " + countEvens(array2));
    }
}
