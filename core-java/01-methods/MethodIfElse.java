public class MethodIfElse {
    static void checkAge(int age){
        System.out.println(age);
    
    if(age < 18){
        System.out.println("you are not eligible to vote!");
    } else {
        System.out.println("you are eligible to vote!");
    }
    }
public static void main(String[] args){
    checkAge(20);
}
}


