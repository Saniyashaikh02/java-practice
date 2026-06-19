class Animal {

    void eat() {
        System.out.println("Animal Eats");
    }
}

class Dog extends Animal {

}

class Cat extends Animal {

}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        c.eat();
    }
}