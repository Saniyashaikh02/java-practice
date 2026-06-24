public class Demo8 {
    public static void main(String[] args){
        String s = "amirah";
        String s1 = new String("amirah");
        System.out.println("address od s:" + System.identityHashCode(s));
        System.out.println("address od s1:" + System.identityHashCode(s1));
    }
    }

