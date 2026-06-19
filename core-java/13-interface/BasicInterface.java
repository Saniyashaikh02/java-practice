interface Animal {

    void animalSound();

    void sleep();
}

class Pig implements Animal {

    public void animalSound() {
        System.out.println("Pig says: Wee Wee");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}

public class BasicInterface {

    public static void main(String[] args) {

        Pig pig = new Pig();

        pig.animalSound();
        pig.sleep();
    }
}