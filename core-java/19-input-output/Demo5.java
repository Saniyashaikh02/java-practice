import java.io.*;

public class Demo5 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the character");
        char ch = (char) br.read();

        
        System.out.println("enter the string");
        String str =  br.readLine();

        System.out.println("characteers:" + ch);
        System.out.println("string:" + str);
    }
}
