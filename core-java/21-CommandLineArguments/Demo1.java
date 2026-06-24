public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);

        if (args.length > 0) {
            System.out.println("First argument: " + args[0]);
        } else {
            System.out.println("No arguments provided.");
        }
    }
}