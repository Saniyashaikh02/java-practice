class OuterClass {

    static class InnerClass {

        int y = 5;
    }
}

public class StaticInnerClass {

    public static void main(String[] args) {

        OuterClass.InnerClass inner =
                new OuterClass.InnerClass();

        System.out.println(inner.y);
    }
}