public class Demo39 {
    public static void main(String[] args){
        int a = Demo39.add(10,20);
        int b = Demo39.sub(10,20);
        int c = Demo39.div(10,20);
        int d = Demo39.multi(10,20);
        System.out.println("Add=" + a + ", Sub=" + b + ", Div=" + c + ", Mul=" + d);
    }
    static int add(int a, int b){
        return (a + b);
    }
    static int sub(int a, int b){
        return (a - b);
    }
    static int div(int a, int b){
        return (a / b);
    }
    static int multi(int a, int b){
        return (a * b);
}
}

