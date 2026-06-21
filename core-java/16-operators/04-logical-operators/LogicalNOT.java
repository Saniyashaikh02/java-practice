public class LogicalNOT{
    public static void main(String[] args){
        int balance = 10000;
        int bill = 20000;

        if(!(balance > bill)){
            System.out.println("You cannot pay the bill");
        }else{
            System.out.println("You can pay the bill");
        }
    }
}