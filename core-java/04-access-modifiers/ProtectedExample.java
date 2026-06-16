public class ProtectedExample {

    protected String type = "Mammal";
}

class Dog extends ProtectedExample {

    void show() {
        System.out.println(type);
    }

    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.show();
    }
}