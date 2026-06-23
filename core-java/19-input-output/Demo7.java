import java.io.*;
public class Demo7 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int ch = Integer.parseInt(str);
        if(ch%2==0){
        System.out.println("even");
    }else{
        System.out.println("odd");
    }
}
}
