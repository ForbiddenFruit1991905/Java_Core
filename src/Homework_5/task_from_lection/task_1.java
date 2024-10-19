package Homework_5.task_from_lection;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task_1 {
    public static void main(String[] args) {
        /*
        Создать пару-тройку текстовых файлов. Для упрощения (чтобы не разбираться с кодировками) внутри
        файлов следует писать текст только латинскими буквами.
         */
        
        String textString = "This is an example text written using String.";
        StringBuilder textBuilder = new StringBuilder("This is an example text written using StringBuilder.");
        String sentence = makeSentence("This is a sample sentence.");
        writeFile("exampleString.txt", textString);
        writeFile("exampleStringBuilder.txt", textBuilder.toString());
        writeFile("exampleSentence.txt", sentence);
    }
    
    private static String makeSentence(String text) {
        StringBuilder sentence = new StringBuilder();
        sentence.append(text).append(" This is the end of the sentence.");
        return sentence.toString();
    }
        
    public static void writeFile(String filename, String content) {
        File file = new File(filename);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
            System.out.println("File " + filename + " has been created.");
        } catch (IOException ex) {
            System.err.println("An error occurred while writing to the file: " + ex.getMessage());
        }
    }
}
