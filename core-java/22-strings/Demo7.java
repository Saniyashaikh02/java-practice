public class Demo7 {
    public static void main(String[] args){
        String s = "amirah";
        String s1 ="amirah";
        System.err.println("adress of s:" + System.identityHashCode(s));
        System.err.println("adress of s:" + System.identityHashCode(s1));
    }
}
