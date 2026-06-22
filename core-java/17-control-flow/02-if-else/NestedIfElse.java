public class NestedIfElse {
    public static void main(String[] args){
        String uniform = "yes";
        String id = "yes";
        if (uniform=="yes"){
            if(id =="yes"){
                System.out.println("you can enter");
            }else{
                System.out.println("bring id");
            }
        }else{
            System.out.println("you cannot enter");
        }
    }
}
