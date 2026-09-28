package decision_structure;

import java.util.Scanner;

public class GradeMessageExpression {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();
        scanner.close();

        String message = switch(grade) {
            case "A" -> "Excellent Job";
            case "B" -> "Good job";
            case "C"->  "About average";
            case "D" -> "Do better next time";
            case "F"-> "You've failed this time, but you can do better I know it!";
            default -> "That isn't an accepted grade";
        };

        System.out.println(message);
    }
}
