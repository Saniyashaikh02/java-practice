public class Demo2 {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {6, 7, 8, 9, 3};

        int arr3[] = new int[arr1.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    arr3[k] = arr1[i];
                    k++;
                }
            }
        }

        System.out.println("Common Elements:");

        for (int i = 0; i < k; i++) {
            System.out.println(arr3[i]);
        }
    }
}