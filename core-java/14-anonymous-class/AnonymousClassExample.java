class Animal {

    public void makeSound() {
        System.out.println("Animal Sound");
    }
}

public class AnonymousClassExample {

    public static void main(String[] args) {

        Animal animal = new Animal() {

            @Override
            public void makeSound() {
                System.out.println("Woof Woof");
            }
        };

        animal.makeSound();
    }
}