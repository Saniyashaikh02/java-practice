class Animal {

    String type = "Mammal";
}

class Dog extends Animal {

}

public class InheritanceVariable {

    public static void main(String[] args) {

        Dog dog = new Dog();

        System.out.println(dog.type);
    }
}