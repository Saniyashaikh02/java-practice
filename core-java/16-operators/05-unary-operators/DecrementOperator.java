public class DecrementOperator {
    public static void main(String[] args){
        int a = 20;
        int b = --a + a--;
        System.out.print("value of a is " + a);
        System.out.print("value of b is " + b);
    }
}