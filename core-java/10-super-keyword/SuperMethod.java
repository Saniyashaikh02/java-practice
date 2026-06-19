class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog Barks");
    }

    void display() {

        sound();

        super.sound();
    }
}

public class SuperMethod {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.display();
    }
}