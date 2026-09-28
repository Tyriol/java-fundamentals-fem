package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();
        scanner.close();

        String message;

        switch(grade) {
            case "A":
                message = "Excellent Job";
                break;
            case "B":
                message = "Good job";
                break;
            case "C":
                message = "About average";
                break;
            case "D":
                message = "Do better next time";
                break;
            case "F":
                message = "You've failed this time, but you can do better I know it!";
                break;
            default:
                message = "That isn't an accepted grade";
        }

        System.out.println(message);
    }
}
