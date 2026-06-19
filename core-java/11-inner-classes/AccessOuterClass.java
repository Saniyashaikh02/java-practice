class OuterClass {

    int x = 10;

    class InnerClass {

        public int getValue() {

            return x;
        }
    }
}

public class AccessOuterClass {

    public static void main(String[] args) {

        OuterClass outer = new OuterClass();

        OuterClass.InnerClass inner =
                outer.new InnerClass();

        System.out.println(
                inner.getValue());
    }
}