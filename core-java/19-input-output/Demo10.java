import java.io.*;

public class Demo10 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of terms: ");

        int num = Integer.parseInt(br.readLine());

        int current = 0;
        int next = 1;

        for (int i = 1; i <= num; i++) {
            System.out.print(current + " ");

            int temp = current + next;
            current = next;
            next = temp;
        }
    }
}