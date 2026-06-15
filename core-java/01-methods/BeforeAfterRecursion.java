public class BeforeAfterRecursion {

    static void show(int n) {

        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        show(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        show(3);
    }
}