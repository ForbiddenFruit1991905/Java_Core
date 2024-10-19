package Homework_5.task_from_lection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static Homework_5.task_from_lection.task_1.writeFile;

public class task_2 {
    public static void main(String[] args) {
        /*
        Написать метод, осуществляющий конкатенацию (соединение) переданных ей в качестве параметров
        файлов (не особенно важно, в первый допишется второй или во второй первый, или файлы вовсе
        объединятся в какой-то третий)
         */
        String textBuilder1 = makeSentence("This is the first example text written using StringBuilder.");
        StringBuilder textBuilder2 = new StringBuilder(makeSentence("This is the second example text written using StringBuilder."));
        String concatenated = joinSentences(textBuilder1, String.valueOf(textBuilder2));
        writeFile("exampleJoinSentences.txt", concatenated);
        readFile("exampleJoinSentences.txt");
    }

    private static String makeSentence(String text) {
        StringBuilder sentence = new StringBuilder();
        sentence.append(text).append(" This is the end of the sentence.");
        return sentence.toString();
    }

    private static String joinSentences(String text1, String text2) {
        StringBuilder concatenated = new StringBuilder();
        concatenated.append(text1).append("\n").append(text2);

        return concatenated.toString();
    }

    public static void readFile(String filename) {
        File file = new File(filename);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.err.println("An error occurred while reading the file: " + ex.getMessage());
        }
    }
}
