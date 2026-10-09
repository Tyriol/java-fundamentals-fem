package strings;

import java.util.Scanner;

public class TextProcessor {

    private static String userMessage;

    public static void main(String[] args) {
        getText();
        countWords(userMessage);
    }

    public static void getText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give us a phrase to count the words of...");
        userMessage = scanner.nextLine();
        scanner.close();
    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);
    }
}
