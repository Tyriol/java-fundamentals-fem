package strings;

import java.util.Scanner;

public class TextProcessor {

    private static String userMessage;

    public static void main(String[] args) {
        getText();
        countWords(userMessage);
        reverseString(userMessage);
    }

    public static void getText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give us a phrase or word...");
        userMessage = scanner.nextLine();
        scanner.close();
    }

    public static void reverseString (String text) {
        for (int i = text.length() - 1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);
    }
}
