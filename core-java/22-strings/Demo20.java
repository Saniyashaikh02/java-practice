public class Demo20 {
    public static void main(String[] args){
        String s = new String("hello");
        System.out.println(System.identityHashCode(s));
        s.concat("world");
        System.out.println(System.identityHashCode(s));
        System.out.println(s);

        StringBuffer sb = new StringBuffer("hello");
        System.out.println(System.identityHashCode(sb));
        sb.append("world");
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb);
    }

}
