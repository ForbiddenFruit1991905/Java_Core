package Homework_5.task_from_lection;

public class task_3 {
    public static void main(String[] args) {
        /*
        Написать метод поиска слова внутри файла.
         */
        String sentence = makeSentence("This is a sample sentence.");
        String wordToFind = "sample";
        String res = findWord(sentence, wordToFind);
        System.out.println(res);
    }

    private static String makeSentence(String text) {
        StringBuilder sentence = new StringBuilder();
        sentence.append(text).append(" This is the end of the sentence.");
        return sentence.toString();
    }

    private static String findWord(String text, String word) {
        StringBuilder currentWord  = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar != ' ') {
                currentWord.append(currentChar);
            } else {
                if (currentWord.toString().equals(word)) {
                    return "word: " + "'" + word + "'" + " is found";
                }
                currentWord = new StringBuilder();
            }
        }
        return "not found";
    }

    
}
