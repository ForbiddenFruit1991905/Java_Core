package homework;

public class task_3 {
    /*
    Написать функцию, возвращающую истину, если в переданном
    массиве есть два соседних элемента, с нулевым значением.
     */
    public static boolean findDoubleZero(int[] array) {
        int count = 0;
        if (true) {
            for (int i = 0; i < array.length; i++) {
                if ((array[i] == 0 && (array[i - 1] == 0 || array[i + 1] == 0))) {
                    count++;
                } else if (array[i] == 0) {
                     count = 1;
                }
            }
            System.out.println(count);
        }
        if (count >= 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 0, 0, 7, 3};
        int[] array2 = new int[]{1, 0, 3, 7, 3};
        int[] array3 = new int[]{1, 9, 3, 7, 3};
        System.out.println(findDoubleZero(array1));
        System.out.println(findDoubleZero(array2));
        System.out.println(findDoubleZero(array3));
    }
}
