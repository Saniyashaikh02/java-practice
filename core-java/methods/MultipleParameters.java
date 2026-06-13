public class MultipleParameters {
    static void myMethod(String fname, int age){
        System.out.println(fname + "is" +  age);
    }
    public static void main(String[] args){
        myMethod("niharika", 20);
        myMethod("amirah", 25);
        myMethod("hanshika", 30);
    }
}