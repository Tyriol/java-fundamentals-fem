package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("How many sales?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if(sales >= 10) {
            System.out.println("Well done - smashing it.");
        } else {
            int salesShort = quota - sales;
            System.out.println("You were a litle short this month, you needed " + salesShort + " more.");
        }

        scanner.close();
    }
}
