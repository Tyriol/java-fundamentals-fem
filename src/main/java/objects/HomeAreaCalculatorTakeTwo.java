package objects;

import java.util.Scanner;

public class HomeAreaCalculatorTakeTwo {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorTakeTwo calculator = new HomeAreaCalculatorTakeTwo();
        Rectangle roomOne = calculator.getRoom("roomOne");
        Rectangle roomTwo = calculator.getRoom("roomTwo");

        double totalRoomArea = calculator.getTotalRoomArea(roomOne, roomTwo);

        System.out.println("The total area of both rooms is: " + totalRoomArea);
    }

    public Rectangle getRoom(String roomNum) {
        System.out.println("Let's calculate the area of " + roomNum);
        System.out.println("Enter the length of the room:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double getTotalRoomArea(Rectangle room1, Rectangle room2) {
        return room1.calculateArea() + room2.calculateArea();
    }
}
