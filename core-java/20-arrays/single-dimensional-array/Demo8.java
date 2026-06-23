public class Demo8 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        int add = 0, multi = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                multi = multi * arr[i];
            } else {
                add = add + arr[i];
            }
        }

        System.out.println("Addition of odd numbers in array: " + add);
        System.out.println("Multiplication of even numbers in array: " + multi);
    }
}