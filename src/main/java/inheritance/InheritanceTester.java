package inheritance;

public class InheritanceTester {

    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        Square square = new Square();
        square.setLength(25);
        double perimeter = square.calculatePerimeter();
        System.out.println(perimeter);
    }
}
