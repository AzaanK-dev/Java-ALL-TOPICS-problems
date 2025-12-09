// Question Statement:
// Create an Animal interface with an abstract method sound(). Implement this interface in a Horse class and demonstrate polymorphism

interface Animal {
    abstract void sound();
}

class Horse implements Animal {
    public void sound() {
        System.out.println("Neigh Neigh");
    }
}

public class AnimalInterface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.sound();
    }
}