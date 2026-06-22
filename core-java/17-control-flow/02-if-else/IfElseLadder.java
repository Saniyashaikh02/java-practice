public class IfElseLadder {
    public static void main(String[] args){
        int speed = 80;
        if(speed >=30){
            System.out.println("slow down");
        }else if(speed >30 || speed <= 60){
            System.out.println("economical speed");
        }else if(speed >60 || speed <= 80){
            System.out.println("fast speed");
        }else{
            System.out.println("very fast speed");
        }
    }
    
}
