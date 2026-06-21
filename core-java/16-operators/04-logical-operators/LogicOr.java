public class LogicOr{
    public static void main(String[] args){
        int rupees = 10000;
        if(rupees > 1 || rupees < 10000){
            System.out.println("You can buy a phone");
        }else{
            System.out.println("You cannot buy a phone");
        }
    }
}