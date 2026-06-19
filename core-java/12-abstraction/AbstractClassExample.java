abstract class Animal {

    abstract void animalSound();

    void sleep() {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {

    @Override
    void animalSound() {
        System.out.println("Dog says: Bark");
    }
}

public class AbstractClassExample {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.animalSound();
        dog.sleep();
    }
}