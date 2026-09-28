package repitition_structure;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do{
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the next number");
            double num2 = scanner.nextDouble();

            System.out.println("Sum: " +  (num1 + num2));

            System.out.println("Go again?");
            again = scanner.nextBoolean();
        } while (again);

        scanner.close();
    }
}
