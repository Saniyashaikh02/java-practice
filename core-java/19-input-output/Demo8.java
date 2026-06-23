import java.io.*;

public class Demo8 {
    public static void main(String[] args) throws IOException {

        int count = 0;

        for (int i = 1; i <= 5; i++) {
            if (5 % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("5 is prime");
        } else {
            System.out.println("5 is not prime");
        }
    }
}