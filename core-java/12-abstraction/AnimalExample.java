abstract class Animal {

    abstract void animalSound();
}

class Dog extends Animal {

    void animalSound() {
        System.out.println("Dog says: Bark");
    }
}

class Cat extends Animal {

    void animalSound() {
        System.out.println("Cat says: Meow");
    }
}

public class AnimalExample {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.animalSound();
        cat.animalSound();
    }
}