package Homework_2.src.homework;

public class task_2 {
    /*
    Написать функцию, возвращающую разницу между самым большим и
    самым маленьким элементами переданного не пустого массива.
     */
    public static int diffElements(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
           if (array[i] < min) {
              min = array[i];
           }
           else if (array[i] > max) {
              max = array[i];
            }
        }
        System.out.printf("Минимальный элемент: %d, Максимальный элемент: %d\n", min, max);
        return max - min;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 5, 7, 3};
        System.out.println("Разница между самым большим и самым маленьким элементами: " + diffElements(array));
    }
}
