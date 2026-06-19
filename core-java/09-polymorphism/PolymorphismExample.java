class Animal {
    public void animalSound(){
        System.out.println("Animal makes sound");
    }
}
    class Dog extends Animal{
        public void animalSound(){
            System.out.println("Dog says: Barks Barks");
        }
    
}
class Cat extends Animal{
    public void animalSound(){
        System.out.println("Cat says: Meow-Meow");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.animalSound();
        myDog.animalSound();
        myCat.animalSound();
    }
}