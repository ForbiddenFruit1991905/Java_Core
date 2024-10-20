package Homework_5.task_from_lection.seminar_tasks;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class task_1 {
   
    public static void main(String[] args) throws IOException {
        /*
        Создать массив из 9 цифр и записать его в файл,
        используя поток вывода.
         */
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        writeToFile(array);
        writeZero(array);
        int[] arr = readFile("src/Homework_5/task_from_lection/seminar_tasks/test1.txt");
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void writeToFile(int[] arr) throws IOException {
        try (FileWriter fileWriter = new FileWriter("src/Homework_5/task_from_lection/seminar_tasks/test.txt")) {
            fileWriter.write(Arrays.toString(arr));
        }
    }

    public static void writeZero(int[] arr) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("0");
        }
        sb.append(arr[arr.length - 1]).append("]");
        try (FileWriter fileWriter = new FileWriter("src/Homework_5/task_from_lection/seminar_tasks/test1.txt")) {
            fileWriter.write(String.valueOf(sb));
        }
    }

    public static int[] readFile(String path) throws IOException {
        ArrayList<Integer> array = new ArrayList<>();
        try (FileReader reader = new FileReader(path)) {
            int n;

            while ((n = reader.read()) != -1) {
                char temp = (char) n;
                if (temp != '0') {

                    try {
                        array.add(Integer.parseInt(String.valueOf(temp)));
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        int[] result = new int[array.size()];
        int index = 0;
        for (Integer integer : array) {
            result[index++] = integer.intValue();
        }
        return result;
    }


}
