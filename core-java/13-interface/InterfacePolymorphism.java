interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog says: Bark");
    }
}

public class InterfacePolymorphism {

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();
    }
}