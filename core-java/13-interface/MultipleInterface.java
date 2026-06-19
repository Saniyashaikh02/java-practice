interface FirstInterface {

    void myMethod();
}

interface SecondInterface {

    void myOtherMethod();
}

class DemoClass
        implements FirstInterface,
                   SecondInterface {

    public void myMethod() {
        System.out.println("First Interface");
    }

    public void myOtherMethod() {
        System.out.println("Second Interface");
    }
}

public class MultipleInterface {

    public static void main(String[] args) {

        DemoClass obj = new DemoClass();

        obj.myMethod();
        obj.myOtherMethod();
    }
}