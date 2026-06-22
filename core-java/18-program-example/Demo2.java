public class Demo2 {
    public static void main(String[] args){
        int attendance = 75;
        int marks = 75;
        if(attendance >=75){
            if(marks >= 75){
                System.out.println("A");

            }else if(marks >= 60 || marks <85){
                System.out.println("B");
            }
        }else {
            System.out.println("apman" + "default");
        }
    }
}
