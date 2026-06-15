public class Constructor {
    int x;

public Constructor(){
    x = 10;
}
public static void main(String[] arg){
    Constructor myObj = new Constructor();
    System.out.println(myObj.x);            
}
}