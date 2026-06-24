public class Demo14 {
    public static void main(String[] args) {

        String s = new String("Amirah");
        String s1 = new String("Varad");

        System.out.println("Before concat:");
        System.out.println("s = " + s);
        System.out.println("HashCode of s = " + System.identityHashCode(s));

        s = s.concat(s1);

        System.out.println("\nAfter concat:");
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);
        System.out.println("HashCode of s = " + System.identityHashCode(s));
        System.out.println("HashCode of s1 = " + System.identityHashCode(s1));

        String s2 = "Sahil";
        String s3 = "Rohan";

        System.out.println("\nBefore concat:");
        System.out.println("s2 = " + s2);
        System.out.println("HashCode of s2 = " + System.identityHashCode(s2));

        s2 = s2.concat(s3);

        System.out.println("\nAfter concat:");
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("HashCode of s2 = " + System.identityHashCode(s2));
        System.out.println("HashCode of s3 = " + System.identityHashCode(s3));
    }
}