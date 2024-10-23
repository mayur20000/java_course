package BasicsOfJava.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = {-8, -9, -4, -6, 8, 10, 47, 5, 6};
        int ans[] = new int[arr.length];
        int k = 0;
        //negative
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ans[k++] = arr[i];

            }

        }
        // positive
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans[k++] = arr[i];

            }


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + ", ");
        }
    }
}
