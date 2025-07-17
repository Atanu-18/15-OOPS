abstract class Animal {

    // abstract void walk() {

    // }
    abstract void walk();

    //constructor
    Animal() {
        System.out.println("You are creating animal");
    }

    public void eat() {
        System.out.println("animal eats");
    }
}

class Horse extends Animal {
    //constructor  - chaining
    Horse() {
        System.out.println("You are creating Horse");
    }
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class Abstractions {
    public static void main(String[] args) {
        Horse horse = new Horse();
        // horse.walk();
        // horse.eat();

        // Chicken ch = new Chicken();
        // ch.walk();
    }
}