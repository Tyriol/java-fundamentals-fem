package objects;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        Rectangle roomOne = new Rectangle();
        roomOne.setLength(50);
        roomOne.setWidth(25);

        double areaRoomOne = roomOne.calculateArea();

        Rectangle roomTwo = new Rectangle(30, 75);
        double areaRoomTwo = roomTwo.calculateArea();

        double totalRoomArea = areaRoomOne + areaRoomTwo;

        System.out.println("The total area is: " + totalRoomArea);
    }
}
