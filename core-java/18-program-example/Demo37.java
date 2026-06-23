public class Demo37 {
    public static void main(String[] args) {

        Demo37 obj = new Demo37();

        char ch = 'a';

        int a = obj.addition(ch);

        System.out.println("in main method");
    }

    int addition(int b) {
        System.out.println("in fun method " + b);
        return 1;
    }
}