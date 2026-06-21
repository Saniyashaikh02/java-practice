public class LogicalAnd {
    public static void main(String[] args){
        int age = 21;
        int weight = 50;
        if(age >= 18 && weight >= 50){
            System.out.println("You are eligible to donate blood");
        }else{
            System.out.println("You are not eligible to donate blood");
        }
    }
    
}
