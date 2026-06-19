abstract class Animal {

    abstract void sound();

    void sleep() {
        System.out.println("Animal Sleeping");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog Barking");
    }
}

public class InterfaceVsAbstract {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
        dog.sleep();
    }
}