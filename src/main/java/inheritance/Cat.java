package inheritance;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("meowwww");
    }

    public void scratch() {
        System.out.println("Scratching is fun");
    }
}
