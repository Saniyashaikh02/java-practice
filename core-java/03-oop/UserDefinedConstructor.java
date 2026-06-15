public class UserDefinedConstructor {
    int x;
    UserDefinedConstructor() {
        x = 10;
    }   
    public static void main(String[] args) {
        UserDefinedConstructor myObj = new UserDefinedConstructor();
        System.out.println(myObj.x);
    }
    
}
