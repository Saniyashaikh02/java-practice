public class ProtectedInheritance {

    protected void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends ProtectedInheritance {

    void bark() {
        sound();
    }

    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.bark();
    }
}