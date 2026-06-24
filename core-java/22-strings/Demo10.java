public class Demo10 {
    public static void main(String[] args){
        String s = "data";
        String s1 = "base";
        
        System.out.println("address of s:" + System.identityHashCode(s));
        s = s+s1;
        System.out.println("address of s1:" + System.identityHashCode(s1));
        System.out.println(s);
    }
}
