// Create an abstract class Animal with an abstract method sound(). Implement it in the Horse subclass and show runtime polymorphism.

abstract class Animal {
    abstract void sound();
}

class Horse extends Animal {
    public void sound() {
        System.out.println("Neigh Neigh");
    }
}

public class AnimalAbstract {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.sound();
    }
}