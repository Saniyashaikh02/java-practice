public class Demo11 {
    public static void main(String[] args){
        String s = "varad";
        System.out.println("before update addess of s:" + System.identityHashCode(s));
         System.out.println("string before concat:" + s);
         s=s.concat("sahil");
         System.out.println("string after concat:" + s);
          System.out.println("after update addess of s:" + System.identityHashCode(s));
    }
}
