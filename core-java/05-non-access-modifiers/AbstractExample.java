abstract class Animal {

    abstract void sound();
}

class Dog extends Animal {

    void sound() {
        System.out.println("Bark");
    }
}

public class AbstractExample {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
    }
}