interface Greeting {

    void sayHello();
}

public class AnonymousInterfaceExample {

    public static void main(String[] args) {

        Greeting greet = new Greeting() {

            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        };

        greet.sayHello();
    }
}