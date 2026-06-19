class OuterClass {

    private class InnerClass {

        int y = 5;
    }

    public void show() {

        InnerClass inner = new InnerClass();

        System.out.println(inner.y);
    }
}

public class PrivateInnerClass {

    public static void main(String[] args) {

        OuterClass outer = new OuterClass();

        outer.show();
    }
}