package lect10;
abstract class Animal {
    abstract void eat();

    void walk() {
        System.out.println("🐾 Animal walks");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("🍔 Dog eats");
    }
}

public class Main {
    public static void main(String[] args) {
    Animal ref = new Animal();
        ref.eat();
        ref.walk();
    }
}

