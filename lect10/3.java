class Animal {
    static void eat() {
        System.out.println("🥬 Animal eats");
    }

    void wolk() {
        System.out.println("🐾 Animal wolks");
    }
}

class Dog extends Animal {
    static void eat() {
        System.out.println("🍔 Dog eats");
    }
    void wolk() {
        System.out.println("🐶 Dog wolks");
    }
}

class three {
    public static void main(String[] args) {
        Animal ref = new Dog();

        Animal.eat();
        Dog.eat();
        ref.wolk();
    }
}

