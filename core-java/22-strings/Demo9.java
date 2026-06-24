public class Demo9 {
    public static void main(String[] args){
        String s = new String("varad");
        String s1 = new String("varad");
        System.out.println("address of s:" + System.identityHashCode(s));
        System.out.println("address of s1:" + System.identityHashCode(s1));

    }
}
