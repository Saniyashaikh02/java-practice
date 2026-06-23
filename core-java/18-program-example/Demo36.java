public class Demo36 {
    public static void main(String[] args){
        Demo36 obj= new Demo36();
        int a = obj.addition(10);
        System.out.println("in main method");
    }
    int addition(int a){
        System.out.println("in fun method" +a);
        return 1;
    }
}
