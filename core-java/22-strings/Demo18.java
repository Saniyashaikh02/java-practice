public class Demo18 {
    public static void main(String[] args) {

        char arr[] = {'a', 'm', 'i', 'r', 'a', 'h'};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (arr[i] - 32);
        }

        String s = new String(arr);

        System.out.println(s);
    }
}