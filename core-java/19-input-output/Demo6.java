import java.io.*;

public class Demo6 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter the string");
        br.skip(2);
        char ch = (char) br.read();
        String str =  br.readLine();

        System.out.println("characteers:" + ch);
        System.out.println("string:" + str);
    }
}
